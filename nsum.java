import java.util.*;
public class nsum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=0;
        for (int i=0;i<=a;i++){
            b+=i;
        }
        System.out.println(b);
        s.close();
    }
}
