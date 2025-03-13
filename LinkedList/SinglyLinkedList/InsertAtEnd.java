package LinkedList.SinglyLinkedList;
class InsertAtEnd {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
         if (head == null) {
            return newNode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
        return head;
    }
}

