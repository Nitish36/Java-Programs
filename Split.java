package practice;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array = "This@is@a@String@which@will@be@splitted";
		
		String [] splitted =array.split("@", 10);
		
		for(String i : splitted)
		{
			System.out.println(i);
		}
	}
}