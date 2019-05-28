package com.Sample;

interface CircleShape
{
    public static final double PI=3.1415926;
    default public double area(double r)
    {
        return PI*r*r;
    }
    public abstract double girth(double r);
}

class comarea implements CircleShape
{
    public double girth(double r)
    {
        return 2*PI*r;
    }
}

class Circle implements CircleShape
{
    double radius;
    public Circle(float r)
    {
        radius=r;
    }
    public double girth(double radius)
    {
      return  2*PI*radius;
    }
}

public class Area
{
    public static void main(String[] args)
    {
        comarea a =new comarea();
        System.out.println("圆的周长是"+a.girth(2));

    }
}
