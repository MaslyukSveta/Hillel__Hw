package com.hillel.hw.hw13;

import com.hillel.hw.hw13.LinkedList;



public class Runner {
    public static void main(String [] args) {

        Integer[] data = {1, 2, 41, 13, 3, 22, 14};
        LinkedList list = new LinkedList(data);

        list.addFirst(3);
        System.out.println(list);

        list.add(2, 8);
        System.out.println(list);

        list.deleteLast();
        System.out.println(list);

        list.add(4 , 4);
        System.out.println(list);

        list.delete(3);
        System.out.println(list);

        list.change(1,2);
        System.out.println(list);
    }
}
