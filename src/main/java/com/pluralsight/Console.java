package com.pluralsight;
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    public static String promptForString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

    public static String promptForString(){
        return scanner.nextLine().trim();
    }
}
