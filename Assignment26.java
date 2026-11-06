import java.util.Scanner;

public class Assignment26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        if (number >= 10000 && number <= 99999) {
            int firstDigit = number / 10000;
            int lastDigit = number % 10;
            if (firstDigit == lastDigit)
                System.out.println("First and last digits are the same.");
            else
                System.out.println("First and last digits are different.");
        } else {
            System.out.println("Please enter a positive five-digit number.");
        }
        sc.close();
    }
}
