package data_structures.staac;

public class StackDemoMain {
    public static void main(String[] args) {
        StackMethod s = new StackMethod ();
        s.push(10);
        s.push(12);
        s.push(15);
        s.push(3);
        s.push(2);
        s.pop();
        s.pop();
        s.pop();
        s.show();
    }
}
