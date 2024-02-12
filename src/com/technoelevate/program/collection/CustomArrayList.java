package com.technoelevate.program.collection;

public class CustomArrayList {

    int size;
    String [] arr;
    int count;

    CustomArrayList(){
        size = 10;
        count = 0;
        arr = new String[size];
    }

    public void add(String s){
        if(count <= size){
            arr[count] =  s;
            count++;
        }else{
            size = (size * 3 / 2 ) + 1;
            arr[count] =  s;
            count++;
        }
    }

    public String get(int index){
        return arr[index];
    }

    public String toString(){
        for (int i = 0; i < count; i++) {
            System.out.println("["+arr[i]+"]");
        }
        return null;
    }
}
