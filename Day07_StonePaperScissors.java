import java.util.Random;
import java.util.Scanner;

public class Day07_StonePaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Stone-Paper-Scissors!");
        System.out.println("Enter your choice (1 for stone, 2 for paper, 3 for scissors):");
        int userChoice = scanner.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice! Please enter 1 for stone, 2 for paper, or 3 for scissors.");
            return;
        }

        String[] options = {"stone", "paper", "scissors"};
        String userChoiceStr = options[userChoice - 1];

        int computerIndex = random.nextInt(3);
        String computerChoice = options[computerIndex];

        System.out.println("Computer's choice: " + computerChoice);

        if (userChoiceStr.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerIndex == 2)
                || (userChoice == 2 && computerIndex == 0)
                || (userChoice == 3 && computerIndex == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

  
    }
}
