
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<> ();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }

            list.add(number);
        }

        int min = Collections.min(list);

        System.out.println("Smallest number: " + min);
        System.out.println("Found at index: " + list.indexOf(min));
        
    }
}
