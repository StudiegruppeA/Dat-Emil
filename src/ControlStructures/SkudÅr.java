package ControlStructures;

import java.util.Scanner;

public class SkudÅr {

    void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et årstal:");
        int year = input.nextInt();
        System.out.println("Indtast en måned (1 = Januar, 2 = Februar osv...)");
        int month = input.nextInt();
        String måned;
        boolean validMonth = true;
        switch (month) {
            case 1:
                måned = "Januar";
                break;
            case 2:
                måned = "Febuar";
                break;
            case 3:
                måned = "Marts";
                break;
            case 4:
                måned = "April";
                break;
            case 5:
                måned = "Maj";
                break;
            case 6:
                måned = "Juni";
                break;
            case 7:
                måned = "Juli";
                break;
            case 8:
                måned = "August";
                break;
            case 9:
                måned = "September";
                break;
            case 10:
                måned = "Oktober";
                break;
            case 11:
                måned = "November";
                break;
            case 12:
                måned = "December";
                break;
            default:
                måned = "Fejl";
                validMonth = false;
                System.out.println("Du skal indtaste et tal! Prøv igen!");

        }

        if (validMonth) {
            System.out.println("Vi er i " + måned + " " + year);
            if (year % 4 == 0) {
                System.out.println(year + " er et skudår");
            } else {
                System.out.println(year + " er et normalt år");
            }
        }
    }
}
