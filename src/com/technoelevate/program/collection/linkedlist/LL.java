package com.technoelevate.program.collection.linkedlist;

public class LL {

    private Node head;

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //add -> first element
    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            node.next  = head;
            head = node;
        }
    }

    //add -> last element
    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = node;
    }

    //add -> at index
    public void add(int data,int index){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }
        int count  = 0;
        //get size
        Node currentNode  = head;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }

        if(index > count){
            System.out.println("index not found");
            return;
        }

        int i = 0;
        currentNode = head;
        while(i < index-1){
            currentNode = currentNode.next;
            i++;
        }

        node.next = currentNode.next;
        currentNode.next = node;
    }

    //delete -> first
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }

        head = head.next;
    }

    //delete -> last
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
        }

        // If there's only one node in the list
        if(head.next == null){
            head = null;
            return;
        }

        Node currentNode = head;

        while(currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    //display
    public void display(){
        Node currentNode = head;
        System.out.print("start -> ");
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.add(12,2);
        list.display();
    }
}
