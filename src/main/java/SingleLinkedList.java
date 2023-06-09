public class SingleLinkedList {


    /*STEP 1: SET PTR = HEAD
STEP 2: IF PTR = NULL
   WRITE "EMPTY LIST"
  GOTO STEP 7
  END OF IF

STEP 4: REPEAT STEP 5 AND 6 UNTIL PTR != NULL
STEP 5: PRINT PTR→ DATA
STEP 6: PTR = PTR → NEXT
[END OF LOOP]

STEP 7: EXIT*/
    class  Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next= null;
        }
    }
Node head= null;
    Node tail= null;

public  void  addNode(int data){
    Node newNode = new Node (data);
    if(head == null){
       head=newNode;
       tail=newNode;
    }
    else {
        tail.next=newNode;
        tail =newNode;
    }
}

    public void  display(){
    Node currnt= head;
    if(head ==null){
        System.out.println ("List is Empty");
    }
    while (currnt!= null){
        System.out.print (currnt.data + " ");
      currnt= currnt.next;
    }
    System.out.println ();
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList ();
        list.addNode (10);
        list.addNode (20);
        list.addNode (30);
        list.addNode (40);
        list.display ();
    }
}
