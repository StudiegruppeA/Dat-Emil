package Variable;

import java.util.Scanner;

public class Huskeliste {

    void main () {
        String[] huskeliste = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast første ting:");
        String firstItem = input.nextLine();
        huskeliste[0] = firstItem;
        System.out.println("Indtast anden ting:");
        String secondItem = input.nextLine();
        huskeliste[1] = secondItem;
        System.out.println("Indtast tredje ting:");
        String thirdItem = input.nextLine();
        huskeliste[2] = thirdItem;
        System.out.println("Indtast fjerde ting:");
        String fourthItem = input.nextLine();
        huskeliste[3] = fourthItem;
        System.out.println("Indtast femte ting:");
        String fifthItem = input.nextLine();
        huskeliste[4] = fifthItem;

        System.out.println("Du skal huske følgende:");
        System.out.println("- " + firstItem);
        System.out.println("- " + secondItem);
        System.out.println("- " + thirdItem);
        System.out.println("- " + fourthItem);
        System.out.println("- " + fifthItem);

    }
}
