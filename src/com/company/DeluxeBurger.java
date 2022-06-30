package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(){
        super("Colossal Burger", "Beef", 15.10, "SourDough");
        super.addHamburgerAddition1("Fritos", 0);
        super.addHamburgerAddition2("Dorritos", 0);

        System.out.printf("The price for the Deluxe burger is $%.2f %n", getPrice());
    }
    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Sorry no further additions can be added");
    }
    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Sorry no further additions can be added");
    }
    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Sorry no further additions can be added");
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Sorry no further additions can be added");
    }
}
