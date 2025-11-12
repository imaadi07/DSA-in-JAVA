public class Oops2 {
    public static class Person {
        int age;
        String name;

        void saysHii() {
            System.out.println(name + " ["+age+"] says hii");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "A";
        p1.age = 10;
        

        Person p2 = new Person();
        p2.name = "B";
        p2.age = 20;

        p1.saysHii();
        p2.saysHii();
        swap(p1, p2);
        p1.saysHii();
        p2.saysHii();
    }
    

    public static void swap(Person p1, Person p2) {
        p1 = new Person();

        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        p2 = new Person(); 

        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }
}
