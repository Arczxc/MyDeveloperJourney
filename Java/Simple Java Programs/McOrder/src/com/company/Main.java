package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MainMenu menu = new MainMenu();


        menu.menu();
        menu.order(1);
        menu.receipt();

    }
}