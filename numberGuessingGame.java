import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int totRounds = 3;
        int i = 1, score = 0;
        int totAttempts = 5;

        System.out.println("                     Number Guessing Game                  ");
        System.out.println();
        System.out.println("How good are you at guessing things?)");
        System.out.println();
        System.out.println();
        System.out.println("About the game");
        System.out.println(
                "1) System will generate a random no. between 1 to 100 and you have to guess it in 5 attempts");
        System.out.println("2) There will be 3 rounds . Score will be evaluated on the basis of Round Won !!");
        System.out.println();
        System.out.println("Ready to play !!! (y/n)");
        char choy = in.next().charAt(0);
        System.out.println();

        if (choy == 'y' || choy == 'Y') {

            while (i <= totRounds) {
                System.out.println("                 Round " + i);
                int attempts = 0, guessedNo;
                int randomNo = random.nextInt(100) + 1;
                System.out.println("Guess No. between 1 to 100");
                do {
                    attempts++;
                    if (attempts == 4) {
                        System.out.println("Be careful !! Only 2 attemps lefts");
                    }
                    guessedNo = in.nextInt();
                    if (guessedNo < randomNo) {
                        System.out.println("its low , Guess higher one");
                    } else if (guessedNo > randomNo) {
                        System.out.println("its high , Guess lower one");
                    } else {
                        System.out.println("Awesome !!! You Guessed it right .");
                        score++;
                        break;
                    }
                } while (attempts <= totAttempts);

                if (attempts > totAttempts) {
                    System.out.println("Oops !!! Your attempts are over.");
                    System.out.println("No. was " + randomNo);
                }
                System.out.println();
                System.out.println();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
            System.out.println("Your score is  " + score);

            switch (score) {
                case 0:
                    System.out.println("                   Better luck next time !!!");
                    break;
                case 1:
                    System.out.println("                   Good performance !!!");
                    break;
                case 2:
                    System.out.println("                   Great performance !!!");
                    break;
                case 3:
                    System.out.println("                   Outstanding performance !!!");
                    break;
                default:
                    break;
            }

            System.out.println();
            System.out.println();
            System.out.println("                Hope you enjoyed this game !");
        } else {
            System.out.println("Hope to see you next time :)");
        }
        in.close();

    }

}