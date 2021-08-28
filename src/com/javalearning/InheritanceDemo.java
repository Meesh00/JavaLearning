package com.javalearning;

class Calculator
{
    public int add( int i, int j)
    {
        return i+ j;
    }
}

class CalcAdv extends Calculator
{
    public int sub( int i, int j)
    {
        return  i - j;
    }
}

class CalcVeryAdv extends  CalcAdv
{
    public int multiply( int i, int j)
    {
        return i * j;
    }
}
public class InheritanceDemo
{
    public static void main(String[] args)
    {
        CalcVeryAdv obj = new CalcVeryAdv();
        int result1 = obj.add(4, 5);
        int result2 = obj.sub(4, 5);
        int result3 = obj.multiply(4, 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
