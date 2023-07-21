import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
char s[]=s1.toCharArray();
String s2=sc.nextLine();
for(int i=s1.length()-1;i>3;i--)
{
	String res="";
	res=Character.toString(s[i]);
	s1=s1.replace(res,"");
	s1=res.concat(s1);
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
