package _Design_Pattern._Creational._SingletonPattern;

// Double Checked Locking based Java implementation of
// singleton design pattern
//Source: https://www.geeksforgeeks.org/singleton-design-pattern/

//We have declared the obj volatile which ensures that multiple threads offer the obj variable correctly when it is being initialized to Singleton instance.
//This method drastically reduces the overhead of calling the synchronized method every time.
class SingletonPatternBest
{
    private static volatile SingletonPatternBest obj = null;

    private SingletonPatternBest() {}

    public static SingletonPatternBest getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (SingletonPatternBest.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new SingletonPatternBest();
            }
        }
        return obj;
    }
}
