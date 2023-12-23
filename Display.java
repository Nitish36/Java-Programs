package practice;
interface disp
{
    default void display()
    {
        System.out.println("In default display");
    }
}
class comp implements disp
{
	@Override
	public void display() {
		System.out.println(super.toString());
		System.out.println("In overidden display");
		disp.super.display();
	}
}
public class Display {

	public static void main(String[] args) {
		comp p = new comp();
		p.display();
	}

}
