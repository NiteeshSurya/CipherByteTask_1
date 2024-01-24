import java.util.Random;
import java.util.Scanner;
public class Guess_Number
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int n = 3;
        int totalScore = 0;

        for (int round = 1; round <= n; round++) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("\nRound" + round);
            System.out.println("Guess the number between\n" + lowerBound + " and " + upperBound);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess number:\n");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    int roundScore = maxAttempts - attempts + 1;
                    totalScore += roundScore;
                    System.out.println("Round Score: " + roundScore);
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println(" The number is higher.");
                } else {
                    System.out.println(" The number is lower.");
                }
            }
            if (attempts == maxAttempts) {
                System.out.println(" You've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            System.out.println("Total Score: " + totalScore);
        }
        System.out.println("\nGame Over! Thanks for playing.");
        scanner.close();
    }
}
