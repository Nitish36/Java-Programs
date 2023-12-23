public class twoSum {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        two(nums, target);
    }

    public static void two(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + 1 + " " + (j + 1));
                }
            }
        }
    }

}