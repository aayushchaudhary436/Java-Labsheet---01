import java.util.Scanner;

public class Assignment27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice)
            System.out.println("Profit: Rs. " + (sellingPrice - costPrice));
        else if (costPrice > sellingPrice)
            System.out.println("Loss: Rs. " + (costPrice - sellingPrice));
        else
            System.out.println("No profit, no loss.");
        sc.close();
    }
}
