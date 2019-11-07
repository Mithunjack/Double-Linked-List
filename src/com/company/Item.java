package com.company;

import java.util.Arrays;

public class Item {
    public static Item head;
    int value;
    Item next;
    Item previous;

    Item(){
        head = null;
        next = null;
    }

    Item(int givenValue, Item previousItem,Item nextItem){
        if (head==null){
            this.value = givenValue;
            this.previous = null;
            this.next = nextItem;
            Item.head = this;
        }
        else {
            this.value = givenValue;
            this.previous = previousItem;
            this.next = nextItem;
            if (previousItem!=null){
                previousItem.next = this;
            }
            if (nextItem!=null){
                nextItem.previous = this;
            }

        }
        if (previousItem==null){
            Item.head = this;
        }
    }

    public void printValues(){
        Item print;
        print = head;

        while (print!=null){
            System.out.println("Linked List Value: "+print.value);
            print=print.next;
        }
    }
}
