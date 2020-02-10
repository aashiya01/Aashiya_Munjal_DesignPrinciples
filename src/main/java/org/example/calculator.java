package org.example;

import java.util.Scanner;
class Calci
{
    int a;
    int b;
    Calci(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int add()
    {
        return a+b;
    }
    int subract()
    {
        return a-b;
    }
    int multiply()
    {
        return a*b;
    }
    int divide()
    {
        return a/b;
    }
}
public class calculator
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=s.nextInt();
        System.out.println("Enter 2nd number");
        int b=s.nextInt();
        System.out.println("For Addition press 1");
        System.out.println("For Subraction press 2");
        System.out.println("For Multiplication press 3");
        System.out.println("For Division press 4");
        System.out.println("Enter your choice");
        int c=s.nextInt();
        Calci calculator=new Calci(a,b);
        int ans=0;
        if(c==1)
            ans=calculator.add();
        else if (c==2)
            ans=calculator.subract();
        else if (c==3)
            ans=calculator.multiply();
        else if (c==4)
            ans=calculator.divide();
        else
            System.out.println("Invalid choice");
        System.out.println("OUTPUT="+ans);
    }
}
