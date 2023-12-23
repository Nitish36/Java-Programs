import java.io.*;

public class missing {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the length of the array");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int num = missingNumber(arr, n);
        System.out.println("The missing number is " + num);
    }

    public static int missingNumber(int arr[], int n) {
        int total = 0;
        total = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++) {
            total = total - arr[i];
        }

        return total;
    }

}