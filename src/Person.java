public class Person {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String fName){
        this.name = fName;
    }

    public Person(String name){
        this.name = name;
    }

    public String sayHello(){
        return "Hello, my name is "+this.getName();

    }



    public static void main(String[] args) {

        Person user = new Person("Thomas");
        System.out.println(user.getName());
        System.out.println(user.sayHello());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }


}