import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String v="";
//char c[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
if(((s.charAt(i)).matches("[a-z]")))
{
	v+=s.charAt(i);
}
}
System.out.println(v);
}
}
