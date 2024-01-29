
package numbergame;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {

   
    public static void main(String[] args) {
 
   
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Initialize a variable to keep track of the user's score.
        int score = 0;

        // Main game loop
        boolean playing = true;

        while (playing) {
            // Ask the user if they want to play.
            System.out.print("Do you want to play? (y/n): ");
            String play = scanner.nextLine();

            // Check if the user wants to play
            if (play.equalsIgnoreCase("n")) {
                playing = false;
            } else {
                // Play a single round of the game
                int generatedNumber = random.nextInt(100) + 1;
                int maxAttempts = 10;
                int attempts = 1;
                System.out.print("Guess a number between 1 and 100: ");
                int guess = scanner.nextInt();
                while (guess != generatedNumber) {
                    if (attempts >= maxAttempts) {
                        System.out.println("Sorry, you've run out of attempts. The correct number was " + generatedNumber);
                        break;
                    }
                    if (guess < generatedNumber) {
                        System.out.println("Your guess is too low.");
                    } else {
                        System.out.println("Your guess is too high.");
                    }
                    guess = scanner.nextInt();
                    attempts++;
                }
                if (attempts < maxAttempts) {
                  
                    System.out.println("Congratulations! You guessed the correct number!");
                    score= score+1;
                }

                // Generate a new random number for the next round.
                generatedNumber = random.nextInt(100) + 1;

                // Display the score to the user
                System.out.println("Your score is: " + score);

                // Ask the user if they want to play another round.
              
                scanner.nextLine(); // consume the newline character
            }
        }
        // Display the final score to the user
        System.out.println("Thank you for playing! Your final score is " + score);
    }
}
    
    
