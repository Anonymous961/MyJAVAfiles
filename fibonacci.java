import java.util.*;
public class fibonacci {
    public static void fibo(int n){
        int i=0;
        int j=1;
        int t=0;
        while(n>0){
            System.out.println(i);
            t=i+j;
            i=j;
            j=t;
            n--;
        }
        return;
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter required number of fibo :");
        int n=s.nextInt();
        fibo(n);
        s.close();
    }
}
