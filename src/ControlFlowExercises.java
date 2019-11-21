import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");
        int num = scanner.nextInt();

        System.out.print("Here is your table!\n\nnumber | squared | cubed\n------ | ------- | -----\n1      | 1       | 1\n");
        for (int b = 2; b <= num; b++ ) {
            System.out.print(b+"      | "+b*b+"       | "+b*b*b+"\n");
        }
    }
}
