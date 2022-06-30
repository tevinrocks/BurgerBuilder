package com.company;

public class Main {
//Simple code to make a restaurant menu
    public static void main(String[] args) {
    Hamburger burger = new Hamburger("Turbo burger", "beef", 5.00, "White bread");
    burger.addHamburgerAddition1("wings", 3.00);
    burger.addHamburgerAddition2("chips", 1.00);
    burger.addHamburgerAddition3("pickles", .50);
    burger.addHamburgerAddition4("carrots", .75);
    burger.itemizeHamburger();

    System.out.println();

    HealthyBurger vegan = new HealthyBurger("Tofu", 5);
    vegan.addHealthyAddition1("Lettuce", .60);
    vegan.addHealthyAddition2("Tomatoes", .30);
    vegan.itemizeHamburger();

        System.out.println();

    DeluxeBurger superBurger = new DeluxeBurger();
    superBurger.addHamburgerAddition1("Dorritos", 5);

    }

}
