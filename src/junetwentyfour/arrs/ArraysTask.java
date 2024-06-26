package junetwentyfour.arrs;

public class ArraysTask {
    public static void main(String[] args) {
        /*
         * One Dimensional Arrays
         */

        //  int[] oneIntArr = new int[5];

        int[] oneIntArr = {10, 20, 30, 40, 50}; // another usage 
        //  oneIntArr[0] = 10;
        //  oneIntArr[1] = 20;
        //  oneIntArr[2] = 30;
        //  oneIntArr[3] = 40;
        //  oneIntArr[4] = 50;

         System.out.println("Elements of arrayOfIntegers:");
         for (int i = 0; i < oneIntArr.length; i++) {
             System.out.println("Element at index " + i + ": " + oneIntArr[i]);
         }

         /*
          * Two Dimensional Arrays
          */
          int [][] matrix = new int[4][4]; // A 4 × 4 matrix (4 rows, 4 columns)

        //   int[][] matrix = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12}
        // }; 

          matrix[0][0] = 20;
          matrix[0][1] = 30;
          matrix[0][2] = 40;
          matrix[0][3] = 50;
          matrix[1][0] = 10;
          matrix[1][1] = 15;
          matrix[1][2] = 20;
          matrix[1][3] = 25;
          matrix[2][0] = 100;
          matrix[2][1] = 200;
          matrix[2][2] = 300;
          matrix[2][3] = 400;
          matrix[3][0] = 1000;
          matrix[3][1] = 2000;
          matrix[3][2] = 3000;
          matrix[3][3] = 4000;

          System.out.println("Elements of matrix:");
          for (int row = 0; row < matrix.length; row++) {
              for (int col = 0; col < matrix[row].length; col++) {
                  System.out.print(matrix[row][col] + " ");
              }
              System.out.println(); // Move to the next line after each row
          }
    }
}
