package _Generics;

public class _GenericClassBounded <T extends Number>{

    public void display() {
        //In general, the type parameter can accept any data types (except primitive types).
        //However, if we want to use generics for some specific types (such as accept data of number types) only, then we can use bounded types.
        //In the case of bound types, we use the extends keyword

        System.out.println("This is a bounded type generics class.");
    }

    class Main {
        public static void main(String[] args) {

            // create an object of GenericsClass
            //Here, GenericsClass is created with bounded type. This means GenericsClass can only work with data types that are children of Number (Integer, Double, and so on).
            _GenericClassBounded<Number> obj = new _GenericClassBounded<>();

            //If we create like below will get error
            //_GenericClassBounded<String> obj = new _GenericClassBounded<>();
        }
    }
}
