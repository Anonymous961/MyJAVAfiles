import java.util.*;
public class twodsearch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] numbers=new int[row][col];
        //input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        sc.close();
        int c=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(numbers[i][j]==k){
                    System.out.println(i+"  "+j);
                    c=1;
                    break;
                }
            }
        }
        if(c==0){
            System.out.println("not found");
        }
    }
}