import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.print(addition(5,5));
//        System.out.print(subtraction(15,5));
//        System.out.print(multiplication(5,5) == 25);
//        division(10,5);
//        modulus(50,2);

        System.out.print("Enter a number between 1 and 10: \n");
//        System.out.println(getInteger(1, 10));

        factorial();
//        diceRoll();
    }

    //    1

    public static double addition(double num, double num2) {
        return num + num2;
    }

    public static double subtraction(double num, double num2) {
        return num - num2;
    }

    public static double multiplication(double num , double num2) {
        return num * num2;
    }

    public static void division(int a, int b) {
        System.out.println(a / b);
    }

    public static void modulus(int a, int b) {
        System.out.println(a % b);
    }

    //    2

    public static int getInteger(int min, int max) {

        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput >= min && userInput <= max) {
            System.out.println("Valid\n");
        } else {
            System.out.println("Invalid\n");
            return getInteger(min, max);
        }
        return userInput;
    }

    //    3

    public static void factorial() {
        int number = getInteger(1, 10);
        String output = "";
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total *= i;
            output += i + "! = " + (total) + "\n";
        }
        System.out.println(output);
    }

    //    4

//    public static String diceRoll() {
//        char diceRoll;
//        System.out.print("Welcome to the dice game!\n");
//        System.out.println("How many sides are on the pair of dice?\n");
//        int sidesNumber = scanner.nextInt();
//        System.out.println("Great, there are " + sidesNumber + " sides to your dice!\n");
//        System.out.println();
//        System.out.println("press any letter and the return key to roll the dice\n");
//        diceRoll = scanner.next().charAt(0);
//        String diceRollAgain = "Yes";
//        do {
//            System.out.println("Rolling the dice...\n");
//            double randNumber1 = Math.random() * sidesNumber + 1;
//            double randNumber2 = Math.random() * sidesNumber + 1;
//            long randNumRounded1 = Math.round(Math.floor(randNumber1));
//            long randNumRounded2 = Math.round(Math.floor(randNumber2));
//            System.out.printf("You rolled a " + randNumRounded1 + " and a " + randNumRounded2 + "!\n");
//            System.out.print("Would you lIke to roll the dice again? yes or no?\n");
//            diceRollAgain = scanner.next();
//        } while (diceRollAgain.equalsIgnoreCase("yes"));
//        System.out.println("Thanks for playing!");
//        return "Nope";
//    }
}
