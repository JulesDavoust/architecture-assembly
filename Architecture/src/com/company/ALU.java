package com.company;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class ALU {

    Assembly assembly;
    register r;

    ALU(Assembly a, register r){this.assembly = a; this.r = r;}

    //LDA changes the value of a register by a register, a variable or a constant
    public void LDA(String[] line){
        if(line.length == 5) {
            if (line[3] != null) {
                if (line[3].equals("+")) {
                    switch (line[1]) {
                        case "T0":
                            this.r.updatet0(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) + Integer.parseInt(line[4]))));
                            break;
                        case "T1":
                            this.r.updatet1(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) + Integer.parseInt(line[4]))));
                            break;
                        case "T2":
                            this.r.updatet2(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) + Integer.parseInt(line[4]))));
                            break;
                        case "T3":
                            this.r.updatet3(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) + Integer.parseInt(line[4]))));
                            break;
                        default:
                            System.out.println("Error");
                    }
                } else if (line[3].equals("-")) {
                    switch (line[1]) {
                        case "T0":
                            this.r.updatet0(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) - Integer.parseInt(line[4]))));
                            break;
                        case "T1":
                            this.r.updatet1(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) - Integer.parseInt(line[4]))));
                            break;
                        case "T2":
                            this.r.updatet2(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) - Integer.parseInt(line[4]))));
                            break;
                        case "T3":
                            this.r.updatet3(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) - Integer.parseInt(line[4]))));
                            break;
                        default:
                            System.out.println("Error");
                    }
                } else if (line[3].equals("*")) {
                    switch (line[1]) {
                        case "T0":
                            this.r.updatet0(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) * Integer.parseInt(line[4]))));
                            break;
                        case "T1":
                            this.r.updatet1(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) * Integer.parseInt(line[4]))));
                            break;
                        case "T2":
                            this.r.updatet2(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) * Integer.parseInt(line[4]))));
                            break;
                        case "T3":
                            this.r.updatet3(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) * Integer.parseInt(line[4]))));
                            break;
                        default:
                            System.out.println("Error");
                    }
                } else if (line[3].equals("/")) {
                    switch (line[1]) {
                        case "T0":
                            this.r.updatet0(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) / Integer.parseInt(line[4]))));
                            break;
                        case "T1":
                            this.r.updatet1(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) / Integer.parseInt(line[4]))));
                            break;
                        case "T2":
                            this.r.updatet2(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) / Integer.parseInt(line[4]))));
                            break;
                        case "T3":
                            this.r.updatet3(assembly.storeCodeData.findData((assembly.storeCodeData.findPositionData(assembly.DataList.getDataInLinkedList(line[2])) / Integer.parseInt(line[4]))));
                            break;
                        default:
                            System.out.println("Error");
                    }
                }
            }
        }
        else{if(assembly.DataList.getDataInLinkedList(line[2]) == null) {
                    if (line[2].equals("T0")) {
                        switch (line[1]) {
                            case "T1":
                                this.r.updatet1(this.r.t0);
                                break;
                            case "T2":
                                this.r.updatet2(this.r.t0);
                                break;
                            case "T3":
                                this.r.updatet3(this.r.t0);
                                break;
                            default:
                                System.out.println("Error");
                        }
                    } else if (line[2].equals("T1")) {
                        switch (line[1]) {
                            case "T0":
                                this.r.updatet0(this.r.t1);
                                break;
                            case "T2":
                                this.r.updatet2(this.r.t1);
                                break;
                            case "T3":
                                this.r.updatet3(this.r.t1);
                                break;
                            default:
                                System.out.println("Error");
                        }
                    } else if (line[2].equals("T2")) {
                        switch (line[1]) {
                            case "T0":
                                this.r.updatet0(this.r.t2);
                                break;
                            case "T1":
                                this.r.updatet1(this.r.t2);
                                break;
                            case "T3":
                                this.r.updatet3(this.r.t2);
                                break;
                            default:
                                System.out.println("Error");
                        }
                    } else if (line[2].equals("T3")) {
                        switch (line[1]) {
                            case "T0":
                                this.r.updatet0(this.r.t3);
                                break;
                            case "T1":
                                this.r.updatet1(this.r.t3);
                                break;
                            case "T2":
                                this.r.updatet2(this.r.t3);
                                break;
                            default:
                                System.out.println("Error");
                        }
                    } else {
                        switch (line[1]) {
                            case "T0":
                                this.r.updatet0(line[2]);
                                break;
                            case "T1":
                                this.r.updatet1(line[2]);
                                break;
                            case "T2":
                                this.r.updatet2(line[2]);
                                break;
                            case "T3":
                                this.r.updatet3(line[2]);
                                break;
                            default:
                                System.out.println("Error");
                        }
                    }
                }else {
                    switch (line[1]) {
                        case "T0":
                            this.r.updatet0(assembly.DataList.getDataInLinkedList(line[2]));
                            break;
                        case "T1":
                            this.r.updatet1(assembly.DataList.getDataInLinkedList(line[2]));
                            break;
                        case "T2":
                            this.r.updatet2(assembly.DataList.getDataInLinkedList(line[2]));
                            break;
                        case "T3":
                            this.r.updatet3(assembly.DataList.getDataInLinkedList(line[2]));
                            break;
                        default:
                            System.out.println("Error");
                    }
                }}
    }
    //STR Changes a variable into a constant or a register
    public void STR(String[] line){
        if(line[2].equals("+")){
            if (this.assembly.DataList.getVariableInLinkedList(line[1]) != null) {
                if (line[4].equals("T0")) {
                    System.out.println("T0");
                    this.assembly.DataList.changeData(this.r.t0, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData((this.assembly.DataList.getDataInLinkedList(line[1])), this.r.t0, Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T1")) {
                    this.assembly.DataList.changeData(this.r.t1, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData((this.assembly.DataList.getDataInLinkedList(line[1])), this.r.t1,Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T2")) {
                    this.assembly.DataList.changeData(this.r.t2, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t2,Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T3")) {
                    this.assembly.DataList.changeData(this.r.t3, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t3,Integer.parseInt(line[3]), line[2]);
                } else {
                    this.assembly.DataList.changeData(line[2], (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), line[2],Integer.parseInt(line[3]), line[2]);
                }
            } else {
                System.out.println("Error");
            }
        }else if(line[2].equals("-")){
            if (this.assembly.DataList.getDataInLinkedList(line[1]) != null) {
                if (line[4].equals("T0")) {
                    this.assembly.DataList.changeData(this.r.t0, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData((this.assembly.DataList.getDataInLinkedList(line[1])), this.r.t0, Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T1")) {
                    this.assembly.DataList.changeData(this.r.t1, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData((this.assembly.DataList.getDataInLinkedList(line[1])), this.r.t1,Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T2")) {
                    this.assembly.DataList.changeData(this.r.t2, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t2,Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T3")) {
                    this.assembly.DataList.changeData(this.r.t3, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t3,Integer.parseInt(line[3]), line[2]);
                } else {
                    this.assembly.DataList.changeData(line[2], (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), line[2],Integer.parseInt(line[3]), line[2]);
                }
            } else {
                System.out.println("Error");
            }
        }else if(line[2].equals("*")){
            if (this.assembly.DataList.getDataInLinkedList(line[1]) != null) {
                if (line[4].equals("T0")) {
                    this.assembly.DataList.changeData(this.r.t0, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData((this.assembly.DataList.getDataInLinkedList(line[1])), this.r.t0, Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T1")) {
                    this.assembly.DataList.changeData(this.r.t1, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData((this.assembly.DataList.getDataInLinkedList(line[1])), this.r.t1,Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T2")) {
                    this.assembly.DataList.changeData(this.r.t2, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t2,Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T3")) {
                    this.assembly.DataList.changeData(this.r.t3, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t3,Integer.parseInt(line[3]), line[2]);
                } else {
                    this.assembly.DataList.changeData(line[2], (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), line[2],Integer.parseInt(line[3]), line[2]);
                }
            } else {
                System.out.println("Error");
            }
        }else if(line[2].equals("/")){
            if (this.assembly.DataList.getDataInLinkedList(line[1]) != null) {
                if (line[4].equals("T0")) {
                    this.assembly.DataList.changeData(this.r.t0, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData((this.assembly.DataList.getDataInLinkedList(line[1])), this.r.t0, Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T1")) {
                    this.assembly.DataList.changeData(this.r.t1, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData((this.assembly.DataList.getDataInLinkedList(line[1])), this.r.t1,Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T2")) {
                    this.assembly.DataList.changeData(this.r.t2, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t2,Integer.parseInt(line[3]), line[2]);
                } else if (line[4].equals("T3")) {
                    this.assembly.DataList.changeData(this.r.t3, (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t3,Integer.parseInt(line[3]), line[2]);
                } else {
                    this.assembly.DataList.changeData(line[2], (this.assembly.DataList.findPositionData(line[1])+(Integer.parseInt(line[3])*2)));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), line[2],Integer.parseInt(line[3]), line[2]);
                }
            } else {
                System.out.println("Error");
            }
        }
        else {
            if (this.assembly.DataList.getDataInLinkedList(line[1]) != null) {
                if (line[2].equals("T0")) {
                    this.assembly.DataList.changeData(this.r.t0, this.assembly.DataList.findPositionData(line[1]));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t0, 0, "");
                } else if (line[2].equals("T1")) {
                    this.assembly.DataList.changeData(this.r.t1, this.assembly.DataList.findPositionData(line[1]));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t1, 0, "");
                } else if (line[2].equals("T2")) {
                    this.assembly.DataList.changeData(this.r.t2, this.assembly.DataList.findPositionData(line[1]));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t2, 0, "");
                } else if (line[2].equals("T3")) {
                    this.assembly.DataList.changeData(this.r.t3, this.assembly.DataList.findPositionData(line[1]));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), this.r.t3, 0, "");
                } else {
                    this.assembly.DataList.changeData(line[2], this.assembly.DataList.findPositionData(line[1]));
                    this.assembly.storeCodeData.updateStoreData(this.assembly.DataList.getDataInLinkedList(line[1]), line[2], 0, "");
                }
            } else {
                System.out.println("Error");
            }
        }
    }
    //PUSH adds to the stack the value we want him to
    public void PUSH(String[] line){
        if(this.assembly.DataList.getVariableInLinkedList(line[2])==null){
            switch(line[1]){
                case "T0":
                    this.assembly.stack.arrayStackAdd(this.assembly.r.t0);
                    break;
                case "T1":
                    this.assembly.stack.arrayStackAdd(this.assembly.r.t1);
                    break;
                case "T2":
                    this.assembly.stack.arrayStackAdd(this.assembly.r.t2);
                    break;
                case "T3":
                    this.assembly.stack.arrayStackAdd(this.assembly.r.t3);
                    break;
                default:
                    if(this.assembly.DataList.getVariableInLinkedList(line[1]) != null){
                        this.assembly.stack.arrayStackAdd(this.assembly.DataList.getDataInLinkedList(line[1]));
                    }
                    else if(this.assembly.DataList.getVariableInLinkedList(line[1])==null)
                        this.assembly.stack.arrayStackAdd(line[1]);

            }
        }
    }
    //POP puts the last value of the stack in the register if none it will put null
    public void POP(String[] line){
        if((this.assembly.DataList.getVariableInLinkedList(line[2])==null) && (this.assembly.stack.getSizeStack()!=0)){
            switch(line[1]){
                case "T0":
                    this.r.updatet0(this.assembly.stack.arrayStack[this.assembly.stack.getSizeStack()-1]);
                    this.assembly.stack.arrayStackReduce();
                    break;
                case "T1":
                    this.r.updatet1(this.assembly.stack.arrayStack[this.assembly.stack.getSizeStack()-1]);
                    this.assembly.stack.arrayStackReduce();
                    break;
                case "T2":
                    this.r.updatet2(this.assembly.stack.arrayStack[this.assembly.stack.getSizeStack()-1]);
                    this.assembly.stack.arrayStackReduce();
                    break;
                case "T3":
                    this.r.updatet3(this.assembly.stack.arrayStack[this.assembly.stack.getSizeStack()-1]);
                    this.assembly.stack.arrayStackReduce();
                    break;
                default:
                    System.out.println("Error");
            }}
            else{
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0("0");
                        this.assembly.stack.arrayStackReduce();
                        break;
                    case "T1":
                        this.r.updatet1("0");
                        this.assembly.stack.arrayStackReduce();
                        break;
                    case "T2":
                        this.r.updatet2("0");
                        this.assembly.stack.arrayStackReduce();
                        break;
                    case "T3":
                        this.r.updatet3("0");
                        this.assembly.stack.arrayStackReduce();
                        break;
                    default:
                        System.out.println("Error");
                }
            }
    }
    //AND does the logical port AND between a register and a register, a variable or a constant
    public void AND(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t0) & Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t0) & Integer.parseInt(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t0) & Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t1) & Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t1) & Integer.parseInt(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t1) & Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t2) & Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t2) & Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t2) & Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t3) & Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t3) & Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t3) & Integer.parseInt(this.r.t2))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t0) & Integer.parseInt(line[2]))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t1) & Integer.parseInt(line[2]))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t2) & Integer.parseInt(line[2]))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t3) & Integer.parseInt(line[2]))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    this.r.updatet0((Integer.parseInt(this.r.t0) & Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T1":
                    this.r.updatet1((Integer.parseInt(this.r.t1) & Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T2":
                    this.r.updatet2((Integer.parseInt(this.r.t2) & Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T3":
                    this.r.updatet3((Integer.parseInt(this.r.t3) & Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
    //OR does the logical port OR between a register and a register, a variable or a constant
    public void OR(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t0) | Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t0) | Integer.parseInt(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t0) | Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t1) | Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t1) | Integer.parseInt(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t1) | Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t2) | Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t2) | Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t2) | Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t3) | Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t3) | Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t3) | Integer.parseInt(this.r.t2))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t0) | Integer.parseInt(line[2]))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t1) | Integer.parseInt(line[2]))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t2) | Integer.parseInt(line[2]))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t3) | Integer.parseInt(line[2]))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    this.r.updatet0((Integer.parseInt(this.r.t0) | Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T1":
                    this.r.updatet1((Integer.parseInt(this.r.t1) | Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T2":
                    this.r.updatet2((Integer.parseInt(this.r.t2) | Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T3":
                    this.r.updatet3((Integer.parseInt(this.r.t3) | Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
    //NOT does the logical port NOT of a register
    public void NOT(String[] line){
        switch (line[1]) {
            case "T0":
                this.r.updatet0(Integer.toBinaryString(Integer.parseInt(this.r.t0))+"");
                for(int b =0; b<this.r.t0.length(); b++){
                    if(this.r.t0.charAt(b) == '0') {
                        this.r.updatet0(this.r.t0.substring(0, b) + '1' + this.r.t0.substring(b+1));
                    }else{
                        this.r.updatet0(this.r.t0.substring(0, b) + '0' + this.r.t0.substring(b+1));
                    }
                }
                this.r.updatet0(Integer.parseInt(this.r.t0,2)+"");
                break;
            case "T1":
                this.r.updatet1(Integer.toBinaryString(Integer.parseInt(this.r.t1))+"");
                for(int b =0; b<this.r.t1.length(); b++){
                    if(this.r.t0.charAt(b) == '0') {
                        this.r.updatet1(this.r.t1.substring(0, b) + '1' + this.r.t1.substring(b+1));
                    }else{
                        this.r.updatet1(this.r.t1.substring(0, b) + '0' + this.r.t1.substring(b+1));
                    }
                }
                this.r.updatet1(Integer.parseInt(this.r.t1,2)+"");
                break;
            case "T2":
                this.r.updatet2(Integer.toBinaryString(Integer.parseInt(this.r.t2))+"");
                for(int b =0; b<this.r.t2.length(); b++){
                    if(this.r.t2.charAt(b) == '0') {
                        this.r.updatet2(this.r.t2.substring(0, b) + '1' + this.r.t2.substring(b+1));
                    }else{
                        this.r.updatet2(this.r.t2.substring(0, b) + '0' + this.r.t2.substring(b+1));
                    }
                }
                this.r.updatet2(Integer.parseInt(this.r.t2,2)+"");
                break;
            case "T3":
                this.r.updatet3(Integer.toBinaryString(Integer.parseInt(this.r.t3))+"");
                for(int b =0; b<this.r.t3.length(); b++){
                    if(this.r.t3.charAt(b) == '0') {
                        this.r.updatet3(this.r.t3.substring(0, b) + '1' + this.r.t3.substring(b+1));
                    }else{
                        this.r.updatet3(this.r.t3.substring(0, b) + '0' + this.r.t3.substring(b+1));
                    }
                }
                this.r.updatet3(Integer.parseInt(this.r.t3,2)+"");
                break;
            default:
                System.out.println("Error");
        }
    }
    //ADD does the sum of the value between a register1 and a register, a variable or a constant and the value of the sum is stored in register1
    public void ADD(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t0) + Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t0) + Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t0) + Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t1) + Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t1) + Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t1) + Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t2) + Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t2) + Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t2) + Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t3) + Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t3) + Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t3) + Float.parseFloat(this.r.t2))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t0) + Float.parseFloat(line[2]))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t1) + Float.parseFloat(line[2]))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t2) + Float.parseFloat(line[2]))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t3) + Float.parseFloat(line[2]))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    this.r.updatet0((Float.parseFloat(this.r.t0) + Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T1":
                    this.r.updatet1((Float.parseFloat(this.r.t1) + Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T2":
                    this.r.updatet2((Float.parseFloat(this.r.t2) + Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                case "T3":
                    this.r.updatet3((Float.parseFloat(this.r.t3) + Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])))+"");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
    //SUB does the subtraction of the value between a register, a variable or a constant and a register1, the value of the subtraction is stored in register1
    public void SUB(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t0) - Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t0) - Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t0) - Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t1) - Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t1) - Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t1) - Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t2) - Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t2) - Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t2) - Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t3) - Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t3) - Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t3) - Float.parseFloat(this.r.t2))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(line[2]) - Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(line[2]) - Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(line[2]) - Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(line[2]) - Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    this.r.updatet0((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) - Float.parseFloat(this.r.t0))+"");
                    break;
                case "T1":
                    this.r.updatet1((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) - Float.parseFloat(this.r.t1))+"");
                    break;
                case "T2":
                    this.r.updatet2((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) - Float.parseFloat(this.r.t2))+"");
                    break;
                case "T3":
                    this.r.updatet3((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) - Float.parseFloat(this.r.t3))+"");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
    //SUB does the division the value between a register, a variable or a constant and a register1, the value of the division is stored in register1
    public void DIV(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t0) / Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t0) / Integer.parseInt(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t0) / Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t1) / Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t1) / Integer.parseInt(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t1) / Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t2) / Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t2) / Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(this.r.t2) / Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(this.r.t3) / Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(this.r.t3) / Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(this.r.t3) / Integer.parseInt(this.r.t2))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Integer.parseInt(line[2]) / Integer.parseInt(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Integer.parseInt(line[2]) / Integer.parseInt(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Integer.parseInt(line[2]) / Integer.parseInt(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Integer.parseInt(line[2]) / Integer.parseInt(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    this.r.updatet0((Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])) / Integer.parseInt(this.r.t0))+"");
                    break;
                case "T1":
                    this.r.updatet1((Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])) / Integer.parseInt(this.r.t1))+"");
                    break;
                case "T2":
                    this.r.updatet2((Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])) / Integer.parseInt(this.r.t2))+"");
                    break;
                case "T3":
                    this.r.updatet3((Integer.parseInt(assembly.DataList.getDataInLinkedList(line[2])) / Integer.parseInt(this.r.t3))+"");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
    //MUL does the multiplication of the value between a register1 and a register, a variable or a constant and the value of the multiplication is stored in register1
    public void MUL(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t0) * Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t0) * Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t0) * Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t1) * Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t1) * Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t1) * Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t2) * Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t2) * Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t2) * Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t3) * Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t3) * Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t3) * Float.parseFloat(this.r.t2))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(line[2]) * Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(line[2]) * Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(line[2]) * Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(line[2]) * Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    this.r.updatet0((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) * Float.parseFloat(this.r.t0))+"");
                    break;
                case "T1":
                    this.r.updatet1((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) * Float.parseFloat(this.r.t1))+"");
                    break;
                case "T2":
                    this.r.updatet2((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) * Float.parseFloat(this.r.t2))+"");
                    break;
                case "T3":
                    this.r.updatet3((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) * Float.parseFloat(this.r.t3))+"");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
    //MOD does the modulo of the value between a register1 and a register, a variable or a constant and the value of the modulo is stored in register1
    public void MOD(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t0) % Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t0) % Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t0) % Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t1) % Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t1) % Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t1) % Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t2) % Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t2) % Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(this.r.t2) % Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(this.r.t3) % Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(this.r.t3) % Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(this.r.t3) % Float.parseFloat(this.r.t2))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        this.r.updatet0((Float.parseFloat(line[2]) % Float.parseFloat(this.r.t0))+"");
                        break;
                    case "T1":
                        this.r.updatet1((Float.parseFloat(line[2]) % Float.parseFloat(this.r.t1))+"");
                        break;
                    case "T2":
                        this.r.updatet2((Float.parseFloat(line[2]) % Float.parseFloat(this.r.t2))+"");
                        break;
                    case "T3":
                        this.r.updatet3((Float.parseFloat(line[2]) % Float.parseFloat(this.r.t3))+"");
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    this.r.updatet0((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) % Float.parseFloat(this.r.t0))+"");
                    break;
                case "T1":
                    this.r.updatet1((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) % Float.parseFloat(this.r.t1))+"");
                    break;
                case "T2":
                    this.r.updatet2((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) % Float.parseFloat(this.r.t2))+"");
                    break;
                case "T3":
                    this.r.updatet3((Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) % Float.parseFloat(this.r.t3))+"");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
    //INC increases a register
    public void INC(String[] line){
        switch (line[1]) {
            case "T0":
                this.r.updatet0((Integer.parseInt(this.r.t0)+1)+"");
                break;
            case "T1":
                this.r.updatet1((Integer.parseInt(this.r.t1)+1)+"");
                break;
            case "T2":
                this.r.updatet2((Integer.parseInt(this.r.t2)+1)+"");
                break;
            case "T3":
               this.r.updatet3((Integer.parseInt(this.r.t3)+1)+"");
                break;
            default:
                System.out.println("Error");
        }
    }
    //DEC decreases a register
    public void DEC(String[] line){
        switch (line[1]) {
            case "T0":
                this.r.updatet0((Integer.parseInt(this.r.t0)-1)+"");
                break;
            case "T1":
                this.r.updatet1((Integer.parseInt(this.r.t1)-1)+"");
                break;
            case "T2":
                this.r.updatet2((Integer.parseInt(this.r.t2)-1)+"");
                break;
            case "T3":
                this.r.updatet3((Integer.parseInt(this.r.t3)-1)+"");
                break;
            default:
                System.out.println("Error");
        }
    }
    //If 2 values are equal jump to the LABEL
    public int BEQ(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        if(this.r.t0.equals(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(this.r.t0.equals(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(this.r.t0.equals(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(this.r.t0.equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(this.r.t0.equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        if(this.r.t1.equals(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(this.r.t1.equals(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(this.r.t1.equals(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(this.r.t1.equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(this.r.t1.equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        if(this.r.t2.equals(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(this.r.t2.equals(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(this.r.t2.equals(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(this.r.t2.equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(this.r.t2.equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        if(this.r.t3.equals(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(this.r.t3.equals(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(this.r.t3.equals(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(this.r.t3.equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(this.r.t3.equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        if(line[2].equals(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(line[2].equals(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(line[2].equals(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(line[2].equals(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(line[2].equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(line[2].equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    if(this.r.t0.equals(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T1":
                    if(this.r.t1.equals(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T2":
                    if(this.r.t2.equals(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T3":
                    if(this.r.t3.equals(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                default:
                    if(assembly.DataList.getDataInLinkedList(line[1]) != null){
                        if(assembly.DataList.getDataInLinkedList(line[2]).equals(assembly.DataList.getDataInLinkedList(line[1]))){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                    }else{
                        if(assembly.DataList.getDataInLinkedList(line[2]).equals(line[1])){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                    }
            }
        }
        return (assembly.r.PC+1);
    }
    //If 2 values aren't equal jump to the LABEL
    public int BNE(String[] line){
        System.out.println("const");
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            System.out.println("const1");
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        if(!this.r.t0.equals(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(!this.r.t0.equals(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(!this.r.t0.equals(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(!this.r.t0.equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(!this.r.t0.equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        if(!this.r.t1.equals(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(!this.r.t1.equals(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(!this.r.t1.equals(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(!this.r.t1.equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(!this.r.t1.equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        if(!this.r.t2.equals(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(!this.r.t2.equals(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(!this.r.t2.equals(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(!this.r.t2.equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(!this.r.t2.equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        if(!this.r.t3.equals(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(!this.r.t3.equals(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(!this.r.t3.equals(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(!this.r.t3.equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(!this.r.t3.equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else {
                System.out.println("const");
                switch (line[1]) {
                    case "T0":
                        if(!line[2].equals(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        System.out.println("const");
                        if(!line[2].equals(this.r.t1)){
                            System.out.println(line[2]);
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(!line[2].equals(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(!line[2].equals(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(!line[2].equals(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(!line[2].equals(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            }
        }else {
            System.out.println("const");
            switch (line[1]) {
                case "T0":
                    if(!this.r.t0.equals(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T1":
                    if(!this.r.t1.equals(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T2":
                    if(!this.r.t2.equals(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T3":
                    if(!this.r.t3.equals(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                default:
                    if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                        if(!assembly.DataList.getDataInLinkedList(line[2]).equals(assembly.DataList.getDataInLinkedList(line[1]))){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                    }else{
                        if(!assembly.DataList.getDataInLinkedList(line[2]).equals(line[1])){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                    }
            }
        }
        return (assembly.r.PC+1);
    }
    //If the first value is greater than the second jump to the label
    public int BBG(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        if(Float.parseFloat(this.r.t0) < Float.parseFloat(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(Float.parseFloat(this.r.t0) < Float.parseFloat(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(Float.parseFloat(this.r.t0) < Float.parseFloat(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(this.r.t0) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(this.r.t0) < Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        if(Float.parseFloat(this.r.t1) < Float.parseFloat(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(Float.parseFloat(this.r.t1)<Float.parseFloat(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(Float.parseFloat(this.r.t1)<Float.parseFloat(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(this.r.t1)<Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(this.r.t1)<Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        if(Float.parseFloat(this.r.t2)<Float.parseFloat(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(Float.parseFloat(this.r.t2) < Float.parseFloat(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(Float.parseFloat(this.r.t2) < Float.parseFloat(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(this.r.t2) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(this.r.t2) < Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        if(Float.parseFloat(this.r.t3) < Float.parseFloat(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(Float.parseFloat(this.r.t3) < Float.parseFloat(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(Float.parseFloat(this.r.t3) < Float.parseFloat(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(this.r.t3) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(this.r.t3) < Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        if(Float.parseFloat(line[2]) < Float.parseFloat(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(Float.parseFloat(line[2]) < Float.parseFloat(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(Float.parseFloat(line[2]) < Float.parseFloat(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(Float.parseFloat(line[2]) < Float.parseFloat(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(line[2]) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(line[2]) < Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    if(Float.parseFloat(this.r.t0) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T1":
                    if(Float.parseFloat(this.r.t1) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T2":
                    if(Float.parseFloat(this.r.t2) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T3":
                    if(Float.parseFloat(this.r.t3) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                default:
                    if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                        if(Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                    }else{
                        if(Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) < Float.parseFloat(line[1])){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                    }
            }
        }
        return assembly.r.PC+1;
    }
    //If the first value is smaller than the second jump to the label
    public int BSM(String[] line){
        if(assembly.DataList.getVariableInLinkedList(line[2]) == null) {
            if (line[2].equals("T0")) {
                switch (line[1]) {
                    case "T1":
                        if(Float.parseFloat(this.r.t0) > Float.parseFloat(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(Float.parseFloat(this.r.t0) > Float.parseFloat(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(Float.parseFloat(this.r.t0) > Float.parseFloat(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(this.r.t0) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(this.r.t0) > Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T1")) {
                switch (line[1]) {
                    case "T0":
                        if(Float.parseFloat(this.r.t1) > Float.parseFloat(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(Float.parseFloat(this.r.t1) > Float.parseFloat(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(Float.parseFloat(this.r.t1) > Float.parseFloat(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(this.r.t1) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(this.r.t1) > Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T2")) {
                switch (line[1]) {
                    case "T0":
                        if(Float.parseFloat(this.r.t2) > Float.parseFloat(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(Float.parseFloat(this.r.t2) > Float.parseFloat(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(Float.parseFloat(this.r.t2) > Float.parseFloat(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(this.r.t2) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(this.r.t2) > Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else if (line[2].equals("T3")) {
                switch (line[1]) {
                    case "T0":
                        if(Float.parseFloat(this.r.t3) > Float.parseFloat(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(Float.parseFloat(this.r.t3) > Float.parseFloat(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(Float.parseFloat(this.r.t3) > Float.parseFloat(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(this.r.t3) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(this.r.t3) > Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            } else {
                switch (line[1]) {
                    case "T0":
                        if(Float.parseFloat(line[2]) > Float.parseFloat(this.r.t0)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T1":
                        if(Float.parseFloat(line[2]) > Float.parseFloat(this.r.t1)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T2":
                        if(Float.parseFloat(line[2]) > Float.parseFloat(this.r.t2)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    case "T3":
                        if(Float.parseFloat(line[2]) > Float.parseFloat(this.r.t3)){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                        break;
                    default:
                        if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                            if(Float.parseFloat(line[2]) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }else{
                            if(Float.parseFloat(line[2]) > Float.parseFloat(line[1])){
                                for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                    if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                        return b;
                                    }
                                }
                            }
                        }
                }
            }
        }else {
            switch (line[1]) {
                case "T0":
                    if(Float.parseFloat(this.r.t0) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T1":
                    if(Float.parseFloat(this.r.t1) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T2":
                    if(Float.parseFloat(this.r.t2) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                case "T3":
                    if(Float.parseFloat(this.r.t3) < Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2]))){
                        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                            if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                return b;
                            }
                        }
                    }
                    break;
                default:
                    if(assembly.DataList.getVariableInLinkedList(line[1]) != null){
                        if(Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) > Float.parseFloat(assembly.DataList.getDataInLinkedList(line[1]))){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                    }else{
                        if(Float.parseFloat(assembly.DataList.getDataInLinkedList(line[2])) > Float.parseFloat(line[1])){
                            for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                                if(line[3].equals(assembly.storeCodeData.store[b][0])){
                                    return b;
                                }
                            }
                        }
                    }
            }
        }
        return assembly.r.PC+1;
    }
    //JMP jumps to the LABEL
    public int JMP(String[] line){
        for(int b = 0; b < assembly.storeCodeData.sizeStoreCode; b++){
                if(line[1].equals(assembly.storeCodeData.store[b][0])){
                    return b;
                }
            }
        return -1;
    }
    //SRL applies *2^(const) on a register
    public void SRL(String[] line){
                switch (line[1]) {
                    case "T0":
                        for(int c = 0; c < Integer.parseInt(line[2]); c++){
                            this.r.updatet0((Integer.parseInt(this.r.t0) << 1)+"");
                        }
                        break;
                    case "T1":
                        for(int c = 0; c < Integer.parseInt(line[2]); c++){
                            this.r.updatet1((Integer.parseInt(this.r.t1) << 1)+"");
                        }
                        break;
                    case "T2":
                        for(int c = 0; c < Integer.parseInt(line[2]); c++){
                            this.r.updatet2((Integer.parseInt(this.r.t2) << 1)+"");
                        }
                        break;
                    case "T3":
                        for(int c = 0; c < Integer.parseInt(line[2]); c++){
                            this.r.updatet3((Integer.parseInt(this.r.t3) << 1)+"");
                        }
                        break;
                    default:
                        System.out.println("Error");
                }
    }
    //SRR applies /2^(const) on a register
    public void SRR(String[] line){
        switch (line[1]) {
            case "T0":
                for(int c = 0; c < Integer.parseInt(line[2]); c++){
                    this.r.updatet0((1 >> Integer.parseInt(this.r.t0))+"");
                }
                break;
            case "T1":
                for(int c = 0; c < Integer.parseInt(line[2]); c++){
                    this.r.updatet1((1 >> Integer.parseInt(this.r.t1))+"");
                }
                break;
            case "T2":
                for(int c = 0; c < Integer.parseInt(line[2]); c++){
                    this.r.updatet2((1 >> Integer.parseInt(this.r.t2))+"");
                }
                break;
            case "T3":
                for(int c = 0; c < Integer.parseInt(line[2]); c++){
                    this.r.updatet3((1 >> Integer.parseInt(this.r.t3))+"");
                }
                break;
            default:
                System.out.println("Error");
        }
    }
    //exits the IDE
    public int HTL(){
        return 1;
    }
}
