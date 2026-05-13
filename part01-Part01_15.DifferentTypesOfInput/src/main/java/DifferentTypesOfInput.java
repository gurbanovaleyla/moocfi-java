
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int wholenumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floating_number = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean input = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + wholenumber);
        System.out.println("You gave the double " + floating_number);
        System.out.println("You gave the boolean " + input);

    }
}
