import java.util.*;
public class poweroftwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=2;
        boolean flag=false;
        while(x<n){
            x*=2;
            if (x==n){
                flag=true;
                break;
            }
        }
        if (flag ==true){
            System.out.println("power of 2");
        }else{
            System.err.println("not a power of 2");
        }
        sc.close();
    }
}
