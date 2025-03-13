package LinkedList.DoublyLinkedList;

class InsertAtPosition {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        int count = 0;//0 - based indexing
        Node temp = head;
        Node newNode = new Node(x);
        while(temp!=null){
            if(count == p){
                if(temp.next == null){
                    temp.next = newNode;
                    newNode.prev = temp;
                    newNode.next = null;
                }else{
                    newNode.next = temp.next;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                    newNode.prev = temp;
                }
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}