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
    /*
        int getLength() {
            return 10;
        }

        int getWidth() {
            return 5;
        }

        int getArea() {
            return getLength() * getWidth();
        }

        void main() {
            System.out.println("Length: " + getArea());
            System.out.println("Width: " + getWidth());
            System.out.println("Area: " + getArea());
        }
     */

    // Opgave 3.35
    /*
    int[] scores = {70, 80, 90};

    int getSum() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    double getAverage() {
        int sum = getSum();
        double average = (double) sum / scores.length;
        return average;
    }

    void main() {
        System.out.println("The sum of the array is: " + getSum());
        System.out.println("The average of the array is: " + getAverage());
    }
     */

    // Opgave 3.36
    /*
    int getLength() {
        return 15;
    }

    int getWidth() {
        return 8;
    }

    int getPerimeter() {
        return 2 * getLength() + 2 * getWidth();
    }

    void main() {
        System.out.println("The perimeter is: " + getPerimeter());
    }
     */

    // Opgave 3.37
    /*
    int score = 75;

    char getGrade() {
        if (score >= 90) {
            return 'A';
        }
        else if (score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }
        else {
            return 'F';
        }


    }

    void main() {
        System.out.println("The score " + score + " gives you the grade " + getGrade());
    }
     */

    // Opgave 3.38
    /*
    boolean online = true;

    String getStatus() {
        if (online) {
            return "Online";
        }
        else {
            return "Offline";
        }
    }

    void main() {
        System.out.println("Status: " + getStatus());
    }
     */

    // Opgave 3.39
    /*
    int a = 15;
    int b = 23;

    int getMax() {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    void main() {
        System.out.println("The biggest number is: " + getMax());
    }
     */

    // Opgave 3.40
    /*
    int number = -42;

    int getAbsolute() {
        if (number < 0) {
            return -number;
        }
        else {
            return number;
        }
    }

    void main() {
        System.out.println("The absolute number is: " + getAbsolute());
    }
     */

    // Opgave 3.41
    /*
    double itemPrice = 200.0;

    double getPrice() {
        return itemPrice;
    }

    double getTaxAmount() {
        return itemPrice / 100 * 25;
    }

    double getTotal() {
        return getPrice() + getTaxAmount();
    }

    void main() {
        System.out.println("The total price is: " + getTotal());
    }
     */

    // Opgave 3.42
    /*
    int[] data = {12, 45, 23, 67, 34};

    int getCount() {
        return data.length;
    }

    int getSum() {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    double getAverage() {
        return (double) getSum() / getCount();
    }

    void main() {
        System.out.println("The count is: " + getCount());
        System.out.println("The sum is: " + getSum());
        System.out.println("The average is: " + getAverage());
    }
     */

    // Opgave 3.43
    /*
    int[] data = {12, 45, 23, 67, 34};

    int getMax() {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }

    void main() {
        System.out.println("The biggest number in the array is: " + getMax());
    }
     */

    // Opgave 3.44
    /*
    String playerName = "Hero";
    int health = 75;
    int maxHealth = 100;

    String getName() {
        return playerName;
    }

    int getHealth() {
        return health;
    }

    int getHealthPercent() {
        return (maxHealth / 100) * health;
    }

    boolean isAlive() {
        return health > 0;
    }

    void main() {
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth() + "/" + maxHealth + " (" + getHealthPercent() + "%)");
        System.out.println("Is alive: " + isAlive());
    }
     */

    // Opgave 3.46
    /*
        int dayNumber = 6;

        int getDayNumber() {
            return dayNumber;
        }

        boolean isWeekend() {
            return dayNumber == 6 || dayNumber == 7;
        }

        String getDayType() {
            switch (dayNumber) {
                case 1, 2, 3, 4, 5 -> {
                    return "Weekday";
                }
                case 6, 7 -> {
                    return "Weekend";
                }
                default -> {
                    return "Invalid day";
                }
            }
        }

        void main() {
            System.out.println("Number " + dayNumber + " is " + getDayType());
        }
     */

    // Opgave 3.47
    /*
    double tempCelsius = 28.5;

    double getCelsius() {
        return tempCelsius;
    }

    double getFahrenheit() {
        double fahrenheit = tempCelsius * 9/5 + 32;
        return fahrenheit;
    }

    boolean isHot() {
        return tempCelsius > 25;
    }

    boolean isFreezing() {
        return tempCelsius < 0;
    }

    String getDescription() {
        if (isHot()) {
            return "Hot";
        }
        else if (isFreezing()) {
            return "Freezing";
        }
        else if (tempCelsius < 10) {
            return "Cold";
        }
        else {
            return "Nice";
        }
    }

    void main() {
        System.out.println("Celsius: " + tempCelsius);
        System.out.println("Fahrenheit: " + getFahrenheit());
        System.out.println("Description: " + getDescription());
    }
     */

    // Opgave 3.48
    /*
    String accountHolder = "Anna";
    double balance = 1500.50;
    double withdrawLimit = 500.0;

    String getHolder() {
        return accountHolder;
    }

    double getBalance() {
        return balance;
    }

    double getWithdrawLimit() {
        return withdrawLimit;
    }

    boolean isRich() {
        return balance > 10000;
    }

    boolean canWithdraw() {
        return balance >= withdrawLimit;
    }

    void main() {
        System.out.println("Holder: " + getHolder());
        System.out.println("Balance: " + getBalance());
        System.out.println("Withdraw limit: " + getWithdrawLimit());
        System.out.println("Is rich: " + isRich());
        System.out.println("Can withdraw: " + canWithdraw());
    }
     */





}
