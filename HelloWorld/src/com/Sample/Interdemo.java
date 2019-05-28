package com.Sample;

interface InterfaceA
{
    public String INFO="Hello World!";
    public void print();
    default public void otherprint()
    {
        System.out.println("这是默认方法！");
    }
}

class SubClass implements InterfaceA
{
    public void print()
    {
        System.out.println(INFO);
    }
}

public class Interdemo
{
    public  static  void main(String[] args)
    {
        SubClass a=new SubClass();
        a.print();
        a.otherprint();
        System.out.println(InterfaceA.INFO);
    }
}
