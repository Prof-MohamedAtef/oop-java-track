package junetwentyfour.arrs;

public class ThreeDimensionalArra {
    public static void main(String[] args) {
        // Declaration and initialization of a 3D array (3x4x2 array) of integers
        // int[][][] threeDArray = new int[3][4][2]; // 3 layers, 4 rows per layer, 2 columns per row

        // Initializing elements of the 3D array
        // threeDArray[0][0][0] = 1;
        // threeDArray[0][0][1] = 2;
        // threeDArray[0][1][0] = 3;
        // threeDArray[0][1][1] = 4;

        // threeDArray[1][0][0] = 5;
        // threeDArray[1][0][1] = 6;
        // threeDArray[1][1][0] = 7;
        // threeDArray[1][1][1] = 8;

        // threeDArray[2][0][0] = 9;
        // threeDArray[2][0][1] = 10;
        // threeDArray[2][1][0] = 11;
        // threeDArray[2][1][1] = 12;

        // Let's consider an example of a 3x4x2 array of integers:
        int[][][] threeDArray = {
            {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
            },
            {
                {9, 10},
                {11, 12},
                {13, 14},
                {15, 16}
            },
            {
                {17, 18},
                {19, 20},
                {21, 22},
                {23, 24}
            }
        };
        // Accessing and printing elements of the 3D array
        System.out.println("Elements of threeDArray:");
        for (int layer = 0; layer < threeDArray.length; layer++) {
            System.out.println("Layer " + layer + ":");
            for (int row = 0; row < threeDArray[layer].length; row++) {
                for (int col = 0; col < threeDArray[layer][row].length; col++) {
                    System.out.print(threeDArray[layer][row][col] + " ");
                }
                System.out.println(); // Move to the next line after each row
            }
            System.out.println(); // Separate layers with a blank line
        }
    }
}
