package edu.sfsu;

import edu.sfsu.classes.Books;
import edu.sfsu.classes.Cars;
import edu.sfsu.classes.Coins;
import edu.sfsu.classes.Collectables;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Books books = null;
        Cars cars   = null;
        Coins coins = null;
        Collectables collectables = null;

        Scanner choice;
        Scanner input = new Scanner(System.in);
        String item;
        int option;
        int selection;

        do {
            System.out.println("1) Add a new item for auction");
            System.out.println("2) View items offered for auction");
            System.out.println("3) Remove an item");
            System.out.println("4) Save & Exit");
            System.out.println("5) Exit without Saving");

            System.out.print("\nSelect an Option: ");

            option = input.nextInt();

            switch (option) {
                case 1:
                    choice = new Scanner(System.in);
                    System.out.print("What kind of item would you like to add? (car, coin, collectable or book): ");
                    item = choice.nextLine();

                    switch(item) {
                        case "car":
                            cars = new Cars();

                            System.out.println("Please enter the following details for your " + item);

                            System.out.print("Make: ");
                            item = choice.nextLine();
                            cars.setMake(item);

                            System.out.print("Model: ");
                            item = choice.nextLine();
                            cars.setModel(item);

                            System.out.print("Year: ");
                            selection = choice.nextInt();
                            cars.setYear(selection);

                            System.out.print("Odometer: ");
                            selection = choice.nextInt();
                            cars.setOdometer(selection);
                            break;
                        case "book":
                            books = new Books();
                            System.out.println("Please enter the following details for your " + item);

                            System.out.println("Title: ");
                            item = choice.nextLine();
                            books.setTitle(item);

                            System.out.println("Author: ");
                            item = choice.nextLine();
                            books.setTitle(item);

                            System.out.println("Condition: ");
                            item = choice.nextLine();
                            books.setCondition(item);

                            System.out.println("Year Published: ");
                            selection = choice.nextInt();
                            books.setPublished(selection);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Make "  + cars.getMake());
                    System.out.println("Model " + cars.getModel());
                    System.out.println("Year "  + cars.getYear());
                    System.out.println("Miles " + cars.getOdometer());
                    System.out.println("\n");
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
 *  Notes:
 *  Program Enhancements
 *  1. If there are no items added to auction, then options 2 - 4 should not be an option, only until items have been added should the user see
 *     options 2 - 3.
 * */
