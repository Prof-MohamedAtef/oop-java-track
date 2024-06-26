package junetwentyfour.arrs;

public class JaggedArray {
    public static void main(String[] args) {
        // Declaration and initialization of a jagged array of integers
        // int[][] jaggedArray = new int[3][]; // 3 rows, columns vary

        // // Initializing elements of the jagged array
        // jaggedArray[0] = new int[] {1, 2, 3};        // Row 0 with 3 columns
        // jaggedArray[1] = new int[] {4, 5};           // Row 1 with 2 columns
        // jaggedArray[2] = new int[] {6, 7, 8, 9};     // Row 2 with 4 columns


        // another example to declare and initialize the jagged array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9},
            {10}
        };

        // Accessing and printing elements of the jagged array
        System.out.println("Elements of jaggedArray:");
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                System.out.print(jaggedArray[row][col] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
