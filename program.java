package practice;

class Car{
	private String model;
	public void getModel() {
		System.out.println("The Car model is "+model);
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void features(String color) {
		System.out.println("The Car color is "+color);
	}
}

public class program extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program myCar = new program();
		myCar.setModel("Ford");
		myCar.getModel();
		myCar.features("Sky Blue");
		
	}

}
