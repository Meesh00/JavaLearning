package com.javalearning;
 class A
 {
     public void show()
     {
         System.out.println("Class A");
     }
 }

 //class B extends A
 //{
 //    public void show()
   //  {
  //       System.out.println("I'm the best");
  //   }
 //}
public class AnonymousClass
{
    public static void main(String[] args)
    {
        A obj = new A()
        {public void show()
              {//Instead od making a B class we can write it here also
                   System.out.println("I'm the best");
               }

        };
        obj.show();
       
    }

}
