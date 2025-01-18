package com.company;

public class Node {
    private String data;
    private Node next;
    //creates a node
    public Node(String data){
        this.data = data;
        this.next = null;
    }
    //Assign next to "next"
    public void assignedNext(Node next){
        this.next = next;
    }
    //Get the value of the node
    public String getData(){
        return data;
    }
    //get the next value
    public Node getNext(){
        return next;
    }
    //Sets the data
    public void changeData(String data){
        this.data = data;
    }
}
