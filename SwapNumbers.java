import java.util.*;
class SwapNumbers {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        x = sc.nextInt();
        System.out.println("Enter the value of X");
        y = sc.nextInt();
        System.out.println("before swapping "+x +", "+ y);
        z = x;
        x = y;
        y = z;
        System.out.println("After swapping: "+x +", " + y);
        System.out.println( );
    }
}  