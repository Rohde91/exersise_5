import java.util.Scanner;

public class exercise_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = 1;
        double b = 2;
        double c = 3;
        System.out.println("The ^");
        double n = scanner.nextDouble();

        if (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n) && n<=2){
            System.out.println("He was wrong");
        }
        else{
            System.out.println("He was right");
        }



    }
}
        // Help for this!