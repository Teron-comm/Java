import static java.lang.Math.*;

import java.util.Scanner;

public class Lab1z1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextDouble();

        System.out.print("Input b: ");
        double b = in.nextDouble();

        double c = a * b;

        if (c > 20) {
            a = tan(a);
            b = 1 / tan(b);
            System.out.println("Result: " + a + "; " + b);
        }
        else {
            a = a / 3;
            System.out.println("Result: " + a);
        }

    }
}

