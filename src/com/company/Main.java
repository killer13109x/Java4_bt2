package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String ten = input.nextLine();
        System.out.println("Hello: " + ten);
    }
}
