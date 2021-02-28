import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class jyanken {
    public static String rock(String hand){
        System.out.println("rock has been shown");
        if(Objects.equals(hand, "rock")){
            return "Try again!";
        }else if(Objects.equals(hand, "paper")){
            return "You win!";
        }else{
            return "You lose!";
        }
    }

    public static String paper(String hand){
        System.out.println("paper has been shown");
        if(Objects.equals(hand, "rock")){
            return "You lose!";
        }else if(Objects.equals(hand, "paper")){
            return "Try again!";
        }else {
            return "You win!";
        }
    }

    public static String scissors(String hand){
        System.out.println("scissors has been shown");
        if(Objects.equals(hand, "rock")){
            return "You win!";
        }else if(Objects.equals(hand, "paper")){
            return "You lose!";
        }else{
            return "Try again!";
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String result = "Try again!";
        while(Objects.equals(result, "Try again!")){
            System.out.println("Choose a hand from rock, paper or scissors: ");
            String input = scanner.nextLine();
            while((!input.equals("rock")) && (!input.equals("paper")) && (!input.equals("scissors"))){
                System.out.println("Wrong input!");
                System.out.println("Choose a hand from rock, paper or scissors: ");
                input = scanner.nextLine();
            }
            Random rnd = new Random();
            int rnd_val = rnd.nextInt(3);
            if(rnd_val == 0){
                result = rock(input);
            }else if(rnd_val == 1){
                result = paper(input);
            }else{
                result = scissors(input);
            }
            System.out.println(result);
        }
    }
}
