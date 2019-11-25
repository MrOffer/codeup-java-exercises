import java.util.Random;
import java.util.Scanner;
public class ConsoleAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, you what's your name?");
        String userName = scanner.next();
        System.out.println("Hey " + userName + "." + " Do you want to play a game?");
        String startAnswer = scanner.next();
        if (startAnswer.equals("yes")){
            System.out.println("Cool, lets get started!\n");
        } else if (startAnswer.equals("no")){
            System.out.println("Just pick yes.. smh...\n");
        }
        Random rando = new Random();
        int userAttack = rando.nextInt(300);
        int badguyHealth = rando.nextInt(4000);
        int heroHealth = rando.nextInt(3000);
        int dragonAttack = rando.nextInt(400);
        int heroShield = rando.nextInt(10);
        int newHeroHealth = heroHealth += heroShield;
        int newDragonHealth = badguyHealth -= userAttack;

        System.out.println("Once upon a time there was a lovely \n" +"princess. But she had an enchantment \n" + "upon her of a fearful sort which could \n" + "only be broken by love's first kiss. \n" + "She was locked away in a castle guarded \n" + "by a terrible fire-breathing dragon. \n" + "Many brave knights had attempted to \n" + "free her from this dreadful prison, \n" + "but non prevailed. She waited in the \n" + "dragon's keep in the highest room of \n" + "the tallest tower for her true love \n" + "and true love's first kiss.\n" + "Like that's ever gonna happen.\n");
        System.out.println("Your quest, brave " + userName + ", is to slay the mighty dragon and save the princess!\n");
        System.out.println(userName +  " enters the castle and awakens the Dragon. The Dragon roars with the passion of a fierce kitten and attacks!! OH NO!!\n" + userName + " Looks around quickly and finds a jagged stick laying on the ground. " + "This will do, " + userName + " whispers under their breath..\n");
        System.out.println("\n The Dragon's health is: " + badguyHealth);
        System.out.println("\n Your health is: " + heroHealth);
        System.out.println("\nWhat will you do? \n" + "1. Attack\n" + "2. Add Shield\n");
        String heroAnswer = scanner.next();
        if (heroAnswer.equals("1")){
            System.out.println("\n WOW!! " + userName + " attacked the dragon for " + userAttack + " !!");
            System.out.println("\nThe Dragon now has " + (badguyHealth -= userAttack) + " health.");
        }else if (heroAnswer.equals("2")){
            System.out.println("\nYou have gained " + heroShield + " shield!");
            System.out.println("\nYour health is now: " + newHeroHealth + "!");
        }else if (newHeroHealth <= 0){
            System.out.println("\nGAME OVER! YOU LOSE!");
        }else if (newDragonHealth <= 0){
            System.out.println("\nCONGRATS!!! THE PRINCESS IS SAVED!!!!");
        }
        System.out.println("\nWatch out!!" + "\n The Dragon has attacked you and inflicted " + dragonAttack + " damage!");
        System.out.println("\nYour health is now at " + (newHeroHealth -= dragonAttack));
        System.out.println("\nWhat will you do? \n" + "1. Attack\n" + "2. Add Shield\n");
        String heroAnswerTwo = scanner.next();
        if (heroAnswerTwo.equals("1")){
            System.out.println("\n WOW!! " + userName + " attacked the dragon for " +userAttack + " !!");
            System.out.println("\nThe Dragon now has " + (badguyHealth -= userAttack) + " health.");
        }else if (heroAnswerTwo.equals("2")){
            System.out.println("\nYou have gained " + heroShield + " shield!");
            System.out.println("\nYour health is now: " + newHeroHealth + "!");
        }else if (newHeroHealth <= 0){
            System.out.println("\nGAME OVER! YOU LOSE!");
        }else if (newDragonHealth <= 0){
            System.out.println("\nCONGRATS!!! THE PRINCESS IS SAVED!!!!");
        }
        System.out.println("\nWatch out!!" + "\n The Dragon has attacked you and inflicted " + dragonAttack + " damage!");
        System.out.println("\nYour health is now at " + (newHeroHealth -= dragonAttack));
        System.out.println("\nWhat will you do? \n" + "1. Attack\n" + "2. Add Shield\n");
        String heroAnswerThree = scanner.next();
        if (heroAnswerThree.equals("1")){
            System.out.println("\n WOW!! " + userName + " attacked the dragon for " + userAttack + " !!");
            System.out.println("\nThe Dragon now has " + (badguyHealth -= userAttack) + " health.");
        }else if (heroAnswerThree.equals("2")){
            System.out.println("\nYou have gained " + heroShield + " shield!");
            System.out.println("\nYour health is now: " + newHeroHealth + "!");
        }else if (newHeroHealth <= 0){
            System.out.println("\nGAME OVER! YOU LOSE!");
        }else if (newDragonHealth <= 0){
            System.out.println("\nCONGRATS!!! THE PRINCESS IS SAVED!!!!");
        }
        System.out.println("\nWatch out!!" + "\n The Dragon has attacked you and inflicted " + dragonAttack + " damage!");
        System.out.println("\nYour health is now at " + (newHeroHealth -= dragonAttack));
        System.out.println("\nWhat will you do? \n" + "1. Attack\n" + "2. Add Shield\n");
        String heroAnswerFour = scanner.next();
        if (heroAnswerFour.equals("1")){
            System.out.println("\n WOW!! " + userName + " attacked the dragon for " + userAttack + " !!");
            System.out.println("\nThe Dragon now has " + (badguyHealth -= userAttack) + " health.");
        }else if (heroAnswerFour.equals("2")){
            System.out.println("\nYou have gained " + heroShield + " shield!");
            System.out.println("\nYour health is now: " + newHeroHealth + "!");
        }else if (newHeroHealth <= 0){
            System.out.println("\nGAME OVER! YOU LOSE!");
        }else if (newDragonHealth <= 0){
            System.out.println("\nCONGRATS!!! THE PRINCESS IS SAVED!!!!");
        }
        System.out.println("\nWatch out!!" + "\n The Dragon has attacked you and inflicted " + dragonAttack + " damage!");
        System.out.println("\nYour health is now at " + (newHeroHealth -= dragonAttack));
        System.out.println("\nWhat will you do? \n" + "1. Attack\n" + "2. Add Shield\n");
        String heroAnswerFive = scanner.next();
        if (heroAnswerFive.equals("1")){
            System.out.println("\n WOW!! " + userName + " attacked the dragon for " + userAttack + " !!");
            System.out.println("\nThe Dragon now has " + (badguyHealth -= userAttack) + " health.");
        }else if (heroAnswerFive.equals("2")){
            System.out.println("\nYou have gained " + heroShield + " shield!");
            System.out.println("\nYour health is now: " + newHeroHealth + "!");
        }else if (newHeroHealth <= 0){
            System.out.println("\nGAME OVER! YOU LOSE!");
        }else if (newDragonHealth <= 0){
            System.out.println("\nCONGRATS!!! THE PRINCESS IS SAVED!!!!");
        }
        System.out.println("\nWatch out!!" + "\n The Dragon has attacked you and inflicted " + dragonAttack + " damage!");
        System.out.println("\nYour health is now at " + (newHeroHealth -= dragonAttack));
        System.out.println("\nWhat will you do? \n" + "1. Attack\n" + "2. Add Shield\n");
        String heroAnswerSix = scanner.next();
        if (heroAnswerSix.equals("1")){
            System.out.println("\n WOW!! " + userName + " attacked the dragon for " + userAttack + " !!");
            System.out.println("\nThe Dragon now has " + (badguyHealth -= userAttack) + " health.");
        }else if (heroAnswerSix.equals("2")){
            System.out.println("\nYou have gained " + heroShield + " shield!");
            System.out.println("\nYour health is now: " + newHeroHealth + "!");
        }else if (newHeroHealth <= 0){
            System.out.println("\nGAME OVER! YOU LOSE!");
        }else if (newDragonHealth <= 0){
            System.out.println("\nCONGRATS!!! THE PRINCESS IS SAVED!!!!");
        }
        System.out.println("\nWatch out!!" + "\n The Dragon has attacked you and inflicted " + dragonAttack + " damage!");
        System.out.println("\nYour health is now at " + (newHeroHealth -= dragonAttack));
        System.out.println("\nWhat will you do? \n" + "1. Attack\n" + "2. Add Shield\n");
        String heroAnswerSeven = scanner.next();
        if (heroAnswerSeven.equals("1")){
            System.out.println("\n WOW!! " + userName + " attacked the dragon for " + userAttack + " !!");
            System.out.println("\nThe Dragon now has " + (badguyHealth -= userAttack) + " health.");
        }else if (heroAnswerSeven.equals("2")){
            System.out.println("\nYou have gained " + heroShield + " shield!");
            System.out.println("\nYour health is now: " + newHeroHealth + "!");
        }else if (newHeroHealth <= 0){
            System.out.println("\nGAME OVER! YOU LOSE!");
        }else if (newDragonHealth <= 0){
            System.out.println("\nCONGRATS!!! THE PRINCESS IS SAVED!!!!");
        }
        System.out.println("\nWatch out!!" + "\n The Dragon has attacked you and inflicted " + dragonAttack + " damage!");
        System.out.println("\nYour health is now at " + (newHeroHealth -= dragonAttack));
    }
}