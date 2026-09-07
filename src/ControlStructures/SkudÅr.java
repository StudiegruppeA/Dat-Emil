package ControlStructures;

import java.util.Scanner;

public class SkudÅr {

    void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et årstal:");
        int year = input.nextInt();
        System.out.println("Indtast en måned (1 = Januar, 2 = Februar osv...)");
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("Vi er i Januar " + year);
                break;
            case 2:
                System.out.println("Vi er i Februar " + year);
                break;
            case 3:
                System.out.println("Vi er i Marts " + year);
                break;
            case 4:
                System.out.println("Vi er i April " + year);
                break;
            case 5:
                System.out.println("Vi er i Maj " + year);
                break;
            case 6:
                System.out.println("Vi er i Juni " + year);
                break;
            case 7:
                System.out.println("Vi er i Juli " + year);
                break;
            case 8:
                System.out.println("Vi er i August " + year);
                break;
            case 9:
                System.out.println("Vi er i September " + year);
                break;
            case 10:
                System.out.println("Vi er i Oktober " + year);
                break;
            case 11:
                System.out.println("Vi er i November " + year);
                break;
            case 12:
                System.out.println("Vi er i December " + year);
                break;
            default:
                System.out.println("Du skal indtaste et tal!");

        }

        if (year % 4 == 0) {
            System.out.println(year + " er et skudår");
        }
        else {
            System.out.println(year + " er et normalt år");
        }

    }
}
