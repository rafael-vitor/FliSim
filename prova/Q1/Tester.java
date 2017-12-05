package prova.Q1;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Creating a Canine: ");
        System.out.println("Please enter its name: ");
        String name = reader.nextLine();

        System.out.println("Please enter its race: ");
        String race = reader.nextLine();

        System.out.println("Please enter its port: ");
        String port = reader.nextLine();

        System.out.println("Please enter its age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Please enter its type: ");
        String type = reader.nextLine();

        System.out.println("Please enter its furColor: ");
        String furColor = reader.nextLine();


        Canine dog = new Canine(name, race, port, age, type, furColor);

        System.out.println("Very good, now creating a feline: ");
        System.out.println("Please enter its name: ");
        name = reader.nextLine();

        System.out.println("Please enter its race: ");
        race = reader.nextLine();

        System.out.println("Please enter its port: ");
        port = reader.nextLine();

        System.out.println("Please enter its age: ");
        age = Integer.parseInt(reader.nextLine());

        System.out.println("Please enter its type: ");
        type = reader.nextLine();

        System.out.println("Please enter its furColor: ");
        furColor = reader.nextLine();

        Feline cat = new Feline(name, race, port, age, type, furColor);


        System.out.println("You created a : ");
        System.out.println(dog.toString());
        System.out.println("and a : ");
        System.out.println(cat.toString());

    }
}
