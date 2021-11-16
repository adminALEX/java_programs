package pattern_programs;

public class ABC {
    public static void main(String[] args)
    {
    int i,j;
    char a;
        for(i=1;i<=6;i++){
            a='A';
            for(j=1;j<=i;j++){
                System.out.print(a+" ");
                a=(char)(a+1);
            }
            System.out.println();
        }
    }
}
