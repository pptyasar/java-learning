package _Design_Pattern._Creational._SingletonPattern;

// Static initializer based Java implementation of
// singleton design pattern
//Source: https://www.geeksforgeeks.org/singleton-design-pattern/

//Here we have created instance of singleton in static initializer.
//JVM executes static initializer when the class is loaded and hence this is guaranteed to be thread safe.
//Use this method only when your singleton class is light and is used throughout the execution of your program.

class SingletonPatternMethod3
{
    private static SingletonPatternMethod3 obj = new SingletonPatternMethod3();

    private SingletonPatternMethod3() {}

    public static SingletonPatternMethod3 getInstance()
    {
        return obj;
    }
}