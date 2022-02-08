import java.util.Scanner;

public class LeapYear {
    public static void checkLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0 && year > 1581))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }

    public static void main(String[] args) {
        int year=0;
        System.out.println("Enter any year = ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        checkLeapYear(year);
    }

}