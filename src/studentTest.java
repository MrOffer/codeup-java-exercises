public class studentTest {
    public static void main(String[] args) {
        String[] student1 = {"Thomas", "Offer", "Deimos", "Macbook Pro"};

        codeupStudent thomas = new codeupStudent(student1, false);

        thomas.greeting();
        thomas.study();
        System.out.println(thomas.giveBusinessCards());
    }
}
