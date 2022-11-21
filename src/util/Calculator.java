package util;

import java.util.Scanner;

public class Calculator {

    public static double calculate() {
        Scanner scn = new Scanner(System.in);
        System.out.println("a-ni daxil edin:");
        double a = scn.nextDouble();

        System.out.println("b-ni daxil edin:");
        double b = scn.nextDouble();

        System.out.println("operatini daxil edin: +1, -2, *3, /4");
        int operation = scn.nextInt();

        double result = 0;
        if (operation == 1) {
            result = MathUtil.topla(a, b);
        } else if (operation == 2) {
            result = MathUtil.cix(a, b);
        } else if (operation == 3) {
            result = MathUtil.vur(a, b);
        } else if (operation == 4) {
            result = MathUtil.bol(a, b);
        } else {
            System.out.println("operation is not valid");
        }
        return result;
    }
}
