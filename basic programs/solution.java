/*Write a function int solution(int A[],int N); that given an array A consisting of N integers, returns the maximum among all one digit integers For example 
given an array A as follows [-6,-91,0,10011,-100,84,0,1,473] the function should return 1*/

public class solution
{
    static int solution(int A[],int N)
    {
        int c=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0 && A[i]<10)
            {
                c = Math.max(A[i],c);
               
            }
        }
        return c;
    }
	public static void main(String[] args) {
		int A[] = {1,2,3,4,5,6};
		int N=9;
		System.out.println(solution(A,N));
	}
}
