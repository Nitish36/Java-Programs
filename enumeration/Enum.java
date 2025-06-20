package practice;
import java.io.*;
public class Enum {
	
	enum Status{
		PENDING,INPROGRESS,DONE
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int stautscode = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the statuscode");
		System.out.println("-1 Pending");
		System.out.println("0  Inprogress");
		System.out.println("1 Done");
		stautscode = Integer.parseInt(br.readLine());
		if(stautscode == -1){
			Status myVar = Status.PENDING;
			System.out.println(myVar);
		}
		if(stautscode == 0){
			Status myVar = Status.INPROGRESS;
			System.out.println(myVar);
		}
		if(stautscode == 1){
			Status myVar = Status.DONE;
			System.out.println(myVar);
		}
	}

}
