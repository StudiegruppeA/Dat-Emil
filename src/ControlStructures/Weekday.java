package ControlStructures;

import java.util.Scanner;

public class Weekday {

    void main () {

        String[] days = {"Monday", "Friday", "Saturday", "Sunday"};
        String startEveryMessage = "Hello, World\nI hope you have a nice ";
        String mondayMessage = " and a great week ahead of you.";
        String fridayMessage = ". Be happy, it will be weekend soon.";
        String weekendMessage = " and are enjoying the weekend.";
        String codeMessage = "Always remember to code a little bit every day";

        Scanner input = new Scanner(System.in);
        System.out.println("Which day is it today? (\"Monday\", \"Friday\", \"Saturday\" or \"Sunday\")");
        String currentDay = input.nextLine();
        if (currentDay.equals("Monday") || currentDay.equals("Friday") || currentDay.equals("Saturday") || currentDay.equals("Sunday")) {
            System.out.print(startEveryMessage);
            switch (currentDay) {
                case "Monday":
                    System.out.println(days[0] + mondayMessage);
                    break;
                case "Friday":
                    System.out.println(days[1] + fridayMessage);
                    break;
                case "Saturday":
                    System.out.println(days[2] + weekendMessage);
                    break;
                case "Sunday":
                    System.out.println(days[3] + weekendMessage);
                    break;
                default:
                    System.out.println(" ");
            }
            System.out.println(codeMessage);
        }
        else {
            System.out.println("You have to enter a day!");
        }
    }
}
