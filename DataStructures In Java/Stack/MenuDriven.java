package stack;
import java.util.*;
public class MenuDriven {
	
	
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Stack st)
	{
		boolean result = st.empty();
		System.out.println(result);
		return result;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void pushElem(Stack st,int x)
	{
		System.out.println("Push -->");
		System.out.println(x);
		System.out.println("Resultant stack is ");
		st.push(x);
		System.out.println(st);
	}
	@SuppressWarnings("rawtypes")
	public static void popElem(Stack st)
	{
		if(isEmpty(st)==true)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Pop -->");
			System.out.println(st.pop());
			System.out.println("Resultant stack is ");
			System.out.println(st);
		}
	}
	@SuppressWarnings("rawtypes")
	public static void peek(Stack st)
	{
		if(isEmpty(st)==true)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println(st.peek());
		}
	}
	@SuppressWarnings({ "rawtypes", "resource" })
	public static void search(Stack st)
	{
		int elem;
		System.out.println("Enter the element to be searched");
		Scanner sc = new Scanner(System.in);
		elem = sc.nextInt();
		System.out.println("The "+elem+" is at position "+st.search(elem));
	}
	@SuppressWarnings("rawtypes")
	public static void display(Stack st)
	{
		Iterator iterate = st.iterator();
		while(iterate.hasNext())
		{
			Object values = iterate.next();
			System.out.println(values);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n,x;
		while(true)
		{
			System.out.println("Enter");
			System.out.println("1 To check for empty stack");
			System.out.println("2 Push");
			System.out.println("3 Pop");
			System.out.println("4 Peek");
			System.out.println("5 Search");
			System.out.println("6 Display");
			System.out.println("7 End");
			System.out.println("Enter ur choice");
			n = sc.nextInt();
			switch(n)
			{
				case 1: isEmpty(st); break;
				case 2: System.out.println("Enter the element to be pushed");
				        x = sc.nextInt();
				        pushElem(st,x);
				        break;
				case 3: popElem(st); break;
				case 4: peek(st);break;
				case 5: search(st); break;
				case 6: display(st);break;
				case 7: sc.close();return;
				default: System.out.println("Wrong Choice");
			}
		}
	}
}