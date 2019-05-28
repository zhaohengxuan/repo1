package com.Test;
public class bookclass
{
    String book;
    float money;
    void printinfo()
    {
        System.out.println(book);
        System.out .println(money);
    }
    void setinfo(String Book,float Money)
    {
        book=Book;
        money=Money;
    }
    public static void main(String[] args)
    {
        bookclass book1=new bookclass();
        bookclass book2=new bookclass();
        book1.setinfo("Java",23);
        book2=book1;
        book1.printinfo();
        book2.printinfo();

    }
}
