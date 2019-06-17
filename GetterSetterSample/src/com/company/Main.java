package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);

        getSetSample pankaj=new getSetSample();

        System.out.println("Enter The Name:");
        String name=obj.next();
        pankaj.setName(name);
        System.out.println("name:"+pankaj.getName());
            System.out.println("Enter The Age:");
        int age=obj.nextInt();
              pankaj.setAge(age);
                 System.out.println("Age:"+pankaj.getAge());
        System.out.println("Enter The Pincode:");
         int pincode=obj.nextInt();
         pankaj.setPincode(pincode);
        System.out.println(pankaj.getPincode());
        System.out.println(pankaj.getFees(40000));
    }

}
class getSetSample
{
    // Declare a Variable
    String name;
    int age;
    int pincode;
    String branch;
    int fees=35000;
    // Set And Get A Name Method..

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getFees(int fees)
    {
        return fees;
    }
}
