package classes_and_objects;

class And{
    int a;
    public And(int a){
        this.a=a;
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        And num = new And(10);
        System.out.println(num.a);
    }
}
