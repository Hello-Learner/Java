class constructer1{
    int age;
    String name;
    public constructer1(){
        this(5 ,"Hello");
        System.out.println("1st constructer");

    }
    public constructer1(int age){
        this();
        this.age=age;
        System.out.println("2nd constructer is "+age);
        
    }
 public constructer1(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("3rd constructer is "+age+" "+name);
        
    }

}
public class constructer{
    public static void main(String agrs[])
    {
        constructer1 cons=new constructer1();
        constructer1 cons1= new constructer1(9);
        constructer1 cons2=new constructer1(9,"Hi");
    }
}