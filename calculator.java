import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter first no. :");
        int a=x.nextInt();
        System.out.println("enter second no. :");
        int b=x.nextInt();
        System.out.println("enter operator :");
        char d=x.next().charAt(0);
        if(d=='+'){
            System.out.println("answer is :"+(a+b));
        }else if(d=='-'){
            System.out.println("answer is :"+(a-b));
        }else if(d=='/'){
            System.out.println("answer is :"+(a/b));
        }else if(d=='*'){
            System.out.println("answer is :"+(a*b));
        }
        x.close();
    }
}
