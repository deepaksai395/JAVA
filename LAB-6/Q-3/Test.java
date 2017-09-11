package p2;
import p1.*;
class Test
{
	public static void main(String [] args)
	{
	   M1 m1=new M1();
	
	System.out.println(m1.n);  //output will be error because variable 'n' is not public
	System.out.println(m1.pub);
	System.out.println(m1.pri);// cannot access private variable outside package and class
	System.out.println(m1.pro);// cannot access protected variable outside package
	}
}
