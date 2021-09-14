import java.util.Random;
import java.util.Scanner;

public class exercise_2 {

    public static void main(String[] args) {

        System.out.println("Time for guessing a number.\n[type 1-100]");

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int guess1 = scanner.nextInt();
        int number = random.nextInt(100) + 1;

        int offamount = number - guess1;

        System.out.println("Your guess was: " + guess1);
        System.out.println("I was thinking of: " + number);

        if (offamount==0){
            System.out.println("You were right!");
        }

        else {
            System.out.println("You were " + offamount + " off.");
        }
    }
}
