package com.jy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter a SKU: ");
        b.setSku(in.nextLine());
        System.out.println(b.toString());


    }
}
