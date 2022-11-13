
//Java Concatenation using bulid funcation like "concat"
public class concat{
    public static void main(String[] agrs)
    {
        String s="Nandini";
        s=s.concat(" J K");
        String s1="Hi\n"+s+"\n"+5+"-"+9+"-"+2000;
        System.out.println(s);//using concat
        System.out.println(s1);//using symbol "+"
        StringBuilder s2=new StringBuilder("Banglore\n");
        System.out.println(s2.append(s1));//Using StringBuilder and append
        //Using join and toString
        String s4 = String.join(",",s1,s2);   //String 3 to store the result  
            System.out.println(s4.toString());  //Displays result  
    }
}