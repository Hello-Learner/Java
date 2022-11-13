/* Meyhod with parametre
class hello{
static void myMethod(){
System.out.println("HEllo");
}
public static void main(String args[])
{
myMethod();
myMethod();
myMethod();
}
}*/
/*method passing the parametre
class hello{
static void myMethod(int a){
System.out.println(a);
}
public static void main(String args[])
{
myMethod(1);
myMethod(2);
myMethod(3);
}
}*/
/*method overloding
import java.util.*;
class hello{
static int myMethod(int a,int b){
return a*b;
}
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int x=input.nextInt();
int y=input.nextInt();

int res=myMethod(x,y);
System.out.println(res);

}
}*/
/*Recurssion 
import java.util.*;
class hello{

public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int x=input.nextInt();
int res=myMethod(x);
System.out.println(res);
}
static int myMethod(int a){
if(a==0){
return 0;
}
if(a==1){
return 1;
}
else
{
return a*myMethod(a-1);
}

}
}*/