package ControlStructures.Opgaver;

public class Level5 {

    void main () {

        // Opgave 5.1
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
         */

        // Opgave 5.2
        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
         */

        // Opgave 5.3
        /*
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }
         */

        // Opgave 5.4
        /*
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
         */

        // Opgave 5.5
        /*
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
         */

        // Opgave 5.6
        /*
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }
         */

        // Opgave 5.7
        /*
        for (int i = 19; i > 0; i -= 2) {
            System.out.println(i);
        }
         */

        // Opgave 5.8
        /*
        int power = 1;

        for (int i = 0; i <= 9; i++) {
            System.out.println("2^" + i + " is: " + power);
            power *= 2;
        }
         */

        // Opgave 5.9
        /*
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
         */

        // Opgave 5.10
        /*
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("10! = " + factorial);
         */

        // Opgave 5.11
        /*
        int sum = 0;

        for (int i = 2; i <= 50; i += 2) {
            sum += i;
        }
        System.out.println("Sum for even numbers: " + sum);
         */

        // Opgave 5.12
        /*
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " numbers that can be divided with 7, from 1 to 100");
         */

        // Opgave 5.13
        /*
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
            count++;
        }
        System.out.println("The average of numbers from 1 to 20 is: " + ((double) sum / count));
         */

        // Opgave 5.14
        /*
        int n = 5;
        System.out.println(n + " tabellen");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
         */

        // Opgave 5.15
        /*
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
         */

        // Opgave 5.16
        /*
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
         */

        // Opgave 5.17
        /*
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= 7; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         */

        // Opgave 5.18
        /*
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */

        // Opgave 5.19
        /*
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
         */

        // Opgave 5.20
        /*
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */

        // Opgave 5.21
        /*
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // for loop er mest passende
         */

        // Opgave 5.22
        /*
        for (int i = 0; i < 20; i += 2) {
            System.out.println(i);
        }
         */

        // Opgave 5.23
        /*
        int i = 1;
        int sum = 0;

        while (i <= 50) {
            sum += i;
            i++;
        }
        System.out.println(sum);
         */
        /*
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println(sum);
         */
    }
}