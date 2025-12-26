import static java.lang.Math.*;
import java.util.Scanner;

public class lab1z2 {
        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                System.out.print("Input a: ");
                double a = in.nextDouble();

                System.out.print("Input b: ");
                double b = in.nextDouble();

                System.out.print("Input x: ");
                double x = in.nextDouble();

                double max = Math.max(a, b);

                double min = Math.min(a, b);

                double res = (max - pow(2, x) * min) / (Math.sin(2) + (max / min));

                System.out.println("Result: " + res);


        }
}
