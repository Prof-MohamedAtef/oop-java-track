import java.util.Scanner;

public class DepositeLimitTask {
    public static void main(String[] args) {

        int limit = 0;
        int deposite = 0, total = 0;
        System.out.println(
                "Enter your account information \n For Golden acc. enter 1.\n For Bronze acc. enter 2.\n For Normal acc. enter 3.");
        Scanner reader = new Scanner(System.in);
        int accType = reader.nextInt();
        switch (accType) {
            case 1:
                limit = 12000;
                break;
            case 2:
                limit = 8000;
                break;
            case 3:
                limit = 5000;
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        if (accType == 1 || accType == 2 || accType == 3) {
            for (int i = 1; i < 5; i++) {
                System.out.println("Enter deposite number: " + i);
                deposite = reader.nextInt();
                if (deposite <= limit) {
                    total += deposite;
                } else {
                    i--;
                    continue;
                }
            }
        }

        System.out.println("Total deposits are :" + total);
    }
}
