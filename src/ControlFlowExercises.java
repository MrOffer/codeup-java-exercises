import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz \n");
            } else if (i % 5 == 0) {
                System.out.print("Buzz \n");
            } else {
                System.out.print(i + "\n");
            }

        }
    }
}

