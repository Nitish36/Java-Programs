package practice;

abstract class Automobile{
	abstract void color();
	abstract void engine();
	public void run() {
		System.out.println("Rrrrrr");
	}
}

public class Abstraction extends Automobile {
	
	public void color() {
		System.out.println("Color : Navy Blue");
	}
	public void engine() {
		System.out.println("Engine : V2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction myobj = new Abstraction();
		myobj.color();
		myobj.engine();
		myobj.run();
		
	}

}
