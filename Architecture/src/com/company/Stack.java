package com.company;

public class Stack {
    //Initialize the stack
    String[] arrayStack = new String[4096];
    //Size of stack
    private int sizeStack=0;
    //Get size of stack
    public int getSizeStack() {
        return sizeStack;
    }
    //Set size of stack
    public void setSizeStack(int sizeStack) {
        this.sizeStack = sizeStack;
    }
    //add a value to the stack
    public void arrayStackAdd(String stackValue){
        arrayStack[getSizeStack()]=stackValue;
        sizeStack++;
    }
    //decrease the value of the stack
    public void arrayStackReduce(){
        this.sizeStack--;
    }

}
