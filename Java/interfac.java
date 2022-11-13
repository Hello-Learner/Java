interface animal{
    void sound();
}
interface bird{
    void sound1();
}
interface owl extends bird{
    void sound2();
}
//The relationship between classes and interfaces
class dog implements animal,bird,owl{
   public void sound()
    {
        System.out.println("Boow!!");


    }
    public void  sound1()
    {
        System.out.println("Say Hello to Bird");
    }
    public void  sound2()
    {
        System.out.println("Say Hello to Bird");
    }
}
class interfac{
    public static void main(String agrs[])
    {
        animal a=new dog();
        a.sound();
        bird b=new dog();
        owl o=new dog();
        a.sound();
        b.sound1();
        o.sound2();
    }
}