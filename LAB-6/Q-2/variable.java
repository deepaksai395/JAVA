class variable
{  final  int x=100;    //output will be error because "x" is declared as final
        void num()
          {  x=200;
             
              System.out.println(x);
           }   
   
       public static void main(String [] args)
         { 
	variable obj = new variable();
	obj.num();
          }
    
}