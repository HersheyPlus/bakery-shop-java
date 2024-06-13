package ui;
import entities.*;
import helper.enums.OrderStatus;
import helper.enums.PaymentMethod;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Admin a = new Admin("adminName", "adminEmail", "adminPhone", "adminPassword");
        Bakery b = new Bakery("bakeryName", "bakeryDesc", 100, 500);
        Customer c =
                new Customer("customerName", "customerEmail", "customerPhone", "customerAddress","customerPassword");

        Order o = new Order(
                LocalDateTime.now(),
                "Bakery A",
                10,
                99.99,
                OrderStatus.SUCCESS.toString(),
                PaymentMethod.CASH.toString(),
                "Shop A",
                c
        );

        Shop s = new Shop("shopName", "shopAddress", "shopPhone", "shopEmail");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(o);
        System.out.println(s);
    }
}
