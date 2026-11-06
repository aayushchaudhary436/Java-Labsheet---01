import java.util.Scanner;

public class Assignment25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter logical operator (& for AND, | for OR): ");
        char operator = sc.next().charAt(0);

        boolean first = a != 0;
        boolean second = b != 0;
        if (operator == '&')
            System.out.println("Result: " + (first && second));
        else if (operator == '|')
            System.out.println("Result: " + (first || second));
        else
            System.out.println("Invalid operator. Use & or |.");
        sc.close();
    }
}
