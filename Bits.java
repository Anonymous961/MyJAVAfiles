import java.util.*;
public class Bits {
    public static void main(String args[]){
        // int n=5;                                   //get bit
        // int pos=2;
        // int bitMask=1<<pos;

        // if((bitMask & n)==0){
        //     System.out.println("bit was zero");
        // }else{
        //     System.out.println("bit was one");
        // }

        // int n=5;                                   //set bit
        // int pos=1;
        // int bitMask=1<<pos;

        // int newNumber=bitMask | n;
        // System.out.println(newNumber);

        // int n=5;                                   //clear bit
        // int pos=2;
        // int bitMask=1<<pos;
        // int notBitMask=~(bitMask);

        // int newnumber=notBitMask & n;
        // System.out.println(newnumber);
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        //oper=1 : set   oper=0: clear
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            //set
            int newnumber=bitMask | n;
            System.out.println(newnumber);
        }else{
            //clear
            int notBitmask=~(bitMask);
            int newnumber=notBitmask & n;
            System.out.println(newnumber);
        }
        sc.close();
    }
}
