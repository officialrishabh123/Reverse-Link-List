class Node{
    int data;
    Node next;
}
public class MyClass {
    Node head;
    
    void insert(int data)
    {
        Node n=new Node();
        n.data=data;
        n.next=null;
        if(head==null)
        {
            head=n;
        }
        else{
            Node h=head;
            while(h.next!=null)
            {
                h=h.next;
            }
            h.next=n;
            
            
        }
    }
    void reverseLinkList(){
        //Node h=head;
        Node pre=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=pre;
             pre=curr;
            curr=next;
        }
        head=pre;
    }
    void print(){
        Node h=head;
        while(h.next!=null)
        {
            System.out.println(h.data);
            h=h.next;
        }
        System.out.println(h.data);
    }
    public static void main(String args[]) {
        MyClass ll= new MyClass();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.print();
        System.out.println("---------------------------------");
        ll.reverseLinkList();
        ll.print();

    }
}
