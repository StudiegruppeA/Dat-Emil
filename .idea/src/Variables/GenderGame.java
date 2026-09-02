package Variable;

import java.util.Scanner;

public class GenderGame {

    void main () {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your gender?: ");
        String gender = input.next();
        System.out.println("First name: ");
        String firstName = input.next();
        System.out.println("Last name: ");
        String lastName = input.next();
        System.out.println("Age: ");
        int age = input.nextInt();

        if (gender.equals("Female") & age>=20) {
            System.out.println("Are you married, " + firstName + "?");
            String isMarried = input.next();
            if (isMarried.equals("yes")) {
                System.out.println("Then I shall call you Mrs. " + lastName + ".");
            } else {
                System.out.println("Then I shall call you Ms. " + lastName + ".");
            }

        }
        else
            System.out.println("Then I shall call you " + firstName + " " + lastName + ".");

        if (gender.equals("Male") & age>=20) {
            System.out.println("Are you married, " + firstName + "?");
            String isMarried = input.next();
            input.nextLine();
            if (isMarried.equals("yes)")) {
                System.out.println("Then I shall call you Mr. " + lastName + ".");
            } else {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
            }
        }

    }
}
