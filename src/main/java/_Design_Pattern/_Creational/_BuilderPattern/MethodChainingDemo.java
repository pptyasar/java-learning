package _Design_Pattern._Creational._BuilderPattern;
//Source: https://www.geeksforgeeks.org/builder-pattern-in-java/
// Java code to demonstrate method chaining
final class Student2 {

    // instance fields
    private int id;
    private String name;
    private String address;

    // Setter Methods
    // Note that all setters method
    // return this reference
    public Student2 setId(int id)
    {
        this.id = id;
        return this;
    }

    public Student2 setName(String name)
    {
        this.name = name;
        return this;
    }

    public Student2 setAddress(String address)
    {
        this.address = address;
        return this;
    }

    @Override
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name +
                ", address = " + this.address;
    }
}

// Driver class
public class MethodChainingDemo {
    public static void main(String args[])
    {
        Student2 student1 = new Student2();
        Student2 student2 = new Student2();

        student1.setId(1).setName("Ram").setAddress("Noida");
        student2.setId(2).setName("Shyam").setAddress("Delhi");

        System.out.println(student1);
        System.out.println(student2);
    }
}
