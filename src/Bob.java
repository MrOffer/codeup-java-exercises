import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        System.out.print("What would you like to say to or ask Bob?\n");
        Scanner sc = new Scanner(System.in);

        String userResponse = sc.nextLine();

        String bobResponse;

        if (userResponse.endsWith("?")) {
            bobResponse = "Sure";
        } else if (userResponse.endsWith("!")) {
            bobResponse = "Whoa, chill out!";
        } else if (userResponse.isEmpty()) {
            bobResponse = "Fine. Be that way!";
        } else {
            bobResponse = "Whatever";
        }

        System.out.println(bobResponse);
    }
}

