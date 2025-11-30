package arrays; // this is ur arrays package name, u should import this for working with 1d arrays

//class contains all of ur methods
public class OneDArrayOperations {

    // private variables for data security (encapsulation)
    private int[] arr;
    private int size;
    private int capacity;

    //constructor
    public OneDArrayOperations(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    //print active elements
    public void printArray(){
        System.out.print("Elements are: ");
        for(int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Appending element at end
    public void append(int value){
        if(isFull()){
            System.out.println("Array is full.");
            return;
        }
        arr[size++] = value;
    }

    //insert element at a position
    public void insert(int pos, int value){
        if(isFull()){
            System.out.println("Array is full.");
            return;
        }
        for(int i=size-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=value;
        size++;
    }

    //delete at a position
    public void deleteAt(int pos){
        if(isEmpty()){
            System.out.println("Array is Empty.");
        }
        if(pos < 0 || pos >= size){
            System.out.print("Invalid Position.");
            return;
        }
        for(int i=pos;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    //delete a value
    public void deleteValue(int value){
        int pos = -1;
        for(int i=0;i<size;i++){
            if(arr[i]==value){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            System.out.println("Value not found.");
            return;
        }
        deleteAt(pos);
    }

    // delete at beginning
    public void deleteBegin(){
        deleteAt(0);
    }

    //delete at end
    public void deleteEnd(){
        if(isEmpty()){
            System.out.println("Array is Empty.");
            return;
        }
        size--;
    }

    // simply traverse
    public void traversal(){
        printArray();
    }

    //is full
    public boolean isFull(){
        return size == capacity;
    }

    //is empty
    public boolean isEmpty(){
        return size == 0;
    }

    //get size
    public int getSize(){
        return size;
    }

}
