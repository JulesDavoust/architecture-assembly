package com.company;

public class register {
    String t0;
    String t1;
    String t2;
    String t3;
    int PC;
    //constructor
    register(){
        t0 = "0";
        t1 = "0";
        t2 = "0";
        t3 = "0";
        //Tells which line we are at
        PC = 0;
    }
    //update t0
    public void updatet0(String update){
        this.t0 = update;
    }
    //update t1
    public void updatet1(String update){
        this.t1 = update;
    }
    //update t2
    public void updatet2(String update){
        this.t2 = update;
    }
    //uptdate t3
    public void updatet3(String update){
        this.t3 = update;
    }
    //update PC
    public void updatePC(int update){
        this.PC = update;
    }
    //Display registers in the interface
    public void DisplayRegister(){
        System.out.println("t0      "+t0);
        System.out.println("t1      "+t1);
        System.out.println("t2      "+t2);
        System.out.println("t3      "+t3);
        System.out.println("PC      "+PC);
    }

}
