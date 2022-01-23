import java.util.*;
public class stringQ2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String check=s.next();
        String result="";
        for(int i=0;i<check.length();i++){
            if(check.charAt(i)=='e'){
                result+='i';
            }else{
                result+=check.charAt(i);
            }
        }
        System.out.println(result);
        s.close();
    }
}
