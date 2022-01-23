import java.util.*;
public class functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        printMyName(name);//function call
        s.close();
    }
    
}
