package ControlStructures.Opgaver;

import java.util.Scanner;

public class Weekdays {

    void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et nummer mellem 1 og 7");
        int dayNumber = input.nextInt();
        if (dayNumber == 1) {
            System.out.println("Det er mandag");
        }
        else if (dayNumber == 2) {
            System.out.println("Det er tirsdag");
        }
        else if (dayNumber == 3) {
            System.out.println("Det er onsdag");
        }
        else if (dayNumber == 4) {
            System.out.println("Det er torsdag");
        }
        else if (dayNumber == 5) {
            System.out.println("Det er fredag");
        }
        else if (dayNumber == 6) {
            System.out.println("Det er lørdag");
        }
        else if (dayNumber == 7) {
            System.out.println("Det er søndag");
        }
        else {
            System.out.println("Du skal indtaste et nummer mellem 1 og 7! Prøv igen");
        }

    }
}
