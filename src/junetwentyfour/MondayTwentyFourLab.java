package junetwentyfour;

public class MondayTwentyFourLab {
    public static void main(String[] args) {

        /*
         * Single Dimensional Array
         */
        // int [] numbersArr = new int[5];

        // numbersArr[0] = 1;
        // numbersArr[1] = 50;
        // numbersArr[2] = 25;
        // numbersArr[3] = 30;
        // numbersArr[4] = 0;

        // System.out.println("Numbers index 3 = "+ numbersArr[3]);

        // // for(int number : numbersArr){
        // //     System.out.println(number);
        // // }

        // for(int mohamed = 0; mohamed < numbersArr.length; mohamed ++){
        //     System.out.println(numbersArr[mohamed]);
        // }

        // System.out.println("Before Update");
        // int [] einasArr = {50, 60, 80, 10 ,20};
        // for(int value : einasArr){
        //     System.out.println(value);
        // }


        // einasArr[3] = 11;

        // System.out.println("After Update");
        // for(int value : einasArr){
        //     System.out.println(value);
        // }


        int [] mohamedArr = new int[10];
        mohamedArr[0] = 1;
        mohamedArr[1] = 50;
        mohamedArr[2] = 25;

        for(int x : mohamedArr){
            System.out.println("BeforeChange " + x);
        }
        System.out.println("------******--------AfterChange------******--------");

        // Delete index at 5

        int indexToRemove = 1;

        int [] newArr = new int[mohamedArr.length - 1];

        for(int i = 0, k = 0; i < mohamedArr.length; i++){
            if (indexToRemove == i) {
                continue;
            }
            newArr[k++] = mohamedArr[i];

        }

        for(int x : newArr){
            System.out.println("After Change " + x);
        }



        



    }
}
