package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Item e1 = new Item(42,null,null);
        Item e2 = new Item(44,e1,null);
        Item e3 = new Item(43,e1,e2);
        Item e4 = new Item(41,null,e1);

        e1.printValues();

    }
}
