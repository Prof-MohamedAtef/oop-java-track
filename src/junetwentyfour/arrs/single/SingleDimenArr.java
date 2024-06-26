package junetwentyfour.arrs.single;

public class SingleDimenArr {
    public static void main(String[] args) {
        /*
         * One Dimensional Arrays
         */

        //  int[] oneIntArr = new int[5];

        // int[] oneIntArr = {10, 20, 30, 40, 50}; // another usage 
        //  oneIntArr[0] = 10;
        //  oneIntArr[1] = 20;
        //  oneIntArr[2] = 30;
        //  oneIntArr[3] = 40;
        //  oneIntArr[4] = 50;

        //  System.out.println("Elements of arrayOfIntegers:");
        //  for (int i = 0; i < oneIntArr.length; i++) {
        //      System.out.println("Element at index " + i + ": " + oneIntArr[i]);
        //  }

         /*
          * insertion
          */

        int [] arr = {1, 2, 4, 5};
        // insert 3 on index 2
        int value = 3;
        int index = 2;

        int [] newArr = new int[arr.length + 1];
        for(int i = 0, j = 0; i< arr.length; i++, j++){
            if (i == index) {
                newArr[j] = value;
                j++;
            }
            newArr[j] = arr[i];
        }

        for(int num : newArr) {
            System.out.println(num + ", ");
        }
    }
}
