import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value which you want to Divide");
        int no = sc.nextInt();
        System.out.println("Enter value of Divisor");
        int div = sc.nextInt();
        int quot = no / div;
        int rem = no % div;
        System.out.println("When "+no+" is divided by "+div+ " Quotient is: "+quot+ " and remainder is "+rem+".");
    }
}