class student{
    public static final int  const1=0;
 public int a;
 public static String name;
 public static int b=0;
 public student(){
    b++;
 }
 public void stuinfo(){
      System.out.println(a+ " " +name);
 }
 public static void stusimple(){
     System.out.println(name);
 }
}
public class Application{
    public static void main(String agrs[]){
        student.name="Java";
        student.stusimple();
        System.out.println("Before object count"+student.b);
        student student1=new student();
        student student2=new student();
        System.out.println("After object count"+student.b);
        student1.a=9;
        student2.a=0;
        student1.stuinfo();
        student2.stuinfo();
        System.out.println(Math.E);
		System.out.println(student.const1);
        

    }
}

