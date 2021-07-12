package com.company;
import java.util.Scanner;
public class MainMenu extends Cashier  {
    int num;
    Scanner order = new Scanner(System.in);
    void menu ()
    {
        System.out.println("Main Menu");
        getBorder();
        System.out.println("Breakfast                                          Beverages                      Combo Meal     ");
        System.out.println("[1]Big Mac                                           [8]Coca-Cola                     [15]Bic Mac Combo meal \n" +
                "[2]Quarter Pounder w/Cheese                          [9]Sprite                        [16]Cheeseburger Combo Meal \n" +
                "[3]Double Quarter Pounder w/Cheese                  [10]Royal                        [17]Quater Pounder w/Cheese meal \n" +
                "[4]Quarter Pounder w/Cheese Bacon                   [11]Chocolate Shake              [18]Spicy Chicken Sandwich Combo Meal \n" +
                "[5]Double Cheeseburgers                             [12]Sweet Tea                    [19]Deluxe Crispy Chicken Sandwich Combo Meal \n" +
                "[6]Spicy Chicken Sandwich                           [13]Strawberry Shake             [20]10pcs Chicken Mcnuggets Combo Meal \n" +
                "[7]Deluxe Crispy Chicken                            [14]Hot Coffee                   [21]Sausage McMuffin with Egg Meal");
        getBorder();
    }

    void saved ()
    {
        System.out.println("Order save!!!!");
    }

    void order ()
    {
        System.out.print("Enter order number: ");
        num = order.nextInt();
        saved();

    }

    void order (int x)                     // panes method overloading wahahahah
    {
        num = x;
        while (num != 0 && num < 22)
        {
            order();
            super.getTotal(num);
        }
    }
}