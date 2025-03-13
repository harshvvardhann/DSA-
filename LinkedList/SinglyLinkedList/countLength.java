package LinkedList.SinglyLinkedList;

class countLength {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

