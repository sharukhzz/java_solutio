class square
{
void disp()
{
System.out.println("square");
}
}
class area extends square
{
void disp1()
{
System.out.println("area");
}
}
class perimeter extends area
{
void disp2()
{
System.out.println("perimeter");
}
}
class length extends perimeter
{
void disp3()
{
System.out.println("length");
}
}
class main
{
public static void main(String args[])
{
	length myobj=new length();
	myobj.disp3();
	myobj.disp2();
	myobj.disp1();
	myobj.disp();
}
} 	
