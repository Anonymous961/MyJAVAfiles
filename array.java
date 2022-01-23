import java.util.*;
public class array {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] marks=new int[size];
        for(int i=0;i<size;i++){
            //input
            marks[i]=sc.nextInt();
        }
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=99;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for(int i=0;i<3;i++){
            //output
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
