final class A   //output will be error because final class cannot be inherited
{
 void print()
   {
      System.out.println("hello");
    }
}

class Class extends A
{ public static void main(String [] args){
  A obj = new A();
 obj.print();
}
}