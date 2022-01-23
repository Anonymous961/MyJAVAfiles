import java.util.*;
public class factorial {
    public static void fact(int n){
        if (n<0){
            System.out.println("Invalid Number");
            return;
        }
        int s=1;
        for(int i=1;i<=n;i++){
            s*=i;
        }
        System.out.println(s);
        return;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        fact(n);
        s.close();
    }  
}
