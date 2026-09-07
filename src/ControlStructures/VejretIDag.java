package ControlStructures;

import java.util.Scanner;

public class VejretIDag {

    void main () {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast temperatur");
        int temperature = input.nextInt();

        if (temperature > 25) {
            System.out.println("Der er " + temperature + " grader.\nDet er varmt");
        }
        else if (temperature <= 0) {
            System.out.println("Der er " + temperature + " grader.\nDer er frostvejr");
        }
        else {
            System.out.println("Der er " + temperature + " grader.\nVejret er komfortabelt");
        }

    }
}
