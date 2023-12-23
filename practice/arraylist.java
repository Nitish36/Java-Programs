import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Animals");
        arr.add("Cat");
        arr.add("Dog");
        arr.add("Deer");
        arr.add("Buffallo");
        System.out.println("Initial Arraylist");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("Modified Array List");
        arr.set(1, "Brown Dog");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("Cloned Arraylist");
        System.out.println(arr.clone());

        System.out.println("Sorted Arraylist");
        Collections.sort(arr);

        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();

    }
}
