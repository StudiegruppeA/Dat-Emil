package Mehods.Opgaver;

public class Level2 {

    // Opgave 2.1
    /*
    void printname(String name) {
        System.out.println("Name: " + name);
    }

    void main() {
        printname("Emil");
    }
     */

    // Opgave 2.2
    /*
    void printname(String name) {
        System.out.println("Name: " + name);
    }

    void main() {
        printname("Krsta");
        printname("Smilja");
        printname("Jannick");
    }
     */

    // Opgave 2.3
    /*
    void greet(String name) {
        System.out.println("Hello, " + name);
    }

    void main() {
        greet("Emil");
        greet("Jens");
        greet("Marko");
    }
     */

    // Opgave 2.4
    /*
    void greet(String name) {
        System.out.println("Hello, " + name);
    }

    void main() {
        String myName = "Emil";
        greet(myName);
    }
     */

    // Opgave 2.5
    /*
    void printMessage(String message) {
        System.out.println("*** " + message + " ***");
    }

    void main() {
        printMessage("BREAKING");
        printMessage("DONUT");
    }
     */

    // Opgave 2.6
    /*
    Outputtet bliver:
    >>> Start <<<
    >>> Middle <<<
    >>> End <<<
     */

    // Opgave 2.7
    /*
    void shout(String text) {
        System.out.println(text.toUpperCase());
    }

    void main() {
        shout("det kan altså ikke passe");
    }
     */

    // Opgave 2.8
    /*
    void whisper(String text) {
        System.out.println(text.toLowerCase());
    }

    void main() {
        whisper("DET KAN MÅSKE PASSE");
    }
     */

    // Opgave 2.9
    /*
    void printNumber(int number) {
        System.out.println("Number: " + number);
    }

    void main() {
        printNumber(10);
        printNumber(42);
        printNumber(100);
    }
     */

    // Opgave 2.10
    /*
    void printPrice(double price) {
        System.out.println("Price: " + price + " kr");
    }

    void main() {
        printPrice(29.96);
        printPrice(149.00);
    }
     */

    // Opgave 2.11
    /*
    void printStatus(boolean active) {
        System.out.println("Active: " + active);
    }

    void main() {
        printStatus(true);
        printStatus(false);
    }
     */

    // Opgave 2.12
    /*
    void printGrade(char grade) {
        System.out.println("Grade: " + grade);
    }

    void main() {
        printGrade('A');
        printGrade('B');
        printGrade('C');
    }
     */

    // Opgave 2.13
    /*
    void printScore(int points) {
        System.out.println("Score: " + points);
    }

    void main() {
        int score = 85;
        printScore(score);
    }
     */

    // Opgave 2.14
    /*
    void printNumber(int number) {
        System.out.println("Number: " + number);
    }

    void main() {
        printNumber(5 + 3);
        printNumber(10 * 2);
        printNumber(100 / 4);
    }
     */

    // Opgave 2.15
    /*
    void printTemperature (double temp) {
        System.out.println("Temperature: " + temp + " C");
    }

    void main() {
        printTemperature(22);
    }
     */

    // Opgave 2.16
    /*
    void printPercentage (int percent) {
        System.out.println(percent + "%");
    }

    void main() {
        printPercentage(20);
    }
     */

    // Opgave 2.17
    /*
    void printFullName (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    void main() {
        printFullName("Ida", "Jensen");
        printFullName("Emil", "Marinovic");
    }
     */

    // Opgave 2.18
    /*
    void printPerson(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

    void main() {
        printPerson("Emil", 20);
    }
     */

    // Opgave 2.19
    /*
    void printProduct(String name, double price, int quantity) {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }

    void main() {
        printProduct("Iphone", 9995.50, 2);
        printProduct("Egelykke koldskål", 10.0, 1);
    }
     */

    // Opgave 2.20
    /*
    Den printer:
    Score = 100
    Lives = 3
     */

    // Opgave 2.21
    /*
    void printLabeled(String label, String value) {
        System.out.println(label + ": " + value);
    }

    void main() {
        printLabeled("School", "Datamatiker");
    }
     */

    // Opgave 2.22
    /*
    void printRectangle(int width, int height) {
        System.out.println("Rectangle: " + width + " x " + height);
    }

    void main() {
        printRectangle(20, 10);
    }
     */

    // Opgave 2.23
    /*
    void printCoordinates(int x, int y) {
        System.out.println("(" + x + ", " + y + ")");
    }

    void main() {
        printCoordinates(4, 9);
    }
     */

    // Opgave 2.24
    /*
    void printRange(int min, int max) {
        System.out.println("Range: " + min + " to " + max);
    }

    void main() {
        printRange(10, 30);
    }
     */

    // Opgave 2.25
    /*
    void printIfPositive(int number) {
        if (number > 0) {
            System.out.println(number);
        }
    }

    void main() {
        printIfPositive(-2);
    }
     */

    // Opgave 2.26
    /*
    void printEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }
    }

    void main() {
        printEvenOdd(21);
    }
     */

    // Opgave 2.27
    /*
    void printAgeCategory(int age) {
        if (age < 13) {
            System.out.println("Child");
        }
        else if (age <= 19 && age >= 13) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Adult");
        }
    }

    void main() {
        printAgeCategory(99);
    }
     */

    // Opgave 2.28
    /*
    void printGradeText(int score) {
        if (score >= 90) {
            System.out.println("Excellent");
        }
        else if (score >= 70) {
            System.out.println("Good");
        }
        else if (score >= 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }

    void main() {
        printGradeText(67);
    }
     */

    // Opgave 2.29
    /*
    void printActiveStatus(boolean active) {
        if (active) {
            System.out.println("Status: ACTIVE");
        }

        else {
            System.out.println("Status: INACTIVE");
        }
    }

    void main() {
        printActiveStatus(true);
        printActiveStatus(false);
    }
     */

    // Opgave 2.30
    /*
    void printSign(int number) {
        if (number < 0) {
            System.out.println("Negative");
        }
        else if (number == 0) {
            System.out.println("Zero");
        }

        else {
            System.out.println("Positive");
        }
    }

    void main() {
        printSign(-10);
        printSign(0);
        printSign(50);
    }
     */

    // Opgave 2.31
    /*
    void printLarger(int a, int b) {
        if (a < b) {
            System.out.println(b);
        }
        else if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println("They are equal");
        }
    }

    void main() {
        printLarger(2, 10);
        printLarger(5, 2);
        printLarger(20, 20);
    }
     */

    // Opgave 2.32
    /*
    void printAbsolute(int number) {
        if (number < 0) {
            System.out.println(-number);
        } else {
            System.out.println(number);
        }
    }

    void main() {
        printAbsolute(10);
        printAbsolute(-10);
        printAbsolute(-3);
        printAbsolute(0);
    }
     */

    // Opgave 2.33
    /*
    void printStarts(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void main() {
        printStarts(5);
        printStarts(10);
        printStarts(2);
    }
     */

    // Opgave 2.34
    /*
    void printChar(char c, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    void main() {
        printChar('-', 10);
        printChar('/', 5);
        printChar('A', 3);
        printChar('*', 20);
    }
     */

    // Opgave 2.35
    /*
    void printCountdown(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println(i);
        }
    }

    void main() {
        printCountdown(5);
    }
     */

    // Opgave 2.36
    /*
    void printNumberRange(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }

    void main() {
        printNumberRange(5, 9);
    }
     */

    // Opgave 2.37
    /*
    void printRepeated(String message, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(message);
        }
    }

    void main() {
        printRepeated("Hej", 2);
    }
     */

    // Opgave 2.38
    /*
    void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void main() {
        printSquare(4);
    }
     */

    // Opgave 2.39
    /*
    void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void main() {
        printTriangle(4);
    }
     */

    // Opgave 2.40
    /*
    void printTableRow(int number) {
        System.out.println("=== " + number + " TABELLEN ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    void main() {
        printTableRow(10);
    }
     */

    // Opgave 2.41
    /*
    void printDivider(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    void printSection(String title, int width) {
        printDivider(width);
        System.out.println("--- " + title + " ---");
        printDivider(width);
    }

    void main() {
        printSection("CS 2", 12);
    }
     */

    // Opgave 2.42
    /*
    void printValidAge(int age) {
        if (age >= 0 && age <= 150) {
            System.out.println(age);
        }
        else {
            System.out.println("Invalid age");
        }
    }

    void printAge(int age) {
        printValidAge(age);
    }

    void main() {
        printAge(-2);
    }
     */

    // Opgave 2.43
    /*
    void printRectangleArea(int width, int height) {
        System.out.println("Rectangle: " + width + " * " + height);
        System.out.println("Area: " + width * height);
    }

    void main() {
        printRectangleArea(10, 4);
    }
     */

    // Opgave 2.44
    /*
    void printProgressBar(int percent) {
        int filled = percent / 10;
        int empty = 10 - filled;

        System.out.print("[");

        for (int i = 0; i < filled; i++) {
            System.out.print("=");
        }

        for (int i = 0; i < empty; i++) {
            System.out.print(" ");
        }

        System.out.print("] " + percent + "%");
    }

    void main() {
        printProgressBar(90);
    }
     */

    // Opgave 2.45
    /*
    void printAllNumber(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    void main() {
        int[] myNumbers = {11, 25, 73, 32, 65};
        printAllNumber(myNumbers);
    }
     */

    // Opgave 2.46
    /*
    void printArrayWithLabel(String label, int[] numbers) {
        System.out.println(label);
        for (int number : numbers) {
            System.out.println("  " + number);
        }
    }

    void main() {
        int[] myNumbers = {11, 25, 73, 32, 65};
        printArrayWithLabel("Scores:", myNumbers);
    }
     */

    // Opgave 2.47
    /*
    void printArraySum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    void main() {
        int[] myNumbers = {12, 54, 32, 87, 43, 12, 54};
        printArraySum(myNumbers);
    }
     */

    // Opgave 2.48
    /*
    void printHeader(String title) {
        System.out.println("=== " + title + " ===");
    }

    void printField(String label, String value) {
        System.out.println(label + ": " + value);
    }

    void printProfile(String name, int age, String city) {
        printHeader("User Profile");
        printField("Name: ", name);
        printField("Age: ", "" + age);
        printField("City: ", city);
    }

    void main() {
        printProfile("Emil", 20, "Frederiksværk");
        System.out.println();
        printProfile("Ida", 20, "Hundested");
        System.out.println();
        printProfile("Jesper", 35, "Ølstykke");
    }
     */
}
