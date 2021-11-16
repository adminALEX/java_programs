package data_structures.linked_lists;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedListMethods lm = new LinkedListMethods();
        lm.insertData(5);
        lm.insertData(23);
        lm.insertData(43);
        lm.insertData(33);
        lm.insertAtStart(200);
        lm.insertAtIndex(99, 3);
        lm.delete(2);
        lm.show();
    }
}
