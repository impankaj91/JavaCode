package com.company;

public class sbiUser extends BankApp {
    public  sbiUser(String name)
    {
        super(name);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Hello "+ " "+name+ " " +"Welcome In SBI.");
    }
}
class bobUser extends BankApp
        {
            public bobUser(String name)
        {
            super(name);
        }

            @Override
            public void printDetails() {
                super.printDetails();
                System.out.println("Hello "+ " "+name+ " " +"Welcome In BOB.");
            }
        }
