
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        System.out.print("Until what? ");
        Scanner reader = new Scanner(System.in);
        int last = Integer.parseInt(reader.nextLine());
        int i = 1;
        int sum = 0;
        while (i <= last) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);

    }
}
 
        
