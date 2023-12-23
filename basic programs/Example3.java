package stringbuilder;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("hello");
		sb.replace(1, 3, "Java");
		System.out.println(sb);
	}
}