package data_structures.linked_lists;

public class LinkedListMethods {
    Node head;
    public void insertData(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
      public void delete(int index){
        Node n = head;
        Node n1 = null;
        if(index == 0){
            head = n.next;
        }
        else{
        for(int i=0;i<index-1;i++){
            n = n.next;
        }
        n1 = n.next;
        n.next = n1.next;
    }
    } 
    public void insertAtStart(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;
        node.next=head;
        head = node;
    }

    public void insertAtIndex(int value,int index){
        Node node = new Node();
        node.data=value;
        node.next= null;
        if (index == 0)
        insertAtStart(value);
        else{
        Node n =head;
        for(int i=0;i<index-1;i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }
    }
}
