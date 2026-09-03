package ControlStructures.Opgaver;

public class Level2 {
// Concepts: https://github.com/Dat1Cphbusiness/WorkingWithControlStructures/blob/main/concepts/level2.md
// Assignment: https://github.com/Dat1Cphbusiness/WorkingWithControlStructures/blob/main/assignments/level2.md

    void main() {

        //Opgave 2.1
        /*
        int age = 25;
        boolean hasLicense = true;
        if (age >=18 && hasLicense) {
            System.out.println("Can drive");
        }
        */

        //Opgave 2.2
        /*
        int age = 25;
        boolean hasLicense = false;
        if (age >= 18 && hasLicense) {
            System.out.println("Can drive");
        }
        else
            System.out.println("Cannot drive");
         */

        //Opgave 2.3
        /*
        int number = 15;
        if (number > 10 && number <= 20) {
            System.out.println("Number is between 10 and 20");
        }
         */

        //Opgave 2.4
        /*
        int age = 22;
        boolean hasTicket = true;
        boolean isBanned = false;
        if ((age >= 18 && hasTicket) && !isBanned) {
            System.out.println("Welcome");
        }
         */

        //Opgave 2.5
        /*
        int hour = 14;
        if (hour > 9 && hour < 17) {
            System.out.println("Working hours");
        }
        else
            System.out.println("Outside working hours");
         */

        //Opgave 2.6
        /*
        int age =10;
        if (age < 12 || age > 65) {
            System.out.println("Discount");
        }
         */

        //Opgave 2.7
        /*
        String day = "Saturday";
        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Weekend");
        }
        else
            System.out.println("Weekday");
         */

        //Opgave 2.8
        /*
        int temperature = 40;
        if (temperature > 39 || temperature < 35) {
            System.out.println("Call emergency");
        }
        else
            System.out.println("Normal temperature");
         */

        //Opgave 2.9
        /*
        String command = "start";
        if (command.equals("start") || command.equals("run") || command.equals("begin")) {
            System.out.println("Valid");
        }
        else
            System.out.println("Invalid");
         */

        //Opgave 2.10
        /*
        int score = 55;
        boolean hasRetake = true;
        if (score >= 60 || (score>= 50 && hasRetake)) {
            System.out.println("Pass");
        }
        else
            System.out.println("Fail");
         */

        //Opgave 2.11
        /*
        boolean isActive = false;
        if (!isActive) {
            System.out.println("Inactive");
        }
        */

        //Opgave 2.12
        /*
        boolean isNotReady = false;
        if(!isNotReady) {
            System.out.println("Is ready");
        }
         */

        //Opgave 2.13
        /*
        boolean hasPermission = false;
        if (!hasPermission) {
            System.out.println("Acces denied");
        }
         */

        //Opgave 2.14
        /*
        int age = 20;
        boolean hasID = false;
        if (age >= 18 && !hasID) {
            System.out.println("Entry denied - need ID");
        }
         */

        //Opgave 2.15
        /*
        boolean isRunning = true;
        boolean hasErrors = false;
        if (isRunning && !hasErrors) {
            System.out.println("System OK");
        }
        else
            System.out.println("System issue");
         */

        //Opgave 2.16
        /*
        int score = 85;
        boolean hasAttendance = true;
        if (score >= 90) || (score >= 80 && hasAttendance)) {
            System.out.println("Bonus awarded");
        }
        else
            System.out.println("No bonus");
         */

        //Opgave 2.17
        /*
        int age = 30;
        boolean hasLicense = false;
        boolean hasPermit = true;
        if ((age >= 18 && age < 65) && (hasLicense || hasPermit)) {
            System.out.println("Eligible");
        }
        else
            System.out.println("Not eligible");
         */

        //Opgave 2.18
        /*
        boolean isMember = false;
        double purchaseAmount = 600.0;
        boolean blacklisted = false;
        if ((isMember || purchaseAmount > 500) && !blacklisted) {
            System.out.println("Discount available");
        }
        else
            System.out.println("No discount");
         */

        //Opgave 2.19
        /*
        boolean correctPassword = true;
        boolean accountActive = false;
        boolean isAdmin = false;
        if((correctPassword && accountActive) || isAdmin) {
            System.out.println("Login succesful");
        }
        else
            System.out.println("Login failed");
         */

        //Opgave 2.20
        /*
        boolean isVIP = false;
        boolean isMember = true;
        int points = 1200;
        boolean suspended = false;
        if (isVIP || (isMember && points > 1000)) {
            System.out.println("Priority acces");
        }
        else
            System.out.println("Standard acces");
         */

        //Opgave 2.21
        /*
        int temp = 22;
        int humidity = 45;
        if ((temp >= 18 && temp <= 25) && (humidity >= 30 && humidity <= 60)) {
            System.out.println("Comfortable");
        }
        else
            System.out.println("Uncormfortable");
         */

        //Opgave 2.22
        /*
        int month = 6;
        int day = 15;
        int year = 2024;
        if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31) && (year > 1900)) {
            System.out.println("Valid date");
        }
        else
            System.out.println("Invalid date");
         */

        //Opgave 2.23
        /*
        double price = 299.0;
        String category = "Electronics";
        boolean inStock = true;
        if ((price >= 100 && price <= 500) && (category.equals("Electronics") || category.equals("Books") && inStock)) {
            System.out.println("Match found");
        }
        else
            System.out.println("No match");
         */

        //Opgave 2.24
        /*
        int score = 75;
        String grade;
        if (score >= 90) {
            grade = "A";
        }
        else if (score >= 80 && score < 90) {
            grade = "B";
        }
        else if (score >= 70 && score < 80) {
            grade = "C";
        }
        else if (score >= 60 && score < 70) {
            grade = "D";
        }
        else
            grade = "F";
        System.out.println("Grade: " + grade);
         */

        //Opgave 2.25
        /*
        int length = 10;
        boolean hasUpper = true;
        boolean hasLower = true;
        boolean hasSpaces = false;
        if (length >= 8 || (hasUpper && hasLower) && !hasSpaces) {
            System.out.println("Valid password");
        }
        else
            System.out.println("Invalid password");
         */
    }
}
