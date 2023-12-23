package practice;

class Aaaa
{
	@Override
	public String toString() 
	{	
		return "in class A";
	}
}
public class StringConversion {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Dummy String";
		System.out.println(s.valueOf(new Aaaa())); //public static String valueof(Object c); // instance level of overloaded functions
	}
}//it is possible to have negative index