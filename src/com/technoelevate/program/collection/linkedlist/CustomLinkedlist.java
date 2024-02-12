package com.technoelevate.program.collection.linkedlist;

public class CustomLinkedlist {

    private Node head;
    private Node tail;
    private int count;

    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }


    public void display(){
        Node temp = head;
        System.out.print("start -> ");
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void displayRecursion(Node temp){
        if(temp==null){
            System.out.print("end");
            return;
        }
        System.out.println("start");
        System.out.print(temp.data +" -> ");
        displayRecursion(temp.next);
    }

    public int size(){
        Node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void insertAtEnd(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            count++;
        }else{
            tail.next = node;
            tail = node;
            count++;
        }
    }

    public void insertAtStart(int val){
        Node node = new Node(val);
        Node temp = head.next;
        if(head==null){
            head = node;
            tail = node;
            count++;
        }else{
            head = node;
            head.next= temp;
            count++;
        }
    }

    public void insertAt(int val,int index){
        //for start index
        if(index==0){
            insertAtStart(val);
        }

        //for last index
        if(index==size()){
            insertAtEnd(val);
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node value = temp.next;
        temp.next = node;
        node.next = value;
    }

    public void deleteAt(int index){
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void deleteAtCenter(){
        Node temp1 = head;
        Node temp2 = head;
        int count = 0;
        while(temp1!=null){
            count++;
            temp1 = temp1.next;
        }
        for (int i = 0; i < (count/2)-1; i++) {
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
    }
}
