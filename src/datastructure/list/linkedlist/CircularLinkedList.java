package datastructure.list.linkedlist;

public class CircularLinkedList {
    private class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }
    private Node head = null, tail = null;

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
        tail.next = head;
        head.prev = tail;
    }

    public Node get(int index){
        int currIndex = 0 ;
        Node curr = head;
        while(currIndex < index){
            curr = curr.next;
            currIndex++;
        }
        return curr;
    }

    public int minValue(){
        Node curr = head;
        int min = curr.data;
        curr = curr.next;
        while(curr != null && curr != head){
            min = Math.min(min, curr.data);
            curr = curr.next;
        }
        return min;
    }

    public int maxValue(){
        Node curr = head;
        int max = curr.data;
        curr = curr.next;
        while(curr != null && curr != head){
            max = Math.max(max, curr.data);
            curr = curr.next;
        }
        return max;
    }

    public static void main(String[] args) {
        CircularLinkedList linkedList = new CircularLinkedList();
        linkedList.addNode(10);
        linkedList.addNode(5);
        linkedList.addNode(35);
        linkedList.addNode(-1);
        linkedList.addNode(22);
        System.out.println(isListCircular(linkedList.get(0)));
        System.out.println(linkedList.minValue()); //-1
        System.out.println(linkedList.maxValue()); //35
    }

    public static boolean isListCircular(Node node){
        Node slow = node;
        Node fast = node;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
