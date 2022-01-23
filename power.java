import java.util.*;
public class power {
    public static void powe(int a,int b){
        int s=1;
        for(int i=b;i>0;i--){
            s*=a;
        }
        System.out.println(s);
        return;
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter both numbers :");
        int a=s.nextInt();
        int b=s.nextInt();
        powe(a,b);
        s.close();
    }
}
