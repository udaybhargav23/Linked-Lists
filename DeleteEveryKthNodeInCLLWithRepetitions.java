/*

 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static Node deleteK(Node head, int k){
//Enter your code here
    print(head);
    Node prev = null;
    Node temp = head;
    int j = k;
    while (j>0 && temp.hashCode()!=temp.next.hashCode()){  
        prev = temp; 
        temp = temp.next;
        j--;
        if (j==0){
            if (head.hashCode()==temp.hashCode()){
                head = temp.next;
            }
            prev.next = temp.next;
            temp = head;
            print(temp);
            temp = prev;
            j=k;
        }
    }
    return head;
}
static void print(Node head){
    Node temp = head;
    long hc = temp.hashCode();
    System.out.print(temp.data+"->");
    temp = temp.next;
    while (temp.hashCode()!=hc){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println(temp.data);
}
