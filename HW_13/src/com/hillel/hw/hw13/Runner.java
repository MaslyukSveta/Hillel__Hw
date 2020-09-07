package com.hillel.hw.hw13;

import com.hillel.hw.hw13.LinkedList;



public class Runner {
    public static void main(String [] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(9);
        list.addFirst(8);
        System.out.println(list);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        System.out.println(list);
        list.add(2, 8);
        System.out.println(list);
        list.deleteFirst();
        System.out.println(list);
        list.add(4 , 4);
        System.out.println(list);
        list.delete(3);
        System.out.println(list);
        list.change(1,2);
        System.out.println(list);
    }
}
