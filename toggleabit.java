import java.util.*;
public class toggleabit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        if ((bitmask & n)==1){
            int notBitmask=~(bitmask);
            System.out.println(notBitmask & n);
        }else{
            System.out.println(bitmask | n);
        }
        sc.close();
    }
}
