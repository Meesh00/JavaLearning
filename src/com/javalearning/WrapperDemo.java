package com.javalearning;

 abstract class Human
{
     public abstract void eat();
    {

    }

    public void walk()
        {

        }

}
class man extends Human
{
    @Override
    public void eat() {

    }
}

public class WrapperDemo
{
    public static void main(String[] args)
    {
        Human obj = new man();
    }
}

