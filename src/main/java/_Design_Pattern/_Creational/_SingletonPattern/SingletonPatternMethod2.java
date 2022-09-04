package _Design_Pattern._Creational._SingletonPattern;

// Thread Synchronized Java implementation of
// singleton design pattern
//Source: https://www.geeksforgeeks.org/singleton-design-pattern/

//Here using synchronized makes sure that only one thread at a time can execute getInstance().
//The main disadvantage of this is method is that using synchronized every time while creating the singleton object is expensive and may decrease
//the performance of your program.
//However if performance of getInstance() is not critical for your application this method provides a clean and simple solution.

class SingletonPatternMethod2
{
    private static SingletonPatternMethod2 obj;

    private SingletonPatternMethod2() {}

    // Only one thread can execute this at a time
    public static synchronized SingletonPatternMethod2 getInstance()
    {
        if (obj==null)
            obj = new SingletonPatternMethod2();
        return obj;
    }
}
