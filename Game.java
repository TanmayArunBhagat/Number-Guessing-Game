import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "1";
        int round = 0, TotalScore = 0, TotalTries = 0;
        System.out.println();
        System.out.println("Guess the number between 1 to 100 ");
        System.out.println("You have only 5 trials");
        while (play.equals("1")) {
            ++round;
            int guess, k, limit = 5, tries = 0, score = 5;
            Random rand = new Random();
            int number = rand.nextInt(100);
            for (k = 0; k < limit; k++) {
                System.out.println();
                System.out.print("Guess the number : ");
                guess = sc.nextInt();
                if (number == guess) {
                    tries++;
                    System.out.println("Congratulations!!!! guessed number is correct !!!.....");
                    System.out.println();
                    TotalTries += tries;
                    TotalScore += score;
                    System.out.println();
                    System.out.println("would you like to play again? yes or no:");
                    play = sc.next().toLowerCase();
                    break;
                } else if (number > guess && k != limit - 1) {
                    System.out.println("The number is greater than " + guess);
                    tries++;
                    score--;
                } else {
                    System.out.println("The number is less than " + guess);
                    tries++;
                    score--;
                }
            }
            if (k == limit) {
                System.out.println("SORRY!........You have exhausted 5 tries.");
                System.out.println("The number was " + number);
                TotalTries += tries;
                TotalScore += score;
                System.out.println();
                System.out.println("-----------------");
                System.out.println("| Total tries=" + tries + " |");
                System.out.println("-----------------");
                System.out.println("| Total score=" + score + " |");
                System.out.println("-----------------");
                System.out.print("For play again press 1 or For exit press 0 :");
                play = sc.next().toLowerCase();

            }
            System.out.println();
            System.out.println("***SCORECARD***");
            System.out.println("----------------");
            System.out.println("|TOTAL ROUNDS=" + round + "|");
            System.out.println("----------------");
            System.out.println("|TOTAL TRIES=" + tries + " |");
            System.out.println("----------------");
            System.out.println("|TOTAL SCORE=" + score + " |");
            System.out.println("----------------");

        }
    }
}