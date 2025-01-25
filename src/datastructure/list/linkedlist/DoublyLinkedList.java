package datastructure.list.linkedlist;

public class DoublyLinkedList {

    private class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    private Node head, tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
    }

    public int countNodes(){
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public Node get(int index){
        Node curr = head;
        int currIndex = 0;
        while(currIndex < index){
            curr = curr.next;
            currIndex++;
        }
        return curr;
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        System.out.println(linkedList.countNodes()); //0
        linkedList.addNode(20);
        linkedList.addNode(10);
        linkedList.addNode(30);
        System.out.println(linkedList.countNodes()); //3
        Node node = linkedList.get(1);
        System.out.println(node.data); //10
        System.out.println(node.prev.data); //20
        System.out.println(node.next.data); //30
    }
}
