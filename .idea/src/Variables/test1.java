package Variable;

import java.util.Scanner;

public class test1 {

    void main () {


        Scanner input = new Scanner(System.in);
        System.out.println("Hvor gammel er du?");
        int age = input.nextInt();

        if(age>=18) {
            System.out.println("Du må gerne komme ind. Du er " + age + " år gammel. Du er voksen!");
        }
        else if(age>12)
            System.out.println("Du må ikke komme ind. Du er teenager. Man skal være 18 år gameml for at komme ind");
        else{
            System.out.println("Du må ikke komme ind. Du er " + age + " år gammel. Man skal være 18 år gammel for at komme ind.");
        }

    }
}