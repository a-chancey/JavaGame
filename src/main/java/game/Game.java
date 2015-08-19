package game;

import java.util.*;
import java.lang.*;

class Game {
    public static Boolean running;

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Shall we play a game?");
            System.out.println("Press 1 for string reverser.");
            System.out.println("Press 2 for number adder.");
            System.out.println("Press 3 for prime number finder.");
            System.out.println("Press 4 to quit: \n");
            running = true;

            int i = input.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Welcome to the String Reverser");
                    stringGame();
                    break;
                case 2:
                    System.out.println("Welcome to the number adder!");
                    addNums();
                    break;
                case 3:
                    System.out.println("Welcome to the prime finder");
                    primeGame();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }

    private static void primeGame() {
        while (running == true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter a whole number");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("esc")) {
                    running = false;
                }
                int num = Integer.parseInt(input);

                Boolean result = primeFinder(num);
                if (result == true)
                    System.out.println("Your number, " + num + " is prime!");
                else
                    System.out.println("Your number, " + num + " is not prime!");
            } catch (Exception e) {
                if (running == true) {
                    System.out.println("Invalid number, try again.");
                    primeGame();
                }
                else
                    return;
            }
        }
    }


    private static void addNums() {
        while (running = true) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Input a whole number:");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("esc")) {
                    running = false;
                }
                int x = Integer.parseInt(input);

                System.out.println("Input a second whole number:");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("esc")) {
                    running = false;
                }
                int y = Integer.parseInt(input);

                x = x + y;
                System.out.println("Your answer is: " + x);
            }catch(Exception e) {
                if (running == true) {
                    System.out.println("Invalid number, try again.");
                    addNums();
                }
                else
                    return;
            }
        }
    }

    private static void stringGame() {
        while (true) {
            System.out.println("Please type a string:");
            Scanner stringy = new Scanner(System.in);
            String inputString = stringy.nextLine();

            if(inputString.equalsIgnoreCase("esc")) {
                running = false;
                return;
            }

            String output = stringReverser(inputString);

            System.out.println("Your reversed string is " + output);
        }
    }

    public static String stringReverser(String inputString) {
        String reversed = new StringBuilder(inputString).reverse().toString();
        return reversed;
    }

    public static Boolean primeFinder(int x) {
        if (x == 2) return true;

        if (x % 2 == 0) return false;

        for (int i = 2; 2 * i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;

    }
}