import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter any positive number upto 30");
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
    PowOfTwo(N);
    }

    public static void PowOfTwo(int N) {
        for (int i = 0; i <= N; i++) {
            System.out.println(pow(2, i));
        }
    }
}
