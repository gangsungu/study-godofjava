public class Person {
    String name;
    int age;

    public Person() {
        this.name = "Anonymous";
        this.age = 20;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.age);

        Person person2 = new Person("Jone Doe", 30);
        System.out.println(person2.name);
        System.out.println(person2.age);
    }
}