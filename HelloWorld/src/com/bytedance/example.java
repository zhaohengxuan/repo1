package com.bytedance;

import java.util.*;

public class example
{
    public static String a[];
    public static void main(String[] args)
    {

        Scanner in =new Scanner(System.in);
        int all=in.nextInt();
        for(int i=0;i<all;i++)
        {
            a[i]=in.next();
        }
        System.out.println(a);
    }

}
