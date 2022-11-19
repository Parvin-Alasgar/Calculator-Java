package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("a-ni daxil edin:");
        double a = scn.nextDouble();

        System.out.println("b-ni daxil edin:");
        double b = scn.nextDouble();

        System.out.println("Emeliyyati daxil edin.\n1:Toplama 2:Cixma 3:Vurma 4:Bolme");
        int emeliyyat = scn.nextInt();

        double netice = 0;
        if (emeliyyat == 1) {
            netice = a + b;
        } else if (emeliyyat == 2) {
            netice = a - b;
        } else if (emeliyyat == 3) {
            netice = a * b;
        } else if (emeliyyat == 4) {
            netice = a / b;
        } else {
            System.out.println("Emeliyyati yalnis secim etdiniz.");
        }
        System.out.println("Netice=" + netice);
    }

}
