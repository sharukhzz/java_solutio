import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String v="";
s.split(" ");
for(int i=s.length()-1;i>=0;i--)
{
v+=s.charAt(i);
}
System.out.println(v);
}
}