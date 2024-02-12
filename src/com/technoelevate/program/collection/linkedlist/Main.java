package com.technoelevate.program.collection.linkedlist;

public class Main {
    public static void main(String[] args) {
        CustomLinkedlist list = new CustomLinkedlist();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
       // list.deleteAtCenter();
        list.display();
    }

}
