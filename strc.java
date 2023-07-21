import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
char s[]=s1.toCharArray();
String s2=sc.nextLine();
for(int i=0;i<2;i++)
{
	String res="";
	res=Character.toString(s[i]);
	s1=s1.replaceFirst(res,"");
	s1=s1.concat(res);
}
System.out.println(s1);
if(s1.equals(s2))
{
System.out.println("true");
}
else
System.out.println("false");
}
}
