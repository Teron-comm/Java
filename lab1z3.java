import java.util.Scanner;

import static java.lang.Math.*;

public class lab1z3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        double Y;
        double F;

        if (x <= 1) {

            Y = pow(x, 5) + atan(8 * x);

            F = exp(tan(x + 1));

        } else if (x > 1 && x <= 2) {

            Y = 5 * x - (1 + pow(3, x));

            F = pow(x, 4) - tan(4 * x);

        } else {

            Y = 1.0 / tan((2 * x) + 1);

            F = pow(x, 1.0 / 5);

        }

        System.out.println("Result: " + Y + " " + F);


    }

}
