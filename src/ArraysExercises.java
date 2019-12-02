import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // using the array initializer syntax

        String[] People = {"John", "Paul", "Ringo"};

        for (String Person : People) {
            System.out.println(Person);
        }

        System.out.println(Arrays.toString(addPerson(People, "George")));
    }
    public static String[] addPerson (String[]People, String Person) {
        String[] People2 = Arrays.copyOf(People, People.length+1);
        People2[People.length-1] = Person;
        return People2;
    }

}
