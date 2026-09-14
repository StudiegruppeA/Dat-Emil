package Mehods.Opgaver;

public class Level3 {

    // Opgave 3.1
    /*
    int getNumber() {
        return 42;
    }

    void main() {
        int result = getNumber();
        System.out.println(result);
    }
     */

    // Opgave 3.2
    /*
    String getMessage() {
        return "Hello, World!";
    }

    void main() {
        String message = getMessage();
        System.out.println(message);
    }
     */

    // Opgave 3.3
    /*
    double getPrice() {
        return 29.95;
    }

    void main() {
        double price = getPrice();
        System.out.println("Price: " + price);
    }
     */

    // Opgave 3.4
    /*
    boolean isReady() {
        return true;
    }

    void main() {
        boolean ready = isReady();
        System.out.println("Ready: " + ready);
    }
     */

    // Opgave 3.5
    /*
    Outputtet bliver:
    7
    7
     */

    // Opgave 3.6
    /*
    char getGrade() {
        return 'A';
    }

    void main() {
        char grade = getGrade();
        System.out.println("Grade: " + grade);
    }
     */

    // Opgave 3.7
    /*
    Fejlen er at getAge() ikke bliver brugt til noget, den printer ikke noget ud.
    Der kommer kun til at stå Done. Man kunne gemme getAge() i en variabel ved navn
    age og printe den ud
     */

    // Opgave 3.8
    /*
    String getAppName() {
        return "My App";
    }

    int getVersion() {
        return 1;
    }

    String getAuthor() {
        return "Anna";
    }

    void main() {
        String appName = getAppName();
        int version = getVersion();
        String author = getAuthor();
        System.out.println("App name: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Author: " + author);
    }
     */

    // Opgave 3.9
    /*
        int getNumber() {
            return 10;
        }

        void main() {
            int number = getNumber();
            System.out.println("Score: " + number);
            System.out.println("Age: " + number );
        }
     */

    // Ogpave 3.10
    /*
    int getBaseValue() {
        return 100;
    }

    void main() {
        int baseValue = getBaseValue();
        baseValue += 50;
        System.out.println(baseValue);
    }
     */

    // Opgave 3.11
    /*
    int getMultiplier() {
        return 5;
    }

    void main() {
        int multiplier = getMultiplier();
        int result = multiplier * 4;
        System.out.println("Result: " + result);
    }
     */

    // Opgave 3.12
    /*
    Outputtet bliver:
    40
     */

    // Opgave 3.13
    /*
    int getWidth() {
        return 8;
    }

    int getHeight() {
        return 5;
    }

    void main() {
        int width = getWidth();
        int height = getHeight();
        int area = width * height;
        System.out.println("Area: " + area);
    }
     */

    // Opgave 3.14
    /*
    int getRadius() {
        return 10;
    }

    void main() {
        int radius = getRadius();
        int diameter = radius * 2;
        double omkreds = (2 * 3.14 * radius);
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Omkreds: " + omkreds);
    }
     */

    // Opgave 3.15
    /*
        String getName() {
            return "Java";
        }

        String getType() {
            return "language";
        }

        void main() {
            String name = getName();
            String type = getType();
            System.out.println(name + " is a programming " + type);
        }
     */

    // Opgave 3.16
    /*
    double getPrice() {
        return 80.0;
    }

    void main() {
        double price = getPrice();
        double tax = price / 100 * 25;
        double total = price + tax;
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total price: " + total);
    }
     */

    // Opgave 3.17
    /*
    int a = 10;
    int b = 3;

    int getSum() {
        return a + b;
    }

    void main() {
        System.out.println(getSum());
    }
     */

    // Opgave 3.18
    /*
    int a = 10;
    int b = 3;

    int getDifference() {
        return a - b;
    }

    void main() {
        System.out.println(getDifference());
    }
     */

    // Opgave 3.19
    /*
    int width = 12;
    int height = 4;

    int getArea() {
        return width * height;
    }

    void main() {
        System.out.println("Area: " + getArea());
    }
     */

    // Opgave 3.20
    /*
    int score1 = 80;
    int score2 = 90;
    int score3 = 70;

    double getAverage() {
        return (score1 + score2 + score3) / 3;
    }

    void main() {
        System.out.println("Average: " + getAverage());
    }
     */

    // Opgave 3.21
    /*
    getMystery() returnere:
    17
    Outputtet bliver:
    17
     */

    // Opgave 3.22
    /*
    int radius = 7;

    double getCircleArea() {
        return 3.14 * radius * radius;
    }

    void main() {
        System.out.println("The area of the circle is: " + getCircleArea());
    }
     */

    // Opgave 3.23
    /*
    double celsius = 25.0;

    double getFahrenheit() {
        return celsius * 9/5 + 32;
    }

    void main() {
        System.out.println(celsius + " celsius is " + getFahrenheit() + " fahrenheit");
    }
     */

    // Opgave 3.24
    /*
    int[] numbers = {5, 10, 15, 20, 25};

    int getFirst() {
        return numbers[0];
    }

    int getLast() {
        return numbers[numbers.length - 1];
    }

    void main() {
        System.out.println("The first number is: " + getFirst());
        System.out.println("The last number is: " + getLast());
    }
     */

    // Opgave 3.25
    /*
    int age = 20;

    boolean isAdult() {
        return age >= 18;
    }

    void main() {
        System.out.println("You are an adult: " + isAdult());
    }
     */

    // Opgave 3.26
    /*
    int age = 20;

    boolean isAdult() {
        return age >= 18;
    }

    void main() {
        if (isAdult()) {
            System.out.println("Can vote");
        }
        else {
            System.out.println("Cannot vote");
        }
    }
     */

    // Opgave 3.27
    /*
    int number = -5;

    boolean isPositive() {
        return number > 0;
    }

    void main() {
        System.out.println("Number is positive: " + isPositive());
    }
     */

    // Opgave 3.28
    /*
    String text = "";

    boolean isEmpty() {
        return text.isEmpty();
    }

    void main() {
        System.out.println("Text is empty: " + isEmpty());
    }
     */

    // Opgave 3.29
    /*
    int lives = 0;

    boolean isGameOver() {
        return lives <= 0;
    }

    void main() {
        if (isGameOver()) {
            System.out.println("GAME OVER");
        }
        else {
            System.out.println("Keep playing");
        }
    }
     */

    // Opgave 3.30
    /*
    int value = 42;

    boolean isEven() {
        return value % 2 == 0;
    }

    void main() {
        if (isEven()) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
     */

    // Opgave 3.31
    /*
    int score = 65;

    boolean hasPassingGrade() {
        return score >= 50;
    }

    void main() {
        if (hasPassingGrade()) {
            System.out.println("Passed!");
        }
        else {
            System.out.println("Failed!");
        }
    }
     */

    // Opagve 3.32
    /*
    int age = 25;
    boolean hasLicense = true;

    boolean isAdult() {
        return age >= 18;
    }

    boolean canDrive() {
        return isAdult() && hasLicense;
    }

    void main() {
        System.out.println("Is allowed to drive: " + canDrive());
    }
     */

    // Opgave 3.33
    /*
    int getBasedPrice() {
        return 100;
    }

    int getPriceWithTax() {
        return getBasedPrice() / 100 * 25 + getBasedPrice();
    }

    void main() {
        System.out.println("Price with tax: " + getPriceWithTax());
    }
     */

    // Opgave 3.34

}
