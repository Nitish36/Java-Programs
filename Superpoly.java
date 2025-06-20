package practice;

class Animal{
	public void Weight() {
		System.out.println("Weight: 60Kg");
	}
	public void Color() {
		System.out.println("Color: Brown");
	}
}

class Cow extends Animal{
	public void Weight() {
		super.Color();
		super.Weight();
		System.out.println("Weight: 55Kg");
		
	}
}
public class Superpoly  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow sp = new Cow();
		sp.Weight();
		
	}

}
