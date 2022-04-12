package enumeration;
public class Seasons
{
	public enum Season{SPRING(5),SUMMER(10),MONSOON(15),AUTUMN(20),FALL(25),WINTER(30);
	private int value;
	private Season(int value)
	{
		this.value=value;
	}}
	public static void main(String[]args)
	{
		System.out.println("== Using values function ==");
		for(Season s:Season.values())
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("== Using valueOf function ==");
		System.out.println();
		System.out.println("ValueOf SPRING: "+Season.valueOf("SPRING"));
		System.out.println("ValueOf SUMMER: "+Season.valueOf("SUMMER"));
		System.out.println("ValueOf MONSOON: "+Season.valueOf("MONSOON"));
		System.out.println();
		System.out.println("== Using ordinal function ==");
		System.out.println("ValueOf Autumn: "+Season.valueOf("AUTUMN").ordinal());
		System.out.println("ValueOf FALL: "+Season.valueOf("FALL").ordinal());
		System.out.println("ValueOf WINTER: "+Season.valueOf("WINTER").ordinal());
		System.out.println();
		System.out.println("To print the values associated with seasone");
		System.out.println("Season ==> Value");
		for(Season s:Season.values())
		{
			System.out.print(s+"==>"+s.value);
			System.out.println();
		}
		Season s=Season.SPRING;
		switch(s)
		{
			case SPRING:System.out.println("Spring");break;
			case SUMMER:System.out.println("Summer");break;
			default: System.out.println("Invalid Season");
		}
		System.out.println();
		System.out.println("Importing Days from another class");
		Day d=Day.MORNING;
		System.out.println("Day is : "+d);
		Day e=Day.NIGHT;
		System.out.println("Night is: "+e);
	}
}