package com.company;

public class NewClass {
    int sum = 0;
    void addNum (String s)
    {
        for (int i = 0 ; i < s.length();i++)
        {
            sum += s.charAt(i) - 48;
        }
        System.out.println("The Sum is : " + sum);
    }

}
