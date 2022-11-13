import java.util.*;
public class substring{
    public static void main(String agrs[])
    {//Using Substring
        String s="Kariyappa";
        System.out.println("Original String "+s);
        System.out.println("String contining 4 word "+s.substring(5));
        System.out.println("String Containing between "+s.substring(5,9));
        //Using Spilt
        String s1=new String("Hello, My Dad's name is Kariyappa J H");
        String[] sentences = s1.split("\\.");  
        System.out.println(Arrays.toString(sentences));  
        System.out.println(s.toUpperCase());//Using toUpperCase
        System.out.println(s.toLowerCase());//using toLowerCase
        //using trim means its remove the whitespace
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s.startsWith("Ka"));//using startsWith
        System.out.println(s.endsWith("appa"));//using endsWith
        System.out.println(s.length());//length of the String
        System.out.println(s.charAt(0));//indivisual character
        int a=10;
        String s2=String.valueOf(a);//Using String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.
        System.out.println(s2+a);
        System.out.println(s.replace(s,"Appa")); //using replace mathod
         //StringBuffer The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
         //Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.
         StringBuffer s3=new StringBuffer("Hello ");
         System.out.println(s3.capacity());//The capacity() method of the StringBuffer class returns the current capacity of the buffer.
         System.out.println(s3.append(s));//Concatenation using stringbuffer
         System.out.println(s3.insert(1,s));//The insert() method inserts the given String with this string at the given position.
         System.out.println(s3.replace(0,1,s));//The replace() method replaces the given String from the specified beginindex and endindex.
         System.out.println(s3.delete(1,3));//The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.
         System.out.println(s3.reverse());//The reverse() method of the StringBuilder class reverses the current String.
         System.out.println(s3.capacity());

    }
}