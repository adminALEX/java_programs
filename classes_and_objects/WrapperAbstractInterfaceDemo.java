   package classes_and_objects;


abstract class Animal{
    abstract void show();
} 


class Dog extends Animal{
    public void show(){
    System.out.println(" -- Domestic Animal --");
    }
}

class Lion extends Animal{
    public void show(){
    System.out.println(" -- Wild Animal --");
    }
}

class WrapperDemo{
    int n=5;
        Integer num =n;
        void show(){
            System.out.println(num.intValue());
        }

}
public class WrapperAbstractInterfaceDemo {
    public static void main(String[] args) {
            Animal An = new Lion();
            An.show();
    }
}
