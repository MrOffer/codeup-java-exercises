import java.util.Random;
import java.util.Scanner;

public class consolegame {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = scanner.next();
        System.out.print("    >>>>>\\|/<<<<<\n  >>>\\\\\\\\\\v/////<<<\n >>>\\\\\\\\\\vvv/////<<<\n  >>>(vvvvvvvvv)<<<\n  >>>(vvvvvvvvv)<<<\n >>>>) (.)_(.) (<<<<\n >>>/    (_)    \\<<<\n   ( ()_     _() )\n    \\   `---'   /\n    \"'--._.--'\" \"\n");

        System.out.println(userName + "," + " Do you want to play a game?\n");
        String startAnswer = scanner.next();
        String playAgain = "no";


        do {
            int badGuyHealth = 1000;
            int userHealth = 1000;
            Random rando = new Random();
            int attack = rando.nextInt(500);
            if (startAnswer.equals("yes")) {
                System.out.println("Like you had a choice!\n");
            } else if (startAnswer.equals("no")) {
                System.out.println("Too bad, we are playing anyways...\n");
            }


            System.out.print(userName+", you have " + userHealth + " points of health\n");
            System.out.println("You wake up on the floor in an unfamiliar room that is very dingy and dirty. You look around and see a door on one wall and a mirror on the wall across form it.\n");
            System.out.println(
                    "0================================================0\n"+
                    "|'.                                            .'|\n"+
                    "|  '.                                        .'  |\n"+
                    "|    '.                                    .'    |\n"+
                    "|     '. ______________________________ .'       |\n"+
                    "|  _    :                               :        |\n"+
                    "| |  `~_ :                              :   .'|| |\n"+
                    "| |    | :                              :  |  || |\n"+
                    "| |    | :                              :  I  || |\n"+
                    "| |   _| :                              :  |  || |\n"+
                    "| |_ -   :                              :  |  || |\n"+
                    "|        :                              :  |  || |\n"+
                    "|        :                              :  | 0+| |\n"+
                    "|        :                              :  |  || |\n"+
                    "|        :______________________________:  I  || |\n"+
                    "|      .'                                '.|  || |\n"+
                    "|    .'                                    '. || |\n"+
                    "|  .'                                        '|| |\n"+
                    "|.'                                            '.|\n"+
                    "0================================================0\n");
            System.out.print("Do you want to go to the door or go up to the mirror?\nType in door for door or mirror for mirror?\n");
            Scanner sc = new Scanner(System.in);
            String doorOrMirror = sc.next();
            if (doorOrMirror.equalsIgnoreCase("door")) {
                userHealth -= attack;
                System.out.println("You chose the door!\nThe door is locked and the handle is burning hot and you burn your hand you have been dealt " + attack + " worth of damage.\nYour Health is now at " + userHealth);
                System.out.print("You go to the mirror!\nYou look in the mirror and you see your reflection, the reflection fades away into just glass and you see a clown on ther other side\n ");
                System.out.print("    >>>>>\\|/<<<<<\n  >>>\\\\\\\\\\v/////<<<\n >>>\\\\\\\\\\vvv/////<<<\n  >>>(vvvvvvvvv)<<<\n  >>>(vvvvvvvvv)<<<\n >>>>) (.)_(.) (<<<<\n >>>/    (_)    \\<<<\n   ( ()_     _() )\n    \\   `---'   /\n    \"'--._.--'\" \"\n");
                System.out.print("The clown laughs and says \"I'm Jigsaw, and I am glad you decided to play!\"\nA yellow mist starts coming form a vent in the ceiling and you pass out!\n");
                userHealth -= attack;
                System.out.print("You were dealt " + attack + " damage by the mist, you now have " + userHealth + " pts worth of health!\n");
            } else if (doorOrMirror.equalsIgnoreCase("mirror")) {
                System.out.print("You chose to go to th mirror!\nYou look in the mirror and you see your reflection, the reflection fades away into just glass and you see a clown on ther other side\n ");
                System.out.print("    >>>>>\\|/<<<<<\n  >>>\\\\\\\\\\v/////<<<\n >>>\\\\\\\\\\vvv/////<<<\n  >>>(vvvvvvvvv)<<<\n  >>>(vvvvvvvvv)<<<\n >>>>) (.)_(.) (<<<<\n >>>/    (_)    \\<<<\n   ( ()_     _() )\n    \\   `---'   /\n    \"'--._.--'\" \"\n");
                System.out.print("The clown laughs and says \"I'm Jigsaw, and I am glad you decided to play!\"\nA yellow mist starts coming form a vent in the ceiling and you pass out!\n");
                userHealth -= attack;
                System.out.print("You were dealt " + attack + " damage by the mist, you now have " + userHealth + " pts worth of health!\n");
            }

            System.out.println("Jigsaw's Health = "+ badGuyHealth);
            System.out.println(userName + "’s health = "+ userHealth);



                System.out.println("What would you like to do now? press 1 to punch the glass or 2 to kick the glass");
                int userinput = sc.nextInt();
                if (userinput == 1) {
                    System.out.println("You should never punch glass and you hurt your hand by " + attack+"\n");
                    System.out.println("The glass shatters and you are now face to face with Jigsaw!");
                    userHealth-=attack;
                    System.out.println(userName + "’s health = " + userHealth+"\n");
                    System.out.println("Jigsaw has " + badGuyHealth + " health\n");
                } else if (userinput == 2){
                    System.out.println("You kick the glass and it shatters, you are now face to face with Jigsaw!\n");
                    System.out.println(userName + "’s health = " + userHealth+"\n");
                    System.out.println("Jigsaw has " + badGuyHealth + " health\n");
                } else {
                    System.out.println("You pressed the wrong key and lost "+attack+" health\n");
                    System.out.println("The glass shatters and you are now face to face with Jigsaw!");
                    System.out.println(userName + "’s health = " + userHealth+"\n");
                    System.out.println("Jigsaw has " + badGuyHealth + " health\n");
                }

                while (userHealth > 0 && badGuyHealth > 0) {
                    Random rand = new Random();
                    int numberRandom = rand.nextInt(2);
                    System.out.println("Press 1 to punch Jigsaw press 0 to kick him!\n");
                    int coinFlip1 = scanner.nextInt();
                    if (coinFlip1 == numberRandom & userHealth > 0 & badGuyHealth > 0) {
                        System.out.println("Great shot! Your attack does " + attack + " damage\n");
                        if (coinFlip1 == 1){
                            System.out.println("       __    )\n" +
                                    "    @____\\@ /\n" +
                                    "   /\\     |\n" +
                                    "  / \\    / \\\n" +
                                    "_/__|___/___ \\__");
                        } else if (coinFlip1 == 0){
                            System.out.println("                  ,  @\n" +
                                    "                @__\\  /\\\n" +
                                    "              /\\_, \\/ /\n" +
                                    "              / \\   (\n" +
                                    "_____________/__|____\\____");
                        }
                        badGuyHealth -= attack;
                        System.out.println("Jigsaw has " + badGuyHealth + " health");
                        System.out.println(userName + "’s health= " + userHealth+"\n");
                    } else {
                        System.out.println("you missed!\n");
                        System.out.println("Jigsaw attacks and does " + attack + " damage");
                        userHealth -= attack;
                        System.out.println(userName + "’s health= " + userHealth);
                        System.out.println("Jigsaw has " + badGuyHealth + " health\n");
                    }
                }
                if (userHealth <= 0) {
                    System.out.println("SORRY, "+userName+" YOU LOST!!!\nGAME OVER!!!\n");
                    System.out.println("Would you like to play again?\n");
                    playAgain = scanner.next();
                }

                if (badGuyHealth <= 0) {
                    System.out.print("CONGRATS, "+userName+" YOU WON!\n");
                    System.out.println("Would you like to play again?\n");
                    playAgain = scanner.next();
                }

            } while (playAgain.equalsIgnoreCase("yes"));
        }
    }

