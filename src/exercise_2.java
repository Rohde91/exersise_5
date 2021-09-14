import java.util.Random;
import java.util.Scanner;

public class exercise_2 {

    public static void numberGuess(){
        System.out.println("Time for guessing a number.\n[type 1-100]");
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int guess = scanner.nextInt();
        int number = random.nextInt(100) + 1;

        int offamount = number - guess;

        System.out.println("Your guess was: " + guess);
        System.out.println("I was thinking of: " + number);

        if (offamount==0){
            System.out.println("You were right!");
        }

        else {
            System.out.println("You were " + offamount + " off.");
        }
    }

    public static void main(String[] args) {
        numberGuess();
        numberGuess();
        numberGuess();

        System.out.println("The end!");
        return;
    }
}
