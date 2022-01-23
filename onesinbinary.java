import java.util.*;
public class onesinbinary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            if(n==1){
                count++;
                break;
            }
            int x=1;
            while(x<=n){
                x*=2;
            }
            x=x/2;
            n-=x;
            count++;
            // System.out.println(n);
        }
        System.out.println(count);
        sc.close();
    }
}
