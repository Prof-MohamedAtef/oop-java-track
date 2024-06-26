package rwad;
import java.util.Scanner;

public class BreadTaskLab {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //  single dimensional array
        // gameNumbers[0] = 10;
        // gameNumbers[1] = 20 ;
        // gameNumbers[2] = 35;
        // gameNumbers[3] = 55 ;
        // gameNumbers[4] = 100;

        // for(int mohamed = 0; mohamed < gameNumbers.length; mohamed ++){
        //     System.out.println( gameNumbers[mohamed]);
        // }

        // for(int amal : gameNumbers){
        //     System.out.println(amal);
        // }

        // System.out.println("Enter withdrawal number ");
        // int withdrawNumbers = reader.nextInt();

        int withdrawNumbers = 5 ;
        String [] userNameArr = new String[withdrawNumbers];
        int [] withdrawalArray = new int[withdrawNumbers];

        for(int i = 0; i < withdrawNumbers; i ++){
            System.out.printf("Enter your %d withdraw number of bread", i+1);
            int breadNumbers = reader.nextInt();
            withdrawalArray[i] =  breadNumbers;
            System.out.printf("Enter your username for withdraw number %d ", i+1);
            String userName = reader.next();
            userNameArr[i] = userName;
        }

        System.out.println("Withdrawan numbers of bread");
        for(int numbers : withdrawalArray){
            System.out.println(numbers);
        }

        System.out.println("Users had withdrawan the bread");
        for(String userName : userNameArr){
            System.out.println(userName);
        }
    }
}