package com.javalearning;

class Emp
{
    int Eid;
    int salary;
    String ceo;

    public void show()
    {
        System.out.println(Eid + " : " + salary + ":" + ceo);

    }
}

public class StaticDemo
{
    public static void main(String [] args)
    {
        Emp navin = new Emp ();
        navin.Eid = 8;
        navin.salary = 4000;
        navin.ceo = "Manish";

        Emp rahul = new Emp ();
        rahul.Eid = 8;
        rahul.salary = 4000;
       rahul.ceo = "Manish";

       navin.show();
       rahul.show();


    }
}
