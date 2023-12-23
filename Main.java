package practice;

public class Main {

	public static void autoboxing(String i)
	{
		Integer b = Integer.valueOf(i);
		System.out.println("boxing "+b);
	}
	private static void unboxing(int i) {
		// TODO Auto-generated method stub
		System.out.println("Unboxing "+i);
	}
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub=
		autoboxing(args[0]);
		unboxing(new Integer(10));
		System.out.println(Integer.toBinaryString(1000));
		System.out.println(Integer.MAX_VALUE);
		Integer iob =10;
		Double dob = 10.2;
		
		dob = dob+iob;
		System.out.println(dob);
	}

}
