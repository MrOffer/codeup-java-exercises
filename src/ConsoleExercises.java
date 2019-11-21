import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("\n");

        System.out.println("give me a number");

        int num = scanner.nextInt();

        System.out.print("you entered: " + num );


        System.out.println("give me three words");

        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.print("Please, enter a sentence: ");

        String userInput = scanner.nextLine();

        System.out.println("The sentence you entered is: " + userInput);


        System.out.println("Enter the length of the classroom:");

        double length = scanner.nextDouble();

        System.out.println("Enter the width of the classroom:");

        double width = scanner.nextDouble();

        double area = length * width;

        double perimeter = length * 2 + width * 2;

        System.out.println("Area of the classroom is: " + area);
        System.out.println("Perimeter of the classroom is: " + perimeter);

//        bonus
        System.out.println("Enter the height of the classroom: ");

        double height = scanner.nextDouble();

        double volume = area * height;

        System.out.println("The Volume of the classroom is: " + volume);


    }
}
