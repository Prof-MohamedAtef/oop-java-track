package junetwentyfour.bankuser;

import java.time.LocalDate;
import java.util.Scanner;

public class RevisionTasks {
    
    public static void main(String[] args) {
        String creditCard = "";
        String nationalID;
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome In InstaPay console Application");
        System.out.println("Please select your Bank");
        System.out.println("Enter 1 for Bank Misr");
        System.out.println("Enter 2 for Bank Abu Dhabi");
        System.out.println("Enter 3 for Bank Du Caire");
        System.out.println("Enter 4 Bank CIB");
        int userBank = reader.nextInt();
        switch (userBank) {
            case 1:
                System.out.println("You are BM User");
                break;
            case 2:
                System.out.println("You are Abu Dhabi User");
                break;
            case 3:
                System.out.println("You are Bank Du Caire User");
                break;
            case 4:
                System.out.println("You are CIB User");
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

        do {
            System.out.println("Please, Enter you Credit Card . You must enter 16 digits only");
            creditCard = reader.nextLine();
            creditCard = creditCard.replaceAll("\\s", "");
        } while (creditCard.length() != 16 && !creditCard.matches("[0-9]+"));
        
        System.out.println("Enter First Name");
        String firstName = reader.next();
        System.out.println("Enter Last Name");
        String secondName = reader.next();
        System.out.println("Enter Address");
        String address = reader.next();
        System.out.println("Enter City");
        String city = reader.next();
        do {
            System.out.println("Enter National ID");
            nationalID = reader.nextLine();
            nationalID = nationalID.replaceAll("\\s", "");
        } while (nationalID.length() != 14 && !nationalID.matches("[0-9]+"));

        String generation = nationalID.substring(0,1);
        String year = nationalID.substring(1, 3);

        if(generation.equals("2")){
            year = "19" + year;
        }else{
            year = "20" + year;
        }


        String month = nationalID.substring(3,5);
        String day = nationalID.substring(5, 7);
        String dob = year + "/" + month + "/" + day;
        System.out.println("DateOfBirth: "+ dob);

    
        System.out.println("Local Date : " + LocalDate.now());

        String todayDate = LocalDate.now().toString();

        System.out.println("Date String : " + todayDate);

        String currentYear = todayDate.substring(0, 4);
        System.out.println(currentYear);

        int year_ = Integer.parseInt(year);
        int currentYear_ = Integer.parseInt(currentYear);

        int age = currentYear_ - year_;


        System.out.printf("You have %d years",age);

    }
}
