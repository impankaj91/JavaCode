package com.company;

public abstract class BankFunction {
    String name;
    int amt;
     BankFunction(String name,int amt)
     {
         this.name=name;
         this.amt=amt;
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public String getName() {
        return name;
    }

    public int getAmt() {
        return amt;
    }
}
