package com.Sample;

class Animal
{
    public void move()
    {
        System.out.println("动物移动！");
    }
}

class Fish extends Animal
{
    @Override
    public void move()
    {
        System.out.println("鱼儿游！");
    }
}

class Horse extends Animal
{
    @Override
    public void move()
    {
        System.out.println("马在跑！");
    }
    public void fly()
    {
        System.out.println("这是飞马");
    }
}

class Bird extends Animal
{
    @Override
    public void move()
    {
        System.out.println("鸟在飞！");
    }
}
public class ObjectPoly
{
    public static void main(String[] args)
    {
        Animal a;
        Fish f=new Fish();
        Bird b=new Bird();
        Horse h=new Horse();
        a=f;
        // a.move();
        a=b;
        //b.move();
        a=h;
        h.move();
        ((Horse) a).fly();
    }
}
