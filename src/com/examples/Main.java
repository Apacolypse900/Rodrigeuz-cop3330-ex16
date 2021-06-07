package com.examples;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        int age;
        System.out.print("What is your age? ");
            age = myObj.nextInt();

        if (age < 16)
            System.out.print("You are not old enough to legally drive");
        else
            System.out.print("You are old enough to legally drive ");

    }
}
