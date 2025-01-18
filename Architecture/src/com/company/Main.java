package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s;
        int yn = 1;
        int sameFile = 0;

        Scanner scan = new Scanner(System.in);

        while(yn == 1) {
            //Random variable to launch the main
            int ynp = 1;
            try {
                //ask the file
                System.out.println("\u001B[32mLoad file (put the path of your file) :\u001B[0m");
                String path = scan.next();
                //Store the path the user put to the assembly
                Assembly assembly = new Assembly(path);
                assembly.ReadFile();
                assembly.Interface();

                //launch the simulation
                Simulate sim = new Simulate(assembly);

                while (ynp == 1) {
                    //reads the file
                    if (sameFile == 1) {
                        assembly = new Assembly(path);
                        assembly.ReadFile();
                        assembly.Interface();
                        sim = new Simulate(assembly);
                    }
                    do {
                        System.out.println("\n\nSimulate \u001B[32m(1)\u001B[0m or Step Simulation \u001B[32m(2)\u001B[0m :");
                        s = scan.nextInt();
                    } while (s < 1 || s > 2);
                    //simulate all the code at once
                    if (s == 1) sim.simulate();
                    //simulate step by step
                    else sim.stepSimulation();

                    //request after the simulation
                    System.out.println("\nDo you want to continue with the same file ? Or just exit ?");
                    do {
                        System.out.println("Exit \u001B[32m(0)\u001B[0m or Same file \u001B[32m(1)\u001B[0m or Change file \u001B[32m(2)\u001B[0m :");
                        ynp = scan.nextInt();
                        if (ynp == 1) sameFile = 1;
                    } while (ynp < 0 || ynp > 2);
                }
                //Bye bye
                if (ynp == 0) {
                    yn = 2;
                    System.out.println("\nGoodbye ! =)");
                }
            }catch (NullPointerException e){
                //Error in the path
                System.out.println("\n\nError: wrong path =(\n");
            }
        }
        scan.close();
        System.exit(0);
    }
}
