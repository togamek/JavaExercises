import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class jyanken {
    public static String getComputerHand(int num) {
        String computer_hand;
        if (num == 0) {
            computer_hand = "rock";
        } else if (num == 1) {
            computer_hand = "paper";
        } else {
            computer_hand = "scissors";
        }
        return computer_hand;
    }

    public static String isWinLoseDraw(String user_hand, String computer_hand) {
        System.out.println("You: " + user_hand + ", Computer: " + computer_hand);
        if (user_hand.equals("rock")) {
            if (computer_hand.equals("rock")) {
                return "Draw! Try again!";
            } else if (computer_hand.equals("paper")) {
                return "You lose!";
            } else {
                return "You win!";
            }
        } else if (user_hand.equals("paper")) {
            if (computer_hand.equals("rock")) {
                return "You win!";
            } else if (computer_hand.equals("paper")) {
                return "Draw! Try again!";
            } else {
                return "You lose!";
            }
        } else {
            if (computer_hand.equals("rock")) {
                return "You lose!";
            } else if (computer_hand.equals("paper")) {
                return "You win!";
            } else {
                return "Draw! Try again!";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "Draw! Try again!";
        while (Objects.equals(result, "Draw! Try again!")) {
            // Get an input from user.
            System.out.println("Choose a hand from rock, paper or scissors: ");
            String user_hand = scanner.nextLine();

            // Check the input.
            while ((!user_hand.equals("rock")) && (!user_hand.equals("paper")) && (!user_hand.equals("scissors"))) {
                System.out.println("Wrong input!");
                System.out.println("Choose a hand from rock, paper or scissors: ");
                user_hand = scanner.nextLine();
            }

            // Get a random variable.
            Random rnd = new Random();
            int rnd_val = rnd.nextInt(3);

            // Decide the computer hand from rock, paper and scissors.
            String computer_hand = getComputerHand(rnd_val);

            // Judge the result of battle.
            result = isWinLoseDraw(user_hand, computer_hand);

            // Show the result of battle.
            System.out.println(result);
        }
    }
}

