import java.util.*;
public class oddeven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your no. :");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
