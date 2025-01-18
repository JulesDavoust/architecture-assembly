package com.company;
import java.util.ArrayList;

public class StoreCodeData {

    LinkedList AdressVariableData;

    int nbrIndexStoreData;
    int nbrIndexStoreCode;
    int nbrColStoreCode;
    int nbrColStoreData;

    int sizeStoreData;
    int sizeStoreCode;
    int sizeStoreCodeData;

    String[][] StoreData;
    String[][] StoreCode;
    String[][] store;

    private ArrayList< String[]> storeCodeData = new ArrayList<>();

    StoreCodeData(int nbrIndexStoreCode, int nbrIndexStoreData, int nbrColStoreCode, int nbrColStoreData, LinkedList AdressVariableData){
        this.nbrIndexStoreCode = nbrIndexStoreCode;
        this.nbrIndexStoreData = nbrIndexStoreData;
        this.nbrColStoreCode = nbrColStoreCode;
        this.nbrColStoreData = nbrColStoreData;
        this.sizeStoreData = nbrIndexStoreData;
        this.sizeStoreCode = nbrIndexStoreCode;
        this.AdressVariableData = AdressVariableData;
        this.sizeStoreCodeData = this.sizeStoreData + this.sizeStoreCode;
        StoreData = new String[this.nbrIndexStoreData][this.nbrColStoreData];
        StoreCode = new String[this.nbrIndexStoreCode][this.nbrColStoreCode];
    }
    // Store the data of the code in the both array storeCodeData and store
    public void storeCodeData(){
        for(int i = 0; i<sizeStoreCode; i++){
            storeCodeData.add(StoreCode[i]);
        }
        for(int i = 0; i<sizeStoreData; i++){
            storeCodeData.add(StoreData[i]);
        }

        store = new String[storeCodeData.size()][4];
        store = storeCodeData.toArray(store);
    }
    //Stringify the store
    public void toStringStore(){
        System.out.println("Store of Code and Data : ");
        System.out.println("Size of data store : "+this.sizeStoreData);
        System.out.println("Size of code store : "+this.sizeStoreCode);
        System.out.print("Data : ");
        for(int i = 0; i<store.length; i++){
            if(i == sizeStoreCode) System.out.print("Data : ");
            for(int j = 0; j<store[i].length; j++){
                if(store[i][j]!=null)
                System.out.print(store[i][j]+" ");
            }
        }
    }
    // Update the Store Data
    public void updateStoreData(String val, String update, int pos, String calc){
        int i = sizeStoreCode;
        int find = 0;
        while (i < sizeStoreCodeData && find == 0) {
            if(store[i][0].equals(val)){
                if(calc.equals("+") && (i + pos) < sizeStoreCodeData){ store[i + pos][0] = update; find = 1;}
                else if(calc.equals("-") && (i - pos) > sizeStoreCode){ store[i - pos][0] = update; find = 1;}
                else if(calc.equals("*") && (i * pos) < sizeStoreCode){ store[i * pos][0] = update; find = 1;}
                else if(calc.equals("/") && (i / pos) > sizeStoreCode){ store[i / pos][0] = update; find = 1;}
                else if(calc.equals("")) store[i][0] = update;
                else{
                    String[] random = new String[]{val};
                    storeCodeData.add(random);
                    sizeStoreData++;
                    sizeStoreCodeData++;
                    store = storeCodeData.toArray(store);
                    find = 1;
                }
            }
            i++;
        }
    }
    //find the position of the data str
    public int findPositionData(String str){
        for(int s = sizeStoreCode; s<sizeStoreCodeData; s++){
            if(str.equals(store[s][0])){
                return s;
            }
        }
        return -1;
    }
    //find the data in the position "position"
    public String findData(int position){
        for(int s = sizeStoreCode; s<sizeStoreCodeData; s++){
            if(position == s){
                return store[s][0];
            }
        }
        return "121002";
    }
    //stringify storeData which stores the variables
    public void toStringStoreData(){
        for(int i = 0; i< sizeStoreData; i++) {
            for (int j = 0; j < store[i].length; j++) {
                System.out.print(store[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Display adressVariableData
    public void toStringAdressVariableData(){
        AdressVariableData.Display();
    }
    //Stringify StoreCode which stores the entire code
    public void toStringStoreCode(){
        for(int i = 0; i< sizeStoreCode; i++) {
            for (int j = 0; j < store[i].length; j++) {
                if(store[i][j]!=null)
                    System.out.print(store[i][j]+" ");
            }
            System.out.println();
        }
    }


}
