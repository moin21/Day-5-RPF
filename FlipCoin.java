import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int head = 0, tail = 0;
        System.out.println("Enter any positive number");
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                double random = Math.random();
                if (random < 0.5)
                    tail++;
                else
                    head++;
            }
            double headPercent = (head * 100) / (head + tail);
            double tailPercent = 100 - headPercent;
        System.out.println("After "+count+" flips, no. of heads is "+head+ " and no. of tails is "+tail+". Head Percentage is "+headPercent+".");
        }
        else {
        System.out.println("Enter any positive number");    }
    }
}
