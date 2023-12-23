package practice;

public class Student {
	
	String Name;
	String city;
	int age;
	
	public Student(String Name,String city,int age)
	{
		this.Name = Name;
		this.city = city;
		this.age = age;
	}
	public String toString()
	{
		return Name+" "+city+" "+age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =  new Student("Raj","Bangalore",21);
		Student s2 = new Student("Verma","Bombay",22);
		System.out.println(s1);
		System.out.println(s2);
	}
}
