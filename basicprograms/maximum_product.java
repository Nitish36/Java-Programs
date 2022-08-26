import java.io.*;

public class maximum_product {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the length of the array");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n < 2) {
            System.out.println("Pair not possible");
            return;
        }
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        product(arr, n);
    }

    public static void product(int arr[], int n) {

        int a = arr[0], b = arr[1];
        int initProduct = a * b;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] * arr[j]) > initProduct) {
                    initProduct = arr[i] * arr[j];
                    a = arr[i];
                    b = arr[j];
                }
            }
        }
        System.out.println("The maximum product is " + initProduct);
        System.out.println("The pairs include (" + a + "," + b + ")");
    }
}
