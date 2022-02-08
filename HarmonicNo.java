import java.util.Scanner;
public class HarmonicNo {
    public static void main(String[] args) {
        System.out.println("Enter value of N to print Harmonic Sequence and it's Sum");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double harmonic = 0;

        for (int i = 1; i<=N; i++) {

            // calculating harmonic values
            harmonic = (double)1/i;
            double sum = 0.0;
                sum = sum + 1/i;
            System.out.print(harmonic + ", ");
            System.out.print(sum + ", ");

    }

    }


}

