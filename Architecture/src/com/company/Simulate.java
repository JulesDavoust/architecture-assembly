package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Simulate{
    ALU alu;
    Assembly assembly;

    Simulate(Assembly a){
        this.assembly = a;
        alu = new ALU(assembly, assembly.r);
    }
    //simulation all at once
    public void simulate(){

        String instruction;
        int stop = 0;
        System.out.println("Simulate !");
        assembly.r.PC = 0;
        while(assembly.r.PC < assembly.storeCodeData.sizeStoreCode && stop == 0){
                instruction = assembly.storeCodeData.store[assembly.r.PC][0];
                    switch (instruction) {
                        //If the first string of a line is LDA and so on
                        case "LDA":
                            //Goes on the function LDA
                            alu.LDA(assembly.storeCodeData.store[assembly.r.PC]);
                            //update the pointer counter it
                            assembly.r.PC++;
                            break;
                        case "STR":
                            alu.STR(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "PUSH":
                            alu.PUSH(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "POP":
                            alu.POP(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "AND":
                            alu.AND(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "OR":
                            alu.OR(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "NOT":
                            alu.NOT(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "ADD":
                            alu.ADD(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "SUB":
                            alu.SUB(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "DIV":
                            alu.DIV(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "MUL":
                            alu.MUL(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "MOD":
                            alu.MOD(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "INC":
                            alu.INC(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "DEC":
                            alu.DEC(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "BEQ":
                            assembly.r.PC = alu.BEQ(assembly.storeCodeData.store[assembly.r.PC]);
                            break;
                        case "BNE":
                            System.out.println("const");
                            assembly.r.PC = alu.BNE(assembly.storeCodeData.store[assembly.r.PC]);
                            break;
                        case "BBG":
                            assembly.r.PC = alu.BBG(assembly.storeCodeData.store[assembly.r.PC]);
                            break;
                        case "BSM":
                            assembly.r.PC = alu.BSM(assembly.storeCodeData.store[assembly.r.PC]);
                            break;
                        case "JMP":
                            assembly.r.PC = alu.JMP(assembly.storeCodeData.store[assembly.r.PC]);
                            break;
                        case "HTL":
                            stop = alu.HTL();
                            assembly.r.PC++;
                            break;
                        case "SRL":
                            alu.SRL(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        case "SRR":
                            alu.SRR(assembly.storeCodeData.store[assembly.r.PC]);
                            assembly.r.PC++;
                            break;
                        default:
                            System.out.println("");
                            assembly.r.PC++;
                    }
        }
        assembly.AfterSimulate();
    }
    // Simulation step by step
    public void stepSimulation(){

        String instruction;
        String next;
        int stop = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Step Simulation !\n");
        assembly.r.PC = 0;
        while(assembly.r.PC < assembly.storeCodeData.sizeStoreCode && stop == 0){
            instruction = assembly.storeCodeData.store[assembly.r.PC][0];
            switch (instruction) {
                case "LDA":
                    alu.LDA(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "STR":
                    alu.STR(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "PUSH":
                    alu.PUSH(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "POP":
                    alu.POP(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "AND":
                    alu.AND(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "OR":
                    alu.OR(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "NOT":
                    alu.NOT(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "ADD":
                    alu.ADD(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "SUB":
                    alu.SUB(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "DIV":
                    alu.DIV(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "MUL":
                    alu.MUL(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "MOD":
                    alu.MOD(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "INC":
                    alu.INC(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "DEC":
                    alu.DEC(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "BEQ":
                    assembly.r.PC = alu.BEQ(assembly.storeCodeData.store[assembly.r.PC]);
                    break;
                case "BNE":
                    System.out.println("const");
                    assembly.r.PC = alu.BNE(assembly.storeCodeData.store[assembly.r.PC]);
                    break;
                case "BBG":
                    assembly.r.PC = alu.BBG(assembly.storeCodeData.store[assembly.r.PC]);
                    break;
                case "BSM":
                    assembly.r.PC = alu.BSM(assembly.storeCodeData.store[assembly.r.PC]);
                    break;
                case "JMP":
                    assembly.r.PC = alu.JMP(assembly.storeCodeData.store[assembly.r.PC]);
                    break;
                case "HTL":
                    stop = alu.HTL();
                    assembly.r.PC++;
                    break;
                case "SRL":
                    alu.SRL(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                case "SRR":
                    alu.SRR(assembly.storeCodeData.store[assembly.r.PC]);
                    assembly.r.PC++;
                    break;
                default:
                    System.out.println("");
                    assembly.r.PC++;
            }
            assembly.AfterSimulate();
            if(!instruction.equals("HTL")){
                do {
                    System.out.println("\nTo go to the next line please enter 'next' :");
                    next = scan.next(); System.out.println();
                } while (!next.equals("next"));
            }
        }
    }

}
