package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType ){
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition, double price){
        this.addition1Name = addition;
        this.addition1Price = price;
        System.out.printf("We have added " + addition + " to your order for the charge of $%.2f %n", price);
    }

    public void addHamburgerAddition2(String addition, double price){
        this.addition2Name = addition;
        this.addition2Price = price;
        System.out.printf("We have added " + addition + " to your order for the charge of $%.2f %n", price);
    }

    public void addHamburgerAddition3(String addition, double price){
        this.addition3Name = addition;
        this.addition3Price = price;
        System.out.printf("We have added " + addition + " to your order for the charge of $%.2f %n", price);
    }

    public void addHamburgerAddition4(String addition, double price){
        this.addition4Name = addition;
        this.addition4Price = price;
        System.out.printf("We have added " + addition + " to your order for the charge of $%.2f %n", price);
    }

    public double itemizeHamburger(){
        price += addition1Price + addition2Price + addition3Price + addition4Price;
        System.out.println("Your total comes out to " + price);
        return price;

    }

    public double getPrice() {
        return price;
    }
}
