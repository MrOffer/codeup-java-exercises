import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What grade would you like to input?");
        int num = scanner.nextInt();
        char letterGrade = 'X';

        if (num > 100) {}
        else if (num >= 90)
            letterGrade = 'A';
        else if (num >= 80)
            letterGrade = 'B';
        else if (num >= 70)
            letterGrade = 'C';
        else if (num >= 60)
            letterGrade = 'D';
        else if (num >= 0)
            letterGrade = 'F';



        switch (letterGrade) {
            case 'A' :
                System.out.println("You got an A!");
                break;
            case 'B' :
                System.out.println("You got a B");
                break;
            case 'C' :
                System.out.println("You got a C");
                break;
            case 'D' :
                System.out.println("You got a D");
                break;
            case 'F' :
                System.out.println("You got a F");
                break;
            default:
                System.out.println("You cheated.");
        }

    }

}
