// final keyword with method
class A
{
 final  void print()    //output will be error  because the method "print()" is declared as final in class A 
    {
        System.out.println("hello world");
    }
}

class Test extends A
{ void print()
    {
        System.out.println("hello java ");
    }
   public static void main(String [] args)
     {
         Test obj = new Test();
         obj.print();
     }
} 

//remove the word final in class A, the code will run