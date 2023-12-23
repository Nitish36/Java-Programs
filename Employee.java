package practice;
class Employeer
{
	final String PanCardNumber;
	public Employeer(String PanCardNumber)
	{
		this.PanCardNumber = PanCardNumber;
	}
	public void getPancard()
	{
		System.out.println(PanCardNumber);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeer obj = new Employeer("ABC12345");
		obj.getPancard();
	}

}
