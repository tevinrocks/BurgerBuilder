package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Yum Yum Burger", meat, price, "Sourdough");
    }

    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
        System.out.printf("We have added " + name + " to your order for the charge of $%.2f %n", price);
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        System.out.printf("We have added " + name + " to your order for the charge of $%.2f %n", price);
    }

    @Override
    public double itemizeHamburger(){
        double healthyBurgerPrice = super.getPrice();
        healthyBurgerPrice += healthyExtra1Price + healthyExtra2Price;
        System.out.printf("Your total comes out to $%.2f %n", healthyBurgerPrice);
        return healthyBurgerPrice;
    }
}
