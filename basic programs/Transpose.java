package Basics;
import java.util.*;

public class Transpose {

  // ~~~~~~~~~~~~~User Section~~~~~~~~~~~~~
  public static int[][] transpose(int[][] matrix) {
    // write your code here
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix.length;j++)
        {
            matrix[i][j] = matrix[j][i];
        }
    }
    return matrix;
  }


  // ~~~~~~~~~~~Input Management~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[][] matrix = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = scn.nextInt();
      }
    }

    int[][] res = transpose(matrix);

    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[0].length; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }
  }
}