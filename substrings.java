public class substrings {
    public static void main(String[] args){
        String sentence="My name is tony";
        String name=sentence.substring(11,sentence.length());
        String name1=sentence.substring(0,4);
        String name2=sentence.substring(5);
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
}
