package LinkedList.SinglyLinkedList;
class searchKey {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static boolean searchKe(int n, Node head, int key) {
        // Code here
        if(head.data == key) return true;
        Node temp = head;
        while(temp!=null){
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
}       