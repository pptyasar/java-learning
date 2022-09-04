package _Design_Pattern._Creational._SingletonPattern;

//Source: https://www.geeksforgeeks.org/singleton-design-pattern/

public class SingletonPatternMethod1 {
    private static SingletonPatternMethod1 obj;

    // private constructor to force use of
    // getInstance() to create Singleton1 object
    private SingletonPatternMethod1() {}

    public static SingletonPatternMethod1 getInstance()
    {
        if (obj==null)
            obj = new SingletonPatternMethod1();
        return obj;
    }
}