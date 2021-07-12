package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num;

        System.out.print("Enter an Integer: ");
        num = input.nextLine();

        NewClass object = new NewClass();
        object.addNum(num);
    }
}
