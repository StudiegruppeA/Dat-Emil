package ControlStructures.Opgaver;
// Concept: https://github.com/Dat1Cphbusiness/WorkingWithControlStructures/blob/main/concepts/level4.md
// Assignment: https://github.com/Dat1Cphbusiness/WorkingWithControlStructures/blob/main/assignments/level4.md
public class Level4 {

    void main () {

        //Opgave 4.1
        /*
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
         */

        //Opgave 4.2
        /*
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
         */

        //Opgave 4.3
        /*
        int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
         */

        //Opgave 4.4
        /*
        int i = 0;
        while (i < 10) {
            i++;
        }
        System.out.println("Loop ran " + i + " times");
         */

        //Opgave 4.5
        /*
        int count = 0;
        int i = 1;
        while (i <= 20) {
            if (i % 2 ==0) {
                count++;
            }
            i++;
        }
        System.out.println("There is " + count + " even numbers between 1 and 20");
         */

        //Opgave 4.6
        /*
        int i = 1;
        int count = 0;
        while (i <= 30) {
            if (i % 3 == 0) {
                count++;
            }
            i++;
        }
        System.out.println("There is " + count + " numbers between 1 and 30, that can be dividet by 3");
         */

        //Opgave 4.7
        /*
        int number = 12345;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        System.out.println(count);
         */

        //Opgave 4.8
        /*
        int count = 0;
        int i = 10;
        while (i >= 1) {
            count++;
            i--;
        }
        System.out.println("Printed " + count + " numbers");
         */

        //Opgave 4.9
        /*
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);
         */

        //Opgave 4.10
        /*
        int sum = 0;
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum: " + sum);
         */

        //Opgave 4.11
        /*
        int product = 1;
        int i = 5;
        while (i > 0) {
            product *= i;
            i--;
        }
        System.out.println(product);
         */

        //Opgave 4.12
        /*
        int count = 0;
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 7 ==0) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println("There is " + count + " numbers between 1 and 100, that can be divided by 7");
        System.out.println("Sum of the numbers: " + sum);
         */

        //Opgave 4.13
        /*
        int sum = 0;
        int count = 0;
        int i = 10;
        while (i <= 50) {
            sum += i;
            count++;
            i += 10;
        }
        System.out.println("The average of the numbers 10, 20, 30, 40 and 50, is: " + (sum / count));
         */

        //Opgave 4.14
        /*
        int number = 10;

        while (number != -1) {
            System.out.println(number);
            number--;
            if (number == 5) {
                number = -1;
            }
        }
         */

        //Opgave 4.15
        /*
        int number = 100;
        int steps = 0;
        while (number >= 0) {
            steps++;
            number -= 7;
        }
        System.out.println("There was " + steps + " steps");
         */

        //Opgave 4.16
        /*
        int target = 64;
        int number = 1;
        boolean found = false;
        while (!found) {
            if (number * number == target) {
                found = true;
            } else {
                number++;
            }
        }
        System.out.println("The square root of " + target + " is: " + number);
         */

        //Opgave 4.17
        /*
        int number = 1000;
        int steps = 0;
        while (number > 10) {
            number /= 2;
            steps++;
        }
        System.out.println("Count of steps: " + steps);
         */

        //Opgave 4.18
        /*
        int power = 1;
        int exponent = 0;

        while (power <= 1000) {
            power *= 2;
            exponent++;
        }

        System.out.println(exponent);
        System.out.println(power);
         */

        //Opgave 4.19
        /*
        int i = 20;

        while (i > 0) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i--;
        }
         */

        //Opgave 4.20





    }
}