package practice;
import java.lang.annotation.*;
@SuppressWarnings("unused")
interface ex
{
	void display();
	default void display1()
	{
		System.out.println("In display1");
	}
}
class exp implements ex
{
	@Override
	public void display()
	{
		System.out.println("In overidden function display1");
	}
}
public class Annotations{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp e = new exp();
		e.display1();
		e.display();		
	}
}