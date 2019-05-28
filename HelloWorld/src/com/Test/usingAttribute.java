package com.Test;

public class usingAttribute
{
   static String str1="string1";
   static String str2;
   String str3="string3";
   String str4;
   static   //静态代码块，用来初始化静态成员变量
   {
      printStatic("before static");
      str2="string2";
      printStatic("after static");
   }
   public static void printStatic(String title)
   {
       System.out.println("----"+title+"-----");
       System.out.println("str1=\""+str1+"\"");
       System.out.println("str2=\""+str2+"\"");
   }
   public usingAttribute()  //定义了一个人构造方法，无返回值
   {
       print("before constructor");
       str4="string4";
       print("after constructor");
   }
   public void print(String title)
   {
       System.out.println("------"+title+"-------");
       System.out.println("str1=\""+str1+"\"");
       System.out.println("str2=\""+str2+"\"");
       System.out.println("str3=\""+str3+"\"");
       System.out.println("str4=\""+str4+"\"");
   }
   public static void main(String[] args)
   {
       System.out.println();
       System.out.println("------创建using Attribute对象--------");
       System.out.println();
       new usingAttribute();
   }
}
