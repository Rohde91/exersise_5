import java.util.Scanner;

public class exercise_3 {

    public static void Fermat(double a, double b, double c, double n){

        System.out.println((Math.pow(a,n))+(Math.pow(b,n))==Math.pow(c,n));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        double a = scanner.nextDouble();
        System.out.println("Second number:");
        double b = scanner.nextDouble();
        System.out.println("Third number");
        double c = scanner.nextDouble();
        System.out.println("Last number, the ^");
        double n = scanner.nextDouble();

        Fermat (a,b,c,n);

        /*if (x > 2 || x < 2) {
            System.out.println("He was wrong");
        } else {
            System.out.println("Holy something, he was right");
        }*/
    }
}
        // Help for this!