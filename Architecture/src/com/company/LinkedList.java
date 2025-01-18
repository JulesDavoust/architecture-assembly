package com.company;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList(){
        size = 0;
        first = null;
        last = null;
    }
    //get the size of the linked list (size)
    public int getSize(){
        return size;
    }
    //adds a value in the linked list
    public void add(String data){
        Node node = new Node(data);

        ++size;

        if(first == null){
            first = node;
            last = node;
        }else{
            last.assignedNext(node);
            last = node;
        }

        //System.out.println("\n\n\"" + data + "\" add it");
    }
    //delete a value in the linked list
    public void delete(int position){
        if(size == 0){
            System.out.println("List empty");
        }else if(position>size || position<1){
            System.out.println("Position doesn't exist");
        }else if(size == 1){
            System.out.println("\n\n\"" + first.getData() + "\" is delete");

            first = first.getNext();
            --size;
        }else{
            Node pointeur = first;
            for(int z = 1; z<(position + 1); z++){
                pointeur = pointeur.getNext();
            }
            pointeur.assignedNext(pointeur.getNext().getNext());
            size--;
        }
    }
    //changes the data at the position "position" in the linked list
    public void changeData(String data, int position){
        if(size == 0){
            System.out.println("List empty");
        }else if(position > size || position < 1){
           add(data);
        }else{
            Node pointeur = first;

            for(int z = 0; z<position; z++){

                if(pointeur.getNext() != null)
                    pointeur = pointeur.getNext();
            }
            pointeur.changeData(data);
        }
    }
    //returns the value if the variable is in the linked list
    public String getDataInLinkedList(String str){
        Node pointeur = first;
        while(pointeur != null){
            if(pointeur.getData().equals(str)){
                return(pointeur.getNext().getData());
            }else{
                pointeur = pointeur.getNext();
            }
        }
        return null;
    }
    //returns the variable if this variable is in the linked list
    public String getVariableInLinkedList(String str){
        Node pointeur = first;
        while(pointeur != null){
            if(pointeur.getData().equals(str)){
                return(pointeur.getData());
            }else{
                if(pointeur.getNext() != null)
                    pointeur = pointeur.getNext().getNext();
                else
                    pointeur = pointeur.getNext();
            }
        }
        return null;
    }
    //find the position of str in the linked list
    public int findPositionData(String str){
        int position = 0;
        Node pointeur = first;
        while(pointeur != null){
            if(pointeur.getData().equals(str)){
                return position+1;
            }else{
                pointeur = pointeur.getNext();
            }
            position++;
        }
        return 0;
    }
    //Display the linked list
    public void Display(){
        if(first != null){

            Node pointeur = first;

            while(pointeur != null){
                if(pointeur.getNext() != null){
                    System.out.println(pointeur.getData() + " " + pointeur.getNext().getData());
                    pointeur = pointeur.getNext().getNext();}
                else{
                    System.out.println(pointeur.getData() + " ");
                    pointeur = pointeur.getNext();}

            }
        }
    }

}
