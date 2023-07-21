import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
TreeSet<String> t=new TreeSet<String>();
t.add("blue");
t.add("red");
t.add("green");
t.add("yellow");
TreeSet <String> t2=new TreeSet<String>();
t2.addAll(t);
Iterator <String> it=t2.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
