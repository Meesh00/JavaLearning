package com.javalearning;

class Calc
{
    int num1;
    int num2;
    int result;

    public void perform()
    {
        result = num1 + num2;
    }


}
public class ObjectDemo
{
    public static void main(String[] args)
    {
       Calc obj;  //reference
        obj = new Calc();
        // can also write it as  Calc obj = new Calc();
        obj.num1 = 3;
        obj.num2 = 5;
        obj.perform();

        System.out.println(obj.result);
    }
}
