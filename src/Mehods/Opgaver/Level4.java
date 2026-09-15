package Mehods.Opgaver;

public class Level4 {
    // Opgave 4.1
    /*
    int add(int a, int b) {
        return a + b;
    }

    void main() {
        System.out.println(add(5, 3));
        System.out.println(add(10, 20));
    }
     */

    // Opgave 4.2
    /*
    int subtract(int a, int b) {
        return a - b;
    }

    void main() {
        System.out.println(subtract(10, 4));
    }
     */

    // Opgave 4.3
    /*
    int multiply(int a, int b) {
        return a * b;
    }

    void main() {
        System.out.println(multiply(12, 4));
    }
     */

    // Opgave 4.4
    /*
    int square(int n) {
        return n * n;
    }

    void main() {
        System.out.println(square(7));
    }
     */

    // Opgave 4.5
    /*
    int doubleIt(int n) {
        return n * 2;
    }

    void main() {
        System.out.println(doubleIt(5));
    }
     */

    // Opgave 4.6
    /*
    Outputtet bliver:
    36
     */

    // Opgave 4.7
    /*
        int calculateArea(int width, int height) {
            return width * height;
        }

        void main() {
            System.out.println(calculateArea(7, 8));
        }
     */

    // Opgave 4.8
    /*
    int square(int n) {
        return n * n;
    }

    void main() {
        System.out.println(square(3) + square(4));
    }
     */

    // Opgave 4.9
    /*
        double half(double n) {
            return n / 2;
        }

        void main() {
            System.out.println(half(51));
        }
     */

    // Opgave 4.10
    /*
        double toFahrenheit(double celsius) {
            return celsius * 9/5 + 32;
        }

        void main() {
            System.out.println("27 celsius is " + toFahrenheit(27) + " fahrenheit");
        }
     */

    // Opgave 4.17
    /*
    boolean isPositive(int n) {
        return n > 0;
    }

    void main() {
        System.out.println(isPositive(100));
    }
     */

    // Opgave 4.18
    /*
    boolean isEven(int n) {
        return n % 2 == 0;
    }

    void main() {
        int number = 67;
        System.out.println(number + " is even: " + isEven(number));
    }
     */

    // Opgave 4.20
    /*
    boolean isAdult(int age) {
        return age >= 18;
    }

    void main() {
        int userAge = 20;
        if (isAdult(userAge)) {
            System.out.println("You can buy beer");
        }
        else {
            System.out.println("You can not buy beer");
        }
    }
     */

    // Opgave 4.22
    /*
    boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    void main() {
        int score = 89;
        if (isValidScore(score)) {
            System.out.println("Valid score");
        }
        else {
            System.out.println("Invalid score");
        }
    }
     */

    // Opgave 4.25
    /*
    String greet(String name) {
        return "Hello, " + name;
    }

    void main() {
        System.out.println(greet("Sofus"));
    }
     */

    // Opgave 4.26
    /*
    String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    void main() {
        System.out.println("Hey " + fullName("Emil", "Marinovic"));
    }
     */

    // Opgave 4.27
    /*
    String exclaim(String text) {
        return text + "!";
    }

    void main() {
        String message = "Hej og velkommen";
        System.out.println(exclaim(message));
    }
     */

    // Opgave 4.29
    /*
    String repeat(String text, int times) {
        String result = "";
        for (int i = 1; i <= times; i++) {
            result += text;
        }
        return result;
    }

    void main() {
        System.out.println(repeat("Hallo ", 10));
        System.out.println(repeat("Hej med dig ", 5));
    }
     */

    // Opgave 4.32
    /*
    char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        }
        else if (score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }
        else if (score >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    void main() {
        int score = 67;
        System.out.println("The score " + score + " gave you the grade: " + getGrade(score));
    }
     */

    // Opgave 4.33
    /*
    int[] numbers = {2, 6, 54, 12, 2, 65, 8, 3, 1, 23};

    int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    void main() {
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Sum of the numbers: " + sum(numbers));
    }
     */

    // Opgave 4.34
    /*
    int[] numbers = {2, 6, 54, 12, 2, 65, 8, 3, 1, 23};

    double average(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    void main() {
        System.out.println("The average of the numbers is: " + average(numbers));
    }
     */

    // Opgave 4.35
    /*
    int[] numbers = {2, 6, 54, 12, 2, 65, 8, 3, 1, 23};

    int findMax(int [] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    void main() {
        System.out.println("The biggest number in the array is: " + findMax(numbers));
    }
     */

    // Opgave 4.37
    /*
    int[] numbers = {2, 6, 54, 12, 2, 65, 8, 3, 1, 23, 2, 6, 3, 2, 6, 3, 2, 1, 54, 2};

    int count(int[] numbers, int target) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        return count;
    }

    void main() {
        System.out.println(count(numbers, 2));
    }
     */

    // Opgave 4.41
    /*
    double applyDiscount(double price, int discountPercent) {
        return price - price / 100 * discountPercent;
    }

    void main() {
        double price = 150.0;
        int discountPercent = 25;
        System.out.println(applyDiscount(price, discountPercent));
    }
     */

    // Opgave 4.45
    /*
    boolean isLongEnough(String password, int minLength) {
        return password.length() >= minLength;
    }

    boolean hasDigit(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    boolean isValidPassword(String password) {
        return password.length() >= 8 && hasDigit(password);
    }

    void main() {
        System.out.println(isValidPassword("abc"));
        System.out.println(isValidPassword("abcdefgh"));
        System.out.println(isValidPassword("abcdef1"));
        System.out.println(isValidPassword("abcdefg1"));
    }
     */

    // Opgave 4.48
    /*
    int[] numbers = {12, 45, 23, 67, 34, 89, 21};

    int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    double average(int[] numbers) {
        return sum(numbers) / numbers.length;
    }

    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    int getRange(int[] numbers) {
        return findMax(numbers) - findMax(numbers);
    }

    void main() {
        System.out.println("=== Numbers ===");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("The sum of the array is: " + sum(numbers));
        System.out.println("The average of the array is: " + average(numbers));
        System.out.println("The biggest number in the array is: " + findMax(numbers));
        System.out.println("The smallest number in the array is: " + findMin(numbers));
        System.out.println("The range in the array is: " + getRange(numbers));
    }
     */
}
