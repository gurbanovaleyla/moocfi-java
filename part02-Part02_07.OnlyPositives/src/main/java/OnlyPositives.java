
import java.util.Scanner;
import java.lang.Math;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            int power = 2;
            System.out.println((int) Math.pow(number, power));
            
        }

    }
}
