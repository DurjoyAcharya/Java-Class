package com;
public class Static {
    public static void main(String args[]){
        System.out.println("Main");
    }
    static int a=m1();
    static{
    System.out.println("Static");
    }
    static int m1(){
    System.out.println("m1 Mathord");
    System.out.println("a:"+a);
    return 111;
    }
}
