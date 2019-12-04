package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    private static Input input = new Input();
    private static Movie[] movies = MoviesArray.findAll();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean again;

        System.out.println("Welcome to the Movie App!");
        do {
            System.out.println("What would you like to do?\n" +
                            "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n" +
                    "6 - Add a movie to the list\n" +
                    "\n"+ "Please enter your choice: ");

            int userInput = input.getInt(0, 6);

            switch (userInput) {
                case 0:
                    System.out.println("Thank you for using the Movie App!");
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("sci-fi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 6:
                    System.out.println("What is the title of the movie?\n");
                    String name = scan.nextLine();
                    System.out.println("What is the category?\n");
                    String category = scan.nextLine();
//                    String Movie = new String Movie (name, category);
                default:
                    System.err.println("That's not an option...");
            }
            System.out.println("Would you like to continue using the Movie App?");
            again = input.yesNo();
        } while (again);
    }
}
