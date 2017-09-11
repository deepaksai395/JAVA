package p3;
import p1.*;
import p2.*;
import java.util.*;
class m1
{
	public static void main(String [] args)
	{Scanner scan= new Scanner(System.in);
		int a,b,option;
		System.out.println("enter your option");
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		option= scan.nextInt();
		System.out.println("enter the values of a&b");
		a=scan.nextInt();
		b=scan.nextInt();
		SciCal obj2 =new SciCal(a,b);
		cal obj1 =new cal(a,b);
		switch(option)
		{
		case 1: obj1.add();System.out.println("ans-->"+obj1.add());break;
		case 2: obj1.sub();System.out.println("ans--->"+obj1.sub());break;
		case 3: obj2.mul();System.out.println("ans--->"+obj2.mul());break;
		case 4: obj2.div();System.out.println("ans--->"+obj2.div());break;
 
		}
	}
}