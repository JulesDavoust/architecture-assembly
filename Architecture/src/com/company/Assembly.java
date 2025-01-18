package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assembly {
    StoreCodeData storeCodeData;

    LinkedList DataList = new LinkedList();

    register r = new register();

    Stack stack = new Stack();

    File assembly;
    FileReader FRassembly;
    BufferedReader BRassembly;
    StringBuffer SBassembly;

    String FileName;

    List ListAssemblyFile = new ArrayList();

    boolean dataDetection = false;
    boolean codeDetection = false;

    String lineCode;
    String lineData;

    int cptDataLine = 0;
    int cptCodeLine = 0;
    int cptCodeCol = 0;
    int cptDataCol = 0;
    int cpt = 0;
    int cptCode = 0;

    String path;
    //constructor
    Assembly(String path) {
        this.path = path;
        this.assembly = new File(path);
        this.FileName = new File(path).getName();
    }
    //Read the file
    public void ReadFile() {
        try {
            this.FRassembly = new FileReader(this.assembly);
            this.BRassembly = new BufferedReader(this.FRassembly);
            this.SBassembly = new StringBuffer();
            String line;
            try {
                while ((line = BRassembly.readLine()) != null) {
                    if(!line.equals("")) {
                        if (line.charAt(0) != '!') {
                            if (!this.codeDetection) {
                                VariableDetection(line);
                            }
                            if (!this.dataDetection) {
                                CodeDetection(line);
                            }
                        }
                    }
                    SBassembly.append(line);
                    SBassembly.append("\n");
                    if (!line.equals("")) {
                        ListAssemblyFile.add(line);
                    }
                }
                FRassembly.close();
                System.out.println("\n\u001B[31mFile content: \u001B[0m\n");
                System.out.println(SBassembly.toString());
                this.FRassembly = new FileReader(this.assembly);
                this.BRassembly = new BufferedReader(this.FRassembly);
                this.storeCodeData = new StoreCodeData(cptCodeLine, cptDataLine, cptCodeCol, cptDataCol-1, DataList);
                this.codeDetection = false;
                this.dataDetection = false;
                while ((line = BRassembly.readLine()) != null) {
                    if(!line.equals("")) {
                        if (line.charAt(0) != '!') {
                            if (!this.codeDetection) {
                                getDataVariable(line, storeCodeData);

                            }
                            if (!this.dataDetection) {
                                getDataCode(line, storeCodeData);
                            }
                        }
                    }

                }
                FRassembly.close();
                //storeCodeData.toStringStoreData();
                //storeCodeData.toStringStoreCode();

                storeCodeData.storeCodeData();
                //storeCodeData.toStringStore();
                //DataList.Display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found sorry...\n");
        }
    }
    //See if it is a variable and sets the cptDataLine
    private void VariableDetection(String line) {
        if (!dataDetection && line.equals("#DATA")) {
            dataDetection = true;
        } else {
            if (line.equals("") || line.equals("#CODE")) {
                dataDetection = false;
            }
            if (dataDetection) {
                String[] mots = getString(line);
                if(cptDataCol < mots.length){
                    cptDataCol = mots.length;
                }
                cptDataLine++;
            }
        }
    }
    //See if it is a code and sets the cptCodeCol
    private void CodeDetection(String line) {
        if (!codeDetection && line.equals("#CODE")) {
            codeDetection = true;
        } else {
            if (line.equals("")) {
                codeDetection = false;
            }
            if (codeDetection) {
                String[] mots = getString(line);
                if(cptCodeCol < mots.length){
                    cptCodeCol = mots.length;
                }
                cptCodeLine++;
            }
        }
    }
    //Get the variable and store it in storeCodeData
    private void getDataVariable(String line, StoreCodeData storeCodeData) {
        if (!dataDetection && line.equals("#DATA")) {
            dataDetection = true;
        } else {
            if (line.equals("") || line.equals("#CODE")) {
                dataDetection = false;
            }
            if (dataDetection) {
                String[] mots = getString(line);
                for(int i = 1; i<mots.length; i++){
                    storeCodeData.StoreData[cpt][0] = mots[i];
                }
                DataList.add(mots[0]);
                DataList.add(storeCodeData.StoreData[cpt][0]);
                this.cpt++;
            }
        }
    }
    //Get the code and store it in storeCodeData
    private void getDataCode(String line, StoreCodeData storeCodeData){
        if (!codeDetection && line.equals("#CODE")) {
            codeDetection = true;
        } else {
            if (line.equals("")) {
                codeDetection = false;
            }
            if (codeDetection) {
                String[] mots = getString(line);
                for(int i = 0; i<mots.length; i++){
                    storeCodeData.StoreCode[cptCode][i] = mots[i];
                }
                this.cptCode++;
            }
        }
    }
    //Returns an array of strings to display it and launch the appropriate command
    public String[] getString(String str) {
        final String split = " ";
        return str.split(split);
    }
    // display Pretty interface hihi
    public void Interface(){
        System.out.println("\u001B[31mFile name\u001B[0m\n" + this.FileName);
        System.out.println("\n\u001B[31mCode\u001B[0m");
        storeCodeData.toStringStoreCode();
        System.out.println("\n\u001B[31mRegisters\u001B[0m");
        System.out.println("\n\u001B[34mNext instruction\u001B[0m");
        for (int i = 0; i < storeCodeData.nbrColStoreCode; i++) {
            if(storeCodeData.store[r.PC][i] != null)
                System.out.print(storeCodeData.store[r.PC][i] + " ");
        }
        System.out.println("\n");
        r.DisplayRegister();
        System.out.println("\n\u001B[31mMemory info\u001B[0m");
        System.out.println("\n\u001B[34mVariables\u001B[0m");
        storeCodeData.toStringAdressVariableData();
        System.out.println("\n\u001B[34mStack\u001B[0m");
        for(int i=(stack.getSizeStack()-1);i >= 0;i--)
            System.out.println(stack.arrayStack[i]);
        System.out.println("\n\n\u001B[33m==================================================================\u001B[0m");
    }
    //display After Simulation
    public void AfterSimulate(){
        System.out.println("\u001B[31mCode\u001B[0m");
        storeCodeData.toStringStoreCode();
        System.out.println("\n\u001B[31mRegisters\u001B[0m");
        System.out.println("\n\u001B[34mNext instruction\u001B[0m");
        if(r.PC < storeCodeData.sizeStoreCode) {
            for (int i = 0; i < storeCodeData.nbrColStoreCode; i++) {
                if(storeCodeData.store[r.PC][i] != null)
                    System.out.print(storeCodeData.store[r.PC][i] + " ");
            }
            System.out.println("\n");
        }
        else System.out.println("Nothing\n");
        r.DisplayRegister();
        System.out.println("\n\u001B[31mMemory info\u001B[0m");
        System.out.println("\n\u001B[34mVariables\u001B[0m");
        storeCodeData.toStringAdressVariableData();
        System.out.println("\n\u001B[34mStack\u001B[0m");
        for(int i=(stack.getSizeStack()-1);i >= 0;i--)
            System.out.println(stack.arrayStack[i]);
        System.out.println("\n\n\u001B[33m==================================================================\u001B[0m");
    }

}
