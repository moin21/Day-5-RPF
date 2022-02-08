import java.util.*;
import java.lang.*;
public class Distance {
    public static void main(String[] args) {

        Scanner no = new Scanner(System.in);

        System.out.println("Enter x coordinate");
        int x = no.nextInt();
        System.out.println("Enter y coordinate");
        int y = no.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The distance of the given point from origin is " + distance);
    }
}