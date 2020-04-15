package javaprep;

/**
 * Created by pmukkamala on 5/31/18.
 */
public class LinkedList {


    Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;

        if(head==null) {
            head = node;
        } else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = node;
        }

    }
    public void show(){

        Node node = head;

        while(node.next!= null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);

    }

    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);

        list.show();

    }
}
