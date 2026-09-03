package Variables;

import java.util.Scanner;

public class MyFirstProgram {


    void main() {
/*
        String name = "Emil Marinovic";
        String adress = "Lathyrusvej 25";
        int zipCode = 3300;
        String city = "Frederiksværk";
        String study = "Datamatiker";
        System.out.println(name);
        System.out.println(adress);
        System.out.println(zipCode + " " + city);
        System.out.println("Kære " + name);
        System.out.println("Tillykke - du er hermed optaget på " + study);

 */


        Scanner readFromKeyboard = new Scanner(System.in);
        System.out.println("Hvad hedder du?");
        String name = readFromKeyboard.nextLine();
        System.out.println("Er du en mand eller kvinde?");
        String gender = readFromKeyboard.nextLine();
        System.out.println("Hvor gammel er du?");
        int age = readFromKeyboard.nextInt();
        readFromKeyboard.nextLine();
        System.out.println("Hvilken skostørrelse bruger du?");
        int shoeSize = readFromKeyboard.nextInt();
        readFromKeyboard.nextLine();
        System.out.println("Hvilken by bor du i?");
        String city = readFromKeyboard.nextLine();
        System.out.println("Hvad er din adresse?");
        String adress = readFromKeyboard.nextLine();

        System.out.println("Du hedder " + name);
        if (gender.equals("mand")) {
            System.out.println("Du er en mand \uD83D\uDC68");
        }else if (gender.equals("kvinde")) {
            System.out.println("Du er en kvinde \uD83D\uDC69");
        }else {
            System.out.println("Du skal skrive om du er en mand eller kvinde!");
        }
        System.out.println("Du er 20 år gammel " + age);
        System.out.println("Du bruger størrelse " + shoeSize + " i sko \uD83D\uDC5F");
        System.out.println("Du bor i " + city + " \uD83D\uDCCD");
        System.out.println("Din adresse er " + adress + " \uD83C\uDFE0");






    }
}
