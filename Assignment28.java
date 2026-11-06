import java.util.Scanner;

public class Assignment28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        long value = Math.abs((long) number);
        int count = 0;
        if (value == 0)
            count = 1;
        else {
            while (value > 0) {
                count++;
                value /= 10;
            }
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
