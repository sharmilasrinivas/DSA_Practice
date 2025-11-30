import arrays.OneDArrayOperations;

public class TestOneDArrayOperations {
    public static void main(String[] args){
        OneDArrayOperations a = new OneDArrayOperations(10);

        a.append(3);
        a.append(6);
        a.append(9);

        a.traversal();

        a.insert(3,12);
        a.traversal();

        a.deleteAt(3);
        a.traversal();

        a.deleteValue(6);
        a.traversal();

        a.deleteBegin();
        a.traversal();

        a.deleteEnd();
        a.traversal();

        System.out.println("Is full : "+ a.isFull());
        System.out.println("Is empty : "+ a.isEmpty());
        System.out.println("Size : "+a.getSize());
    }
}
