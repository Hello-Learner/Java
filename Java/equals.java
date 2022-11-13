public class equals{
    public static void main(String agrs[])
    {
        String a="AAA";
        String b="AAA";
        String c="aaa";
        String d=new String("AAA");
        String e="bbb";
        //using equals and equalsIgnoreCase
        System.out.println(a.equals(b));// "AAA".equals("AAA");
        System.out.println(a.equals(d));//  new string d
        System.out.println(a.equals(c));// "AAA".equals("aaa")
        System.out.println(a.equalsIgnoreCase(c));//"AAA".equals("aaa")
        //using symbol ==
        System.out.println(a==b);//"AAA"=="AAA"
        System.out.println(a==d);//false(because s3 refers to instance created in nonpool)  
        System.out.println(a==c);//"AAA"=="aaa"
        //Using compareTo
        System.out.println(a.compareTo(b));//a==b returns 0
        System.out.println(c.compareTo(e));//a<b method returns -1
        System.out.println(e.compareTo(c));//a>b method returns 1
    }
}