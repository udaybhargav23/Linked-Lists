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
 public static Node ReverseAlternateK(Node head,int k){
//enter your code here
    int l = 0;
    Node temp = head;
    if (k==1){
        return head;
    }
    while (temp!=null){
        temp = temp.next;
        l++;
    }
    int i=1;
    int mini = (int)Math.ceil((double)l/(double)k);
    int j = 1;
    Node curr = head;
    Node temp2 = head;
    Node prev = null;
    Node next = curr.next;
    Node perm2 = head;
    Node temp3 = null;
    Node temp4 = null;
    while (i<k && perm2!=null){
        perm2 = perm2.next;
        i++;
    }
    head = perm2;
    while (j<=mini){
        i = 1;
        if (j%2==0){
            while (i<=k){
                curr = curr.next;
                if (curr.next==null){
                    i=k+1;
                }else if (i==k-1){
                    temp3 = curr;
                    i++;
                }else{
                    i++;
                }
            }
            j++;
        }else{
            temp2 = curr;
            while (i<=k && temp2!=null){
                if (temp2.next==null || i==k){
                    temp4 = temp2;
                }
                temp2 = temp2.next;
                i++;
            }
            i=1;
            while (i<=k && next!=null){
                if (temp3!=null){
                    temp3.next = temp4;
                    temp3 = null;
                }
                prev = curr;
                next = curr.next;
                curr.next = temp2;
                curr = next;
                temp2 = prev;
                i++;
            }
            j++;
        }
    }
    return head;
}
