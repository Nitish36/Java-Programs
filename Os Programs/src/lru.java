import java.util.*;
class frame
{
	public  int pagenumber = -1;
	public  int lastaccesstime = -1;
	public void replaceframe(int pagenumber,int lastaccesstime)
	{
		this.pagenumber = pagenumber;
		this.lastaccesstime = lastaccesstime;
	}
	public void refreshframe(int lastaccesstime)
	{
		this.lastaccesstime = lastaccesstime;
	}
}
public class lru {
	
	public static int nF;
	public static frame cache[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("...Enter the no of page requests...");
		int nR = sc.nextInt();
		System.out.println();
		int pnumber[] = new int[nR];
		System.out.println("...Enter the page requests...");
		for(int i = 0;i<nR;i++)
		{
			pnumber[i] = sc.nextInt();
		}
		System.out.println("Enter the no of frames");
		nF = sc.nextInt();
		cache = new frame[nF];
		System.out.println("Enter the frames");
		for(int i=0;i<nF;i++)
		{
			cache[i] = new frame();
		}
		int hit=0,fault=0;
		for(int i=0;i<nR;i++)
		{
			int index = findpagenumber(pnumber[i]);
			if(index!=-1)
			{
				hit++;
				cache[index].refreshframe(i);
			}
			else
			{
				fault=fault+1;
				int temp = getlruindex();
				cache[temp].replaceframe(pnumber[i],i);
			}
			cacheprint();
		}
		System.out.println("Hit : "+hit);
		System.out.println("False: "+fault);
		sc.close();
	}
	public static int findpagenumber(int pn)
	{
		for(int i=0;i<nF;i++)
		{
			if(pn == cache[i].pagenumber)
			{
				return i;
			}
		}
		return -1;
	}
	public static int getlruindex()
	{
		int min = cache[0].lastaccesstime;
		int index=0;
		for(int i=0;i<nF;i++)
		{
			if(cache[i].lastaccesstime<min) 
			{
				min = cache[i].lastaccesstime;
				index = i;
			}
		}
		return index;
	}
	public static void cacheprint()
	{
		for(int i=0;i<nF;i++)
		{
			System.out.print(cache[i].pagenumber+" ");
		}
		System.out.println();
	}
}
