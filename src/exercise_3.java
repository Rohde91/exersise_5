import java.util.Scanner;

public class exercise_3 {

    public static void Fermat(double a, double b, double c, double n){

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double n = scanner.nextDouble();

        double x = Math.pow(a,n) + Math.pow(b,n)=Math.pow(c,n);

        System.out.println(x);
    }

    public static void main(String[] args) {
        Fermat();

        /*if (x > 2 || x < 2) {
            System.out.println("He was wrong");
        } else {
            System.out.println("Holy something, he was right");
        }*/
    }
}
