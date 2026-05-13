
import java.util.Scanner;
import java.lang.Math;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.valueOf(scanner.nextLine());
        double powerNumber = Double.valueOf(2);
        System.out.println((int) Math.pow(number, powerNumber));


    }
}
