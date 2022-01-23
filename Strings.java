import java.util.*;
public class Strings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Your name is :"+name);
        sc.close();
        String first="tony";
        String last="stark";
        String fullname=first+"@"+last;
        System.out.println(fullname.length());
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }

}
