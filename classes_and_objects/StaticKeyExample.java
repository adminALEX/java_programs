package classes_and_objects;
class SKey{
    int id;
    int sno;
    static int commid;
    static{
        commid=8028;
        System.out.println(commid);
    }
    public SKey(){
        id=1;
        sno=10;
    }
}
public class StaticKeyExample {
    public static void main(String[] args) {
        SKey sk1 = new SKey();
        sk1.id=10;
        sk1.sno=1;
        SKey.commid=100;
        SKey sk2 = new SKey();
        sk2.id=20;
        sk2.sno=2;
        System.out.println(sk1.id);
        System.out.println(sk1.sno);
        System.out.println(sk2.id);
        System.out.println(sk2.sno);
        System.out.println(SKey.commid);
    }
}
