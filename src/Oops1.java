public class Oops1 {
    public static class Person {
        int age;
        String name;

        void sayHi() {
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

        p1.sayHi();
        p2.sayHi();
        swap(p1, p2);
        p1.sayHi();
        p2.sayHi();
    }
    

    public static void swap(Person p1, Person p2) {
        // This will not work as it is pass by reference
        Person temp = p1;
        p1 = p2;
        p2 = temp;

        // This will work as it is pass by value
        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;

        // This will also work as it is pass by value
        int temp1 = p1.age;
        p1.age = p2.age;
        p2.age = temp1;
    }
}
