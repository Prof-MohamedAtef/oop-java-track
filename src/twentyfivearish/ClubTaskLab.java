package twentyfivearish;

import java.util.Scanner;

public class ClubTaskLab {
    public static void main(String[] args) {
        // int[] numbersArr = new int[5];

        // int[] numbersArray = new int[] { 5, 6, 7, 8 };

        // numbersArr[0] = 5;
        // numbersArr[1] = 6;

        // int[][] matrix = new int[3][4]; // 2 rows * 3 column

        // matrix[0][0] = 20;
        // matrix[0][1] = 30;
        // matrix[0][2] = 40;
        // matrix[0][3] = 50;

        // matrix[1][0] = 25;
        // matrix[1][1] = 35;
        // matrix[1][2] = 45;
        // matrix[1][3] = 55;

        // matrix[2][0] = 12;
        // matrix[2][1] = 14;
        // matrix[2][2] = 18;
        // matrix[2][3] = 22;
        // // matrix[2]

        // System.out.println("Elements of matrix:");

        // for (int row = 0; row < matrix.length; row++) {
        // for (int col = 0; col < matrix[row].length; col++) {
        // System.out.print(matrix[row][col] + " ");
        // }
        // System.out.println(); // Move to the next line after each row
        // }

        // ConstructorIllustration ci = new ConstructorIllustration(8, 12);

        // System.out.println("X value = " + ci.getX());
        // System.out.println("Y value = " + ci.getY());

        // ci.setX(20);

        // System.out.println("X value = " + ci.getX());

        // System.out.println(ci.addNumbers(5, 8));

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle = " + rectangle.calculateArea());
    }
    /*
     * using Shape class
     * consider working on a rectangle
     * define width and height 
     * define set and get for width and height
     * you can depend on the constructor to pass the width and height to the class
     * do not forget to print the area and periemter of the rectangle
     */
}
