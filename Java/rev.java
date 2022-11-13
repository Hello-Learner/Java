import java.util.Scanner;
class rev{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter the string");
String S=input.nextLine();
String rev="";
for(int i=0; i<S.length();i++)
{
rev=S.charAt(i)+rev;
}
System.out.println(rev);
}
}