package Mehods;

public class Methods {


    void printIfPositive(int number) {
        if (number > 0) {
            System.out.println(number);
        }
    }

    void main() {
        printIfPositive(-5);
        printIfPositive(0);
        printIfPositive(10);
        printIfPositive(20);
    }



}
