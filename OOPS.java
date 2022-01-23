class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("write something");
    }
    public void printcolour(){
        System.out.println(this.colour);
    }
}
class student{
    String name;
    int age;
    public void studentinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // student(){                   //non parameterized
    //     System.out.println("Constructor called");
    // }

    // student(String name,int age){    //parametered constructor
    //     this.name=name;
    //     this.age=age;
    // }
    student(student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    student(){

    }
}

public class OOPS {
    public static void main(String args[]){
        student s1=new student();
        s1.name="aman";
        s1.age=24;
        
        student s2=new student(s1);
        s2.studentinfo();
        // Pen pen1=new Pen();
        // pen1.colour="red";
        // pen1.type="gel";
        // pen1.write();
        // pen1.printcolour();

        // Pen pen2=new Pen();
        // pen2.colour="black";
        // pen2.type="ballpoint";
        // pen2.printcolour();
    } 
}
