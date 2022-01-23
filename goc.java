import java.util.*;
public class goc {
    public static void GOC(int a,int b){
        int s=0;
        for (int i=1;i<=a;i++){
            if (a%i==0 && b%i==0){
                s=i;
            }
        }
        System.out.println("Greatest common divisor is : "+s);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.printf("enter both numbers : ");
        int a=s.nextInt();
        int b=s.nextInt();
        GOC(a,b);
        s.close();
    }
    
}
