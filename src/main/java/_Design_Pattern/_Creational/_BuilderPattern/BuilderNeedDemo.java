package _Design_Pattern._Creational._BuilderPattern;

// Java code to demonstrate need of Builder Pattern
//Source: https://www.geeksforgeeks.org/builder-pattern-in-java/
// Server Side Code
final class Student3 {

    // instance fields
    private int id;
    private String name;
    private String address;

    // Setter Methods
    // Note that all setters method
    // return this reference
    public Student3 setId(int id)
    {
        this.id = id;
        return this;
    }

    public Student3 setName(String name)
    {
        this.name = name;
        return this;
    }

    public Student3 setAddress(String address)
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

// Client Side Code
class StudentReceiver2 {

    private final Student3 student = new Student3();

    public StudentReceiver2()
    {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                student.setId(1).setName("Ram").setAddress("Noida");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                student.setId(2).setName("Shyam").setAddress("Delhi");
            }
        });

        t1.start();
        t2.start();
    }

    public Student3 getStudent()
    {
        return student;
    }
}

// Driver class
public class BuilderNeedDemo {
    public static void main(String args[])
    {
        StudentReceiver2 sr = new StudentReceiver2();
        System.out.println(sr.getStudent());
    }
}
