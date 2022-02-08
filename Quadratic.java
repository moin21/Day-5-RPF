import java.util.*;
import java.lang.*;
public class Quadratic {
    public static void main(String[] args) {

        Scanner no = new Scanner(System.in);

        System.out.println("Enter no. with x^2.");
        int a = no.nextInt();
        System.out.println("Enter no. with x.");
        int b = no.nextInt();
        System.out.println("Enter added constant");
        int c = no.nextInt();
        int delta = b*b - 4*a*c;
        if(delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(root1 + ", " + root2 + " are the roots of this quadratic equation");
        }
        else if(delta == 0) {
            double root = (-b)/ (2 * a);
            System.out.println(root + " is the only root of this quadratic equation");
        }
        else {
            System.out.println("This equation has imaginary roots");
        }
    }
}