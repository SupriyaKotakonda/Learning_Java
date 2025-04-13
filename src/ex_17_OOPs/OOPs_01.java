package ex_17_OOPs;

public class OOPs_01 {
    public static void main(String[] args) {
        Person supriya;
        Person p2 = new Person();
        // Person - Class
        // p2 - Object Ref
        // new Person() -> Object

        p2.name = "susan";
        System.out.println(p2.name);

        Person p3  = new Person();
        p3.name = "sana";
        System.out.println(p3.name);

        Person.talk();


        new Person().name = "Not Ref name";


    }
}
class Person{
    // Attribute | Properties |  Data Members | Instance variables
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    // Behaviour | Function | Method
    void sleep(){
        System.out.println("I am sleeping");
    }

    String greet(String name){
        return "Hello" +name;
    }

    static void talk(){
        System.out.println("Talking");
    }
    int remaining_amount_sal(int salary,int tax){
        return salary-tax;
    }
}