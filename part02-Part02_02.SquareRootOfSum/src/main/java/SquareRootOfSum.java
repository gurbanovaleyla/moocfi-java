
import java.util.Scanner;
import java.lang.Math;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.valueOf(scanner.nextLine());
        double secondNumber = Double.valueOf(scanner.nextLine());
        System.out.println((int) Math.sqrt((firstNumber + secondNumber)));

    }
}
