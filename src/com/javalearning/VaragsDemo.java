package com.javalearning;

class Calculation {
    public int add(int... n) // Variable length arguments
    {
        int sum = 0;
        for (int i:n)
        {
           sum = sum + i ;

        }
        return sum;
    }
}
public class VaragsDemo
{
    public static void main(String[] args)
    {
       Calculation obj = new Calculation();
        System.out.println(obj.add(5, 8, 9, 4));      //The advantage is that hre we can add as many numbers we want without adding the required varianles

    }
}
