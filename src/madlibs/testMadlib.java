package madlibs;

public class testMadlib {
    public static void main(String[] args){
        String[] words = {"MP", "blue", "hammer", "Gotham City"};

        version1 version1 = new version1(words);

        System.out.println("Once upon a time...");
        System.out.println("There was a person named " + version1.name);
        System.out.println(version1.goToLocation());
        System.out.println("and");
        System.out.println(version1.pickUpObject() + " from the store,");
        System.out.println("and helped Batman clean up the city and greeted each criminal by saying " + version1.greeting() + " before he clobbered them with the " + version1.randomObject+ "!");
    }
}
