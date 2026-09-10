package ControlStructures.Opgaver;
// Concept: https://github.com/Dat1Cphbusiness/WorkingWithControlStructures/blob/main/concepts/level7.md
// Assignment: https://github.com/Dat1Cphbusiness/WorkingWithControlStructures/blob/main/assignments/level7.md
public class Level7 {

    void main () {

        // Opgave 7.1
        /*
        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }
         */

        // Opgave 7.2
        /*
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.print(number + " ");
        }
         */

        // Opgave 7.3
        /*
        int[] numbers = {5, 10, 15, 20};

        for (int number : numbers) {
            System.out.println(number * 2);
        }
         */

        // Opgave 7.4
        /*
        int[] numbers = {100, 200, 300};

        for (int number : numbers) {
            System.out.println("Value: " + number);
        }
         */

        // Opgave 7.5
        /*
        int[] numbers = {2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println(number * number);
        }
         */

        // Opgave 7.6
        /*
        String[] names = {"Anna", "Bob", "Carl", "Diana"};
         for (String name : names) {
             System.out.println(name);
         }
         */

        // Opgave 7.7
        /*
        String[] names = {"Alice", "Bob", "Charlie"};

        for (String name : names) {
            System.out.println("Hello, " + name);
        }
         */

        // Opgave 7.8
        /*
        String[] words = {"cat", "elephant", "dog", "butterfly"};

        for (String word : words) {
            System.out.println(word + " lenght is: " + word.length());
        }
         */

        // Opgave 7.9
        /*
        String[] words = {"hello", "world", "java"};

        for (String word : words) {
            System.out.println(word.toUpperCase());
        }
         */

        // Opgave 7.10
        /*
        String[] names = {"Anna", "Bob", "Carl"};

        for (String name : names) {
            System.out.println(name.charAt(0));
        }
         */

        // Opgave 7.11
        /*
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
         */

        // Opgave 7.12
        /*
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            sum += number;
            count++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ((double) sum / count));
         */

        // Opgave 7.13
        /*
        int[] numbers = {-5, 10, -3, 8, 0, 15, -2};
        int count = 0;

        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }
        System.out.println("There is " + count + " positive numbers");
         */

        // Opgave 7.14
        /*
        int[] numbers = {23, 45, 12, 67, 34, 89, 21};
        int max = numbers[0];

        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("The biggest number is: " + max);
         */

        // Opgave 7.15
        /*
        int[] numbers = {2, 3, 4, 5};
        int product = 1;

        for (int number : numbers) {
            product *= number;
        }
        System.out.println("The product is: " + product);
         */

        // Opgave 7.16
        /*
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */
        /*
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println(number);
        }
         */

        // Opgave 7.17
        /*
        int[] numbers = {10, 20, 30, 40};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
         */
        /*
        int[] numbers = {10, 20, 30, 40};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
         */

        // Opgave 7.18
        /*
        int[] numbers = {100, 200, 300};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Man kan ikke med index i for each loop, fordi man ikke har adgang til index
         */

        // Ogpave 7.21
        /*
        int[] numbers = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i <= 2; i++) {
            System.out.println(numbers[i]);
        }
        // Man kan ikke med for each
         */

        // Opgave 7.25
        /*
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("The index of " + target + " is: " + foundIndex);
         */

    }
}
