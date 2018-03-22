package shujujiegou;


import javax.xml.soap.Node;

/**
 * Created by panyi on 2018/3/20.
 */
public class MyLinkedList {
    class Node{
        Node next=null;
        int data;
        public Node(int data){this.data=data;}
    }
    Node head=null;
    public void addNode(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
    }
    public boolean deleteNode(int index){
        if(index<1||index>length()){
            return false;
        }
        if(index==1){
            head=head.next;
            return true;
        }
        int i=1;
        Node preNode=head;
        Node curNode=preNode.next;
        while(curNode!=null){
            if(i==index){
                preNode.next=curNode.next;
                return true;
            }
            preNode=curNode;
            curNode=curNode.next;
            i++;
        }
        return true;
    }
    public void printList(){
        Node tmp=head;
        while (tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }
public int length(){
    int length=0;
    Node tmp=head;
    while(tmp!=null){
        length++;
        tmp=tmp.next;
    }
    return length;
}

    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addNode(1);
        myLinkedList.addNode(5);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(3);
        myLinkedList.addNode(6);
        System.out.println("list.length="+myLinkedList.length());
        myLinkedList.printList();
    }
}

