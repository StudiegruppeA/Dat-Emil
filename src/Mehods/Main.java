package Mehods;

import java.util.Scanner;

    public class Main {
        Scanner scanner = new Scanner(System.in);

        void displayFormatedText(String text) {
            System.out.println("==============================");
            System.out.println(text);
            System.out.println("==============================");
        }

        void getDisplayDivider() {
            System.out.println("--------------------------------");
        }

        void getUserDetails() {

        }

        String getCategory(int age) {
            String category;
            if (age < 18) {
                category = "Youth";
            } else if (age < 65) {
                category = "Adult";
            } else {
                category = "Senior";
            }
            return category;
        }

        void main() {

            displayFormatedText("WORKSHOP REGISTATION");

            // ---- Participant 1 ----
            getDisplayDivider();
            System.out.print("Enter name: ");
            String name1 = scanner.nextLine();

            System.out.print("Enter email: ");
            String email1 = scanner.nextLine();

            System.out.print("Enter age: ");
            int age1 = Integer.parseInt(scanner.nextLine());

            String category1 = getCategory(age1);

            getDisplayDivider();
            System.out.println("Name:     " + name1);
            System.out.println("Email:    " + email1);
            System.out.println("Age:      " + age1);
            System.out.println("Category: " + category1);
            getDisplayDivider();

            // ---- Participant 2 ----
            getDisplayDivider();
            System.out.print("Enter name: ");
            String name2 = scanner.nextLine();

            System.out.print("Enter email: ");
            String email2 = scanner.nextLine();

            System.out.print("Enter age: ");
            int age2 = Integer.parseInt(scanner.nextLine());

            String category2 = getCategory(age2);

            getDisplayDivider();
            System.out.println("Name:     " + name2);
            System.out.println("Email:    " + email2);
            System.out.println("Age:      " + age2);
            System.out.println("Category: " + category2);
            getDisplayDivider();

            // ---- Summary ----
            int totalAge = age1 + age2;
            double averageAge = totalAge / 2.0;

            displayFormatedText("SUMMARY");
            System.out.println("Participants: 2");
            System.out.println("Average age:  " + averageAge);
            System.out.println("==============================");

            scanner.close();
        }
    }

