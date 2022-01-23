import java.util.*;
public class switches {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // if (a==1){
        //     System.out.println("namaste");
        // }else if (a==2){
        //     System.out.println("hello");
        // }else if(a==3){
        //     System.out.println("bonjour");
        // }else{
        //     System.out.println("Invalid button");
        // }
        switch(a){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("bonjour");
            break;
            default : System.out.println("invalid button");
        }
        sc.close();
    }
}
