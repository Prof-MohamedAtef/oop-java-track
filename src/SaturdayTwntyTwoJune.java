import java.util.Scanner;

public class SaturdayTwntyTwoJune {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // boolean isCorrect = false;
        // String nationalID = "";
        // while (!isCorrect) {
        // System.out.println("Please enter your national ID, it should be 14 digits");
        // nationalID = input.nextLine();
        // if (nationalID.length() == 15) {
        // isCorrect = true;
        // }
        // }

        // String year = nationalID.substring(1, 2);
        // String month = nationalID.substring(3, 4);
        // String day = nationalID.substring(5, 6);
        // if (year.charAt(0) != '0') {
        // year = "19" + year;
        // } else {
        // year = "20" + year;
        // }
        // String birthDate = year + "/" + month + "/" + day;

        // System.out.println("Your Birth date is: " + birthDate);

        /*
         * According to a set of cities in Egypt,
         * knowing their identifier code in the national number,
         * define this set with each code refering to the city, and check whether the
         * user
         * is from Cairo, Sohag, Damitta, Alexandria, or Aswan.
         * 
         * 
         * 
         */

        Scanner reader = new Scanner(System.in);
        SaturdayTwentyTwoJuneS8 sat = new SaturdayTwentyTwoJuneS8();
        System.out.println("Enter n1");
        int n1 = reader.nextInt();
        System.out.println("Enter n2");
        int n2 = reader.nextInt();
        System.out.println("Enter n3");
        int n3 = reader.nextInt();
        System.out.println("Adding Two numbers = " + sat.add(n1, n2));
        System.out.println("Adding Three numbers = " + sat.add(n1, n2, n3));
        System.out.println("multiplication result = " + sat.multiply(n1, n2));

        System.out.println("Enter First Name");
        String firstName = reader.next();

        System.out.println("Enter Last Name");
        String lastName = reader.next();

        System.out.println(
                "Full Name is: " + sat.displayFullName(firstName, lastName));
        System.out.println(
                "Length of name = " + sat.nameCharsLength(
                        sat.displayFullName(firstName, lastName)) + " Characters.");

        System.out.printf("Length of name = %d charactes",
                sat.nameCharsLength(
                        sat.displayFullName(firstName, lastName)));

                addFun(5, 6);    

                
    }

    static int addFun(int x, int y) {
        return x + y;
    }

}