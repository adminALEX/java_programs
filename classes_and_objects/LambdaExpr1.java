package classes_and_objects;

@FunctionalInterface  //notation for denoting this is a functional interface.
interface Lambda{
    void printHello();
}

public class LambdaExpr1 {
    public static void main(String[] args) {
        Lambda lam = () -> System.out.println("Object of interface is initiated");  //Anonymous class with interface using lambda exprssion.
        lam.printHello();
    }
}
