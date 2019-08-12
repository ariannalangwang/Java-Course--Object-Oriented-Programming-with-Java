
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Type a floating number: ");
            double temp = Double.parseDouble(reader.nextLine());
            if (temp >= -30.0 && temp <= 40.0) {
                Graph.addNumber(temp);          
            }       
        } 
    }
}
         