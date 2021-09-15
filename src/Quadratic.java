import java.util.Scanner;

public class Quadratic {
    public static void calculator(double a, double b, double c){
        double divide = 2 / a;
        double inQuad = Math.sqrt(Math.pow(b,2) - 4*(a*c));
        double root = Math.pow(b,2) - 4*(a*c);
        double inPlus = (-(b)+inQuad/divide);
        double inMinus = (-(b)-inQuad/divide);
        double formulaPlus = a * Math.pow(inPlus,2) + b * inPlus + c;
        double formulaMinus = a * Math.pow(inMinus,2) + b * inMinus + c;

        if (inPlus == inMinus){
            System.out.println("The is only one or none answer");
        }
        else if (divide == 0){
            System.out.println("Cant divide 0");
        }
        else if (root < 0){
            System.out.println("root is minus, can't make a squareroot off that");
        }
        else{
            System.out.println("Result for plus = " + formulaPlus);
            System.out.println("Result for minus = " + formulaMinus);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a's value");
        double a = scanner.nextDouble();
        System.out.println("Type b's value");
        double b = scanner.nextDouble();
        System.out.println("Type c's value");
        double c = scanner.nextDouble();

        calculator(a, b, c);
    }
}
