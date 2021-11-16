package classes_and_objects;

class New{
    public int args(int ... a){
        int sum=0;
        for (int i : a){
           sum =sum+ (i-10);
        }
        return sum;
    }
}

public class Varargs {
    public static void main(String[] args) {
        New n = new New();
        int a=10;
        int b=20,c=30,d=40;
        int res = n.args(a,b,c,d);
        System.out.println(res);

    }
}
