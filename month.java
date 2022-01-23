import java.util.*;
public class month {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter no. of month :");
        int a=x.nextInt();
        if (a==1){
            System.out.println("january");
        }else if (a==2){
            System.out.println("february");
        }else if (a==3){
            System.out.println("march");
        }else if (a==4){
            System.out.println("april");
        }else if (a==5){
            System.out.println("may");
        }else if (a==6){
            System.out.println("june");
        }else if (a==7){
            System.out.println("july");
        }else if (a==8){
            System.out.println("august");
        }else if (a==9){
            System.out.println("september");
        }else if (a==10){
            System.out.println("october");
        }else if (a==11){
            System.out.println("november");
        }else if (a==12){
            System.out.println("december");
        }else{
            System.out.println("invalid input");
        }
        x.close();
    }
}
