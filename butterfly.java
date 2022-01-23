import java.util.*;
public class butterfly {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("please enter your number :");
        int n=s.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=(n*2)-(i*2);j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=(n-i)*2;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}
