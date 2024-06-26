package junetwentyfour.arrs.two;

public class UpdateTwoDimenArr {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Array before insert");
        for (int[] rowArr : arr) {
            for (int num : rowArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // update 10 at arr[1][1]

        int row = 1;
        int col = 1;
        int value = 10;
        arr[row][col] = value;

        // Print the array
        for (int[] rowArr : arr) {
            for (int num : rowArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
