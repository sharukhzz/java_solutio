import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int c=0;
String s=sc.nextLine();
char cd[]=s.toCharArray();
String v="aeiou";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a')
{
cd[i]=Character.toUpperCase(cd[i]);
}
}
for(int i=0;i<s.length();i++)
{
System.out.println(cd[i]);
}
}
}