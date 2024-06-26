package rwad;

import java.util.Scanner;

public class ClubTask {
    public static void main(String[] args) {

        String[] mainGamesArr = new String[] { "Ball", "Fighting" };
        String[] ballGamesArr = new String[] { "Football", "Basket Ball", "Volley Ball" };
        String[] fightingGamesArr = new String[] { "Karate", "KongoFu", "Boxing" };

        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome in Ahly SC");
        System.out.println("Select your preferred game");

        int gamesLength = mainGamesArr.length;
        int mainGamesCounter = 0;
        while (mainGamesArr.length > 0 && mainGamesCounter != gamesLength) {
            mainGamesCounter++;
            // System.out.printf("For %d Enter " + counter, games[counter].toString());
            System.out.printf("For " + mainGamesArr[mainGamesCounter - 1] + " Enter %d \n", mainGamesCounter);
        }

        int mainGame = reader.nextInt();
        switch (mainGame) {
            case 1:
                int ballGamesArrLength = ballGamesArr.length;
                int ballGamesCounter = 0;
                while (ballGamesArr.length > 0 && ballGamesCounter != ballGamesArrLength) {
                    ballGamesCounter++;
                    // System.out.printf("For %d Enter " + counter, games[counter].toString());
                    System.out.printf("For " + ballGamesArr[ballGamesCounter - 1] + " Enter %d \n", ballGamesCounter);
                }
                break;
            case 2:
                int fightingGamesArrLength = fightingGamesArr.length;
                int fightingGamesCounter = 0;
                while (fightingGamesArr.length > 0 && fightingGamesCounter != fightingGamesArrLength) {
                    fightingGamesCounter++;
                    // System.out.printf("For %d Enter " + counter, games[counter].toString());
                    System.out.printf("For " + fightingGamesArr[fightingGamesCounter - 1] + " Enter %d \n",
                            fightingGamesCounter);
                }
                break;
            default:
                break;
        }

        int subGameSelection = reader.nextInt();
        if (subGameSelection == 1 || subGameSelection == 2 || subGameSelection == 3) {
            if (mainGame == 1) {
                System.out.println("Selected Ball game is: " + ballGamesArr[subGameSelection - 1]);
            } else {
                System.out.println("Selected fighting game is: " + fightingGamesArr[subGameSelection - 1]);
            }
        }

        if (mainGame == 1) {
            System.out.println("These are the different times available in the week for the selected game ("
                    + ballGamesArr[subGameSelection - 1] + ")");
        } else {
            System.out.println("These are the different times available in the week for the selected game ("
                    + fightingGamesArr[subGameSelection - 1] + ")");
        }

        String[] timesArr = new String[] { "Saturday, 10:00 AM ", "Saturday, 12:00 PM ", "Sunday, 10:00 AM ",
                "Sunday, 12:00 PM ", "Monday, 10:00 AM ", "Monday, 12:00 PM ", "Wednesday, 10:00 AM ",
                "Wednesday, 12:00 PM ", "Friday, 10:00 AM ", "Friday, 12:00 PM ", };

        for (String time : timesArr) {
            System.out.print(time + "\n");
        }

        String[] userPreferredTimes = new String[3]; // set available times to 3

        int userTimesCounter = 1;
        while (userTimesCounter <= 3) {
            System.out.println("Enter time no." + userTimesCounter);
            userPreferredTimes[userTimesCounter -1] = reader.nextLine();
            userTimesCounter++;
        }

        System.out.println("Booked Times are: ");
        for (String time : userPreferredTimes) {
            System.out.println(time);
        }

    }
}