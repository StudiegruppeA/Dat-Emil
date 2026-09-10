package ControlStructures.Opgaver;

public class Level6 {

    void main () {

        // Opgave 6.1
        /*
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */

        // Opgave 6.2
        /*
        int[] numbers = {5, 10, 15, 20};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
         */

        // Opgave 6.3
        /*
        String[] names = {"Anna", "Bob", "Carl", "Diana"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
         */

        // Opgave 6.4
        /*
        double[] prices = {12.5, 8.75, 15.0, 22.25};

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " kr");
        }
         */

        // Opgave 6.5
        /*
        int[] numbers = {2, 4, 6, 8, 10, 12};

        System.out.println("Array length: " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */

        // Opgave 6.6
        /*
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
         */

        // Opgave 6.7
        /*
        int[] scores = {85, 92, 78, 88, 95};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("The average of the scores is: " + ((double) sum / scores.length));
         */

        // Opgave 6.8
        /*
        int[] numbers = {3, 8, 12, 5, 20, 7, 14};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("There is " + count + " numbers that are even");
         */

        // Opgave 6.9
        /*
        int[] numbers = {45, 67, 23, 89, 12, 56, 78};
        int count =0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                count++;
            }
        }
        System.out.println("Numbers over 50: " + count);
         */

        // Opgave 6.10
        /*
        int[] numbers = {10, 25, 5, 30, 15, 20};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] >= 20) {
                count++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Count of numbers that are 20 or over: " + count);
         */

        // Opgave 6.11
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

        if (foundIndex != -1) {
            System.out.println("Found at index " + foundIndex);
        }
        else {
            System.out.println("Not found");
        }
         */

        // Opgave 6.12
        /*
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Array has " + target);
        }
        else {
            System.out.println("Array does not have " + target);
        }
         */

        // Opgave 6.13
        /*
        int[] numbers = {45, 12, 67, 23, 89, 8, 34};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + min);
         */

        // Opgave 6.14
        /*
        int[] numbers = {45, 12, 67, 23, 89, 8, 34};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("The biggest number is: " + max);
         */

        // Opgave 6.15
        /*
        int[] numbers = {34, 78, 12, 56, 90, 23, 67};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        int range = max - min;
        System.out.println("The biggest number is " + max);
        System.out.println("The smallest number is " + min);
        System.out.println("The range is " + range);
         */

        // Opgave 6.16
        /*
        int[] numbers = {5, 10, 15, 20};
        int value = 0;

        System.out.print("Before: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.print("After: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
            System.out.print(numbers[i] + " ");
        }
         */

        // Opgave 6.17
        /*
        int[] numbers = {10, 20, 30, 40};

        System.out.print("Before: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.print("After: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 5;
            System.out.print(numbers[i] + " ");
        }
         */

        // Opgave 6.18
        /*
        int[] numbers = {10, -5, 20, -15, 30};

        System.out.print("Before: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.print("After: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
            System.out.print(numbers[i] + " ");
        }
         */

        // Opgave 6.19
        /*
        int[] scores = {25, 50, 75, 100};
        double[] percentages = new double[scores.length];

        for (int i = 0; i < scores.length; i++) {
            percentages[i] = scores[i] / 100.0;
        }

        System.out.print("Percentages: ");
        for (int i = 0; i < percentages.length; i++) {
            System.out.print(percentages[i] + " ");
        }
         */

        // Opgave 6.20
        /*
        int[] numbers = {2, 3, 4, 5};

        System.out.print("Before: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.print("After: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] * numbers[i] + " ");
        }
         */

        // Opgave 6.21
        /*
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
         */

        // Opgave 6.22
        /*
        int[] numbers = {5, 10, 15, 20};
        int sum = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            sum += numbers[i];
            System.out.println("The new sum is: " + sum);
        }
         */

        // Opgave 6.23
        /*
        int[] numbers = {10, 20, 30, 20, 40};
        int target = 20;
        int foundIndex = -1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("The index of the last 20 is " + foundIndex);
        }
        else {
            System.out.println("No index has " + target + " in it");
        }
         */

        // Opgave 6.24
        /*
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            System.out.println(numbers[left]);
            if (left != right) {
                System.out.println(numbers[right]);
            }
            left++;
            right--;
        }
         */

        // Opgave 6.25
        /*
        int[] numbers = {5, 15, 25, 35, 45, 55};
        int countFromStart = 0;
        int countFromEnd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 20) {
                countFromStart++;
            }
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > 20) {
                countFromEnd++;
            }
        }

        System.out.println("From start: " + countFromStart);
        System.out.println("From end: " + countFromEnd);
         */
    }
}
