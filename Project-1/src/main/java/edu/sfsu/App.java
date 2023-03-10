package edu.sfsu;

import edu.sfsu.classes.Cars;
import edu.sfsu.classes.Coins;
import edu.sfsu.interfaces.Car;
import edu.sfsu.interfaces.Coin;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        int option = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Select an Option");
            System.out.println("1) Add a new item for auction");
            System.out.println("2) View items offered for auction");
            System.out.println("3) Remove an item");
            System.out.println("4) Save & Exit");
            System.out.println("5) Exit without Saving");

            option = input.nextInt();

            switch (option) {
                case 1:
                    Scanner choice = new Scanner(System.in);
                    System.out.println("What kind of item would you like to add? (car, coin, collectable or book)");
                    String item = choice.nextLine();
                    switch(item) {
                        case "car":
                            Cars cars = new Cars();

                            System.out.print("Make: ");
                            item = choice.nextLine();
                            cars.setMake(item);

                            System.out.print("Model: ");
                            item = choice.nextLine();
                            cars.setModel(item);

                            System.out.println("Make " + cars.getMake());
                            System.out.println("Model " + cars.getModel());

                            break;
                        case "coin":
                            new Coins();
                            break;
                    }
                    System.out.println("Your choice: " + item);
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("case 3");
                    break;
                case 4:
                    System.out.println("case 4");
                    break;
                case 5:
                    System.out.println("Exit with Saving");
                    break;
                default:
                    System.out.println("Error: invalid option");
                    System.exit(1);
            }
        } while(option != 5);
    }
}
/*
 *  Car, Coin, Collectable or Rare Book
 *
 *
 * */
