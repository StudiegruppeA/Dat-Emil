package ControlStructures;

public class MaxMinArray {

    void main() {
        int[] number = {2, 10, 17, 1, 5, 27, 35, 4, 9, 18};

        int biggestNumber = number[0];
        int lowestNumber = number[0];

        if (number[1] > biggestNumber) {
            biggestNumber = number[1];
        }
        if (number[2] > biggestNumber) {
            biggestNumber = number[2];
        }
        if (number[3] > biggestNumber) {
            biggestNumber = number[3];
        }
        if (number[4] > biggestNumber) {
            biggestNumber = number[4];
        }
        if (number[5] > biggestNumber) {
            biggestNumber = number[5];
        }
        if (number[6] > biggestNumber) {
            biggestNumber = number[6];
        }
        if (number[7] > biggestNumber) {
            biggestNumber = number[7];
        }
        if (number[8] > biggestNumber) {
            biggestNumber = number[8];
        }
        if (number[9] > biggestNumber) {
            biggestNumber = number[9];
        }

        if (number[1] < lowestNumber) {
            lowestNumber = number[1];
        }
        if (number[2] < lowestNumber) {
            lowestNumber = number[2];
        }
        if (number[3] < lowestNumber) {
            lowestNumber = number[3];
        }
        if (number[4] < lowestNumber) {
            lowestNumber = number[4];
        }
        if (number[5] < lowestNumber) {
            lowestNumber = number[5];
        }
        if (number[6] < lowestNumber) {
            lowestNumber = number[6];
        }
        if (number[7] < lowestNumber) {
            lowestNumber = number[7];
        }
        if (number[8] < lowestNumber) {
            lowestNumber = number[9];
        }
        if (number[9] < lowestNumber) {
            lowestNumber = number[9];
        }



        System.out.println("The biggest number is: " + biggestNumber);
        System.out.println("The lowest number is: " + lowestNumber);



    }
}
