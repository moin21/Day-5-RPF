import java.util.Scanner;
public class VowelOrConsonants {
    public static void main(String[] args) {
        System.out.println("Enter Any Alphabet either in small or capital.");
        Scanner sc = new Scanner(System.in);

        char alphabet = sc.next().charAt(0);
        switch (alphabet) {
            case 'a': System.out.println("It's a vowel");
            case 'e': System.out.println("It's a vowel");
            case 'i': System.out.println("It's a vowel");
            case 'o': System.out.println("It's a vowel");
            case 'u': System.out.println("It's a vowel");
            default: System.out.println("It's a consonant");
        }
    }
}