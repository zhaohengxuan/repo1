package com.Sample;


class Person
{
    protected String name;
    protected int  age;
    Person(String Name,int Age)
    {
        name=Name;
        age=Age;
    }
    public final void speak()
    {
        System.out.println("我的名字叫"+name+", 今年"+age+"岁了!");
    }
}
//class Student
//{
//    String name;
//    int age;
//    String school;
//    Student(String Name,int Age,String School)
//    {
//        name=Name;
//        age=Age;
//        school=School;
//    }
//    void speak()
//    {
//        System.out.println("我的名字叫"+name+", 今年"+age+"岁了!");
//    }
//    void study()
//    {
//        System.out.println("我在"+school+"学习！");
//    }
//
//}

class Student extends Person
{
    String school;
    Student(String name,int age,String school)
    {
       super(name,age);
        this.school=school;
    }

    void study()
    {
        System.out.println("我在"+school+"学习！");
    }
}

public class LeadInherit
{
    public static void main(String[] args)
    {
        Person aperson = new Person("zhangsan", 2);
        aperson.speak();
        Student astudent=new Student("LiHua",24,"西安理工大学");
        astudent.speak();
        astudent.study();
    }

}
