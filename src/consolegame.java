import java.util.Random;
import java.util.Scanner;

public class consolegame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, you what's your name?");
        String userName = scanner.next();
        System.out.println("Hey " + userName + "." + " Do you want to play a game?");
        String startAnswer = scanner.next();
        if (startAnswer.equals("yes")) {
            System.out.println("Cool, lets get started!\n");
        } else if (startAnswer.equals("no")) {
            System.out.println("Just pick yes.. smh...\n");
        }
        Random rando = new Random();
        int userAttack = rando.nextInt(300);
        int badguyHealth = rando.nextInt(4000);
    }
}