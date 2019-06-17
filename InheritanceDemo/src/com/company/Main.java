package com.company;

public class Main {

    public static void main(String[] args) {
    	//Create An Object 1 of A Constructor
	BankApp ram=new BankApp("Ram Srivastava");
	// Use An Declared Method in BankApp class
	ram.accAge(18);
	ram.accTax(20000);
	ram.printDetails();
	// Create An Object 2
	BankApp pankaj=new BankApp("Pankaj Shah");
	pankaj.accAge(20);
	pankaj.accTax(2000000);
	pankaj.printDetails();
	//inherit class sbi
	sbiUser rahul=new sbiUser("Rahul Verma");
	rahul.accAge(21);
	rahul.accTax(2000);
	rahul.printDetails();
	bobUser bob=new bobUser("Sanju");
	bob.accAge(18);
	bob.printDetails();
    }
}
