public class stringbuilder {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));   //index
        sb.setCharAt(2, 'p');               //modify char
        System.out.println(sb);
        sb.insert(0,'S');              //insert
        System.err.println(sb);
        sb.delete(2,3);                 //delete char with starting and ending index
        System.err.println(sb);
        sb.append("check");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
