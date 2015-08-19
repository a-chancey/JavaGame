package game;

import java.util.*;
import java.lang.*;

class Game {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Shall we play a game?");
            System.out.println("Press 1 for string reverser.");
            System.out.println("Press 2 for number adder.");
            System.out.println("Press 3 for prime number finder: \n");

            int i = input.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Welcome to the String Reverser");
                    stringGame();
                    break;
                case 2:
                    addNums();
                    break;
                case 3:
                    findPrime();
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }

    private static void findPrime() {
    }

    private static void addNums() {
    }

    private static void stringGame() {
        while (true) {
            System.out.println("Please type a string:");
            Scanner stringy = new Scanner(System.in);
            String inputString = stringy.nextLine();

            String output = stringReverser(inputString);
            
            System.out.println("Your reversed string is " + output);
        }
    }

    public static String stringReverser(String inputString) {
        String reversed = new StringBuilder(inputString).reverse().toString();
        return reversed;
    }
}