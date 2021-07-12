package com.company;
import java.util.*;
public class Cashier {

    double total = 0;
    double price[] = {0, 186, 280, 350, 400, 200, 180, 230, 69, 75, 100, 120, 80, 100, 50, 450, 459, 520, 460, 569, 600,500};
    String list1[]={"","Big Mac                                 ","Quarter Pounder w/Cheese                " ,"Double Quarter Pounder w/Cheese         ","Quarter Pounder w/Cheese Bacon          ","Double Cheeseburgers                    ","Spicy Chicken Sandwich                  " ,
            "Deluxe Crispy Chicken                   " ,"Coca-Cola                               ","Sprite                                  " , "Royal                                   " , "Chocolate Shake                         " , "Sweet Tea                               " ,
            "Strawberry Shake                        " ,"Hot Coffee                              " , "Bic Mac Combo meal                      " , "Cheeseburger Combo Meal                 " ,"Quater Pounder w/Cheese meal            " ,
            "Spicy Chicken Sandwich Combo Meal       " , "Deluxe Crispy Chicken Sandwich Combo Meal " , "10pcs Chicken Mcnuggets Combo Meal        " , "Sausage McMuffin w/Egg Meal             " };int v = 21;
    int pcs[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    double amount,a;
    Scanner order = new Scanner(System.in);
    Date date = new Date();

    void getBorder ()
    {
        System.out.println("=============================================================================================================================================================");
    }

    double getTotal (int  x)
    {
        total += price[x];
        pcs[x] += 1;
        return 0;
    }

    void pay()
    {
        System.out.println("Total                                           " + total);
        System.out.print  ("Amount                                          ");
        amount = order.nextDouble();
        a = amount - total;
        System.out.println("Change                                          "+a);
    }

    void receipt ()
    {
        getBorder();
        System.out.println("McDODO Happy To Serve"+"\n" + "Cashier Name: Xyrell De Hackdogan ");
        System.out.println(date.toString());
        System.out.println("");
        for (int x = 1 ; x < 22 ; x++)
        {
            if (pcs[x] >= 1)
            {
                System.out.println(pcs[x] +"pcs "+ list1[x] + "\t"+ price[x] * pcs[x]);
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        pay();
        getBorder();
    }
}