package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	    System.out.println("Enter The Day:");
        int dd=input.nextInt();
        System.out.println("Enter The Month:");
        int mm=input.nextInt()-1;
        System.out.println("Enter The Year:");
        int yy=input.nextInt();

        Date date=new GregorianCalendar(yy,mm,dd).getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        String day=sdf.format(date);
        System.out.println(day);
    }
}
