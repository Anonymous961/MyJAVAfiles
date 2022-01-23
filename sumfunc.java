import java.util.*;
public class sumfunc {
    public static int sum(int a,int b){
        int s=a + b;
        return s;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your both numbers : ");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(sum(a,b));
    }
    
}