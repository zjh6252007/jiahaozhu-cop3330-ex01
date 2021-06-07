/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */

package ex01.base;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scan = new Scanner(System.in);
        String user_name = scan.nextLine();
        System.out.println("Hello,"+user_name+",nice to meet you!");
    }
}
