package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        List<String> business = new ArrayList<>();
        business.add( "Jet Loop Methods");
        business.add("Blue Box Printer");
        business.add("Code Coder Inc.");
        business.add("Express Array");
        business.add("Java Worlds");

        System.out.println("  Hello, we are glad you are here.");
        System.out.println(" How can I help you?");

        System.out.println("Here is the list of all the Businesses: " + business);

        System.out.println(" Do you want work with Business or tag");

        Scanner sc = new Scanner(System.in);
        String choose = sc.nextLine();
        System.out.println("Good Choice");
    }
}
