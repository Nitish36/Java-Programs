package practice;

import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAno
{
	String str();
	int val();
}

public class Retentions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RetentionPolicy.RUNTIME.getClass());
		
	}

}
