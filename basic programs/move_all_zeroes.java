import java.io.*;

public class move_all_zeroes {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        move(arr, n);
        System.out.println("The modified array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] move(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }
        return arr;
    }
}