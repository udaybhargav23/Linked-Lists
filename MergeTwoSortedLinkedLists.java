/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){
//Enter your code here
    
    Node temp1;
    Node temp2;
    Node res;
    if (head1.val<=head2.val){
        temp1 = head1.next;
        temp2 = head2;
        res = head1;
    }else{
        temp1 = head1;
        temp2 = head2.next;
        res = head2;
    }
    Node temp3 = res;
    while (temp1!=null && temp2!=null){
        if (temp1.val<=temp2.val){
            temp3.next = temp1;
            temp3 = temp3.next;
            temp1 = temp1.next;
        }else{
            temp3.next = temp2;
            temp3 = temp3.next;
            temp2 = temp2.next;
        }
    }
    while (temp1!=null){
        temp3.next = temp1;
        temp3 = temp3.next;
        temp1 = temp1.next;
    }
    while (temp2!=null){
        temp3.next = temp2;
        temp3 = temp3.next;
        temp2 = temp2.next;
    }
    return res;
}
