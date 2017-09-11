// final keyword with variable
class Test
{static final int x=10;
	public static void main(String [] args)
	{          x=20;// output will be error because value of variable cannot be changed once declared final
		System.out.println(x);
	}
}