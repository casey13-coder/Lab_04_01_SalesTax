import java.util.Scanner;
public class Main {
    static void main() {
        double TAX_RATE = 1.05;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the Price before Tax (Must be a Double): ");
        double input = scanner.nextDouble();

        double finalPrice = input * TAX_RATE;
        System.out.println("Your Price with Tax is: " + finalPrice);
    }
}
