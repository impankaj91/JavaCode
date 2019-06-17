package com.company;

public class BankApp {
    String name;
    int age;
    int tax;
    public BankApp(String name){
        this.name=name;
    }
    public void accAge(int age)
    {
        this.age=age;
    }
    public void accTax(int tax)
    {
        this.tax=tax;
    }
    public void printDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Tax:"+tax);
    }
}
