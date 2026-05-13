
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());

        if (value < 5000) {
            System.out.println("No tax!");
            
        }

        if (value >= 5000 && value < 25000) {
            double rate = 0.08;
            int tax = 100;
            double giftTax = Double.valueOf((tax + (value-5000) * rate));
            System.out.println("Tax: " + giftTax);
        }else if (value >= 25000 && value < 55000) {
            double rate = 0.10;
            int tax = 1700;
            double giftTax = Double.valueOf((tax + (value-25000) * rate));
            System.out.println("Tax: " + giftTax);
        }else if (value >= 55000 && value < 200000) {
            double rate = 0.12;
            int tax = 4700;
            double giftTax = Double.valueOf((tax + (value-55000) * rate));
            System.out.println("Tax: " + giftTax);
        }else if (value >= 200000 && value < 1000000) {
            double rate = 0.15;
            int tax = 22100;
            double giftTax = Double.valueOf((tax + (value-200000) * rate));
            System.out.println("Tax: " + giftTax);
        }else {
            double rate = 0.17;
            int tax = 142100;
            double giftTax = Double.valueOf((tax + (value-1000000) * rate));
            System.out.println("Tax: " + giftTax);
        }

    }
}
