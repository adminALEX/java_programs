package leet_programs;
import java.util.*;


public class StringManipulation {

    public static void main(String[] args) {
        long line_count = 0;
        String next="";
        String main_storage="";
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            line_count=line_count+1;
            main_storage = sc.nextLine();
            next = String.format(line_count+" "+main_storage);
            System.out.println(next);
            if(main_storage.contains("end-of-file"))
            break;
        }
        sc.close();
}
}