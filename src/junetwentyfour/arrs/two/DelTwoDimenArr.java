package junetwentyfour.arrs.two;

public class DelTwoDimenArr {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] rowArr : arr) {
            for (int col : rowArr) {
                System.out.print(col + " ");
            }
            System.out.println();
        }  

        System.out.println();
        // Delete row 1

        int rowToDelete = 2;
        int [][] newArr = new int[arr.length - 1][arr[0].length];

        for(int i = 0, j = 0; i < arr.length; i++){
            if (i == rowToDelete) continue;
            newArr[j++] = arr[i];
        }

        // Print the new array
        for (int[] rowArr : newArr) {
            for (int num : rowArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }        
    }
}