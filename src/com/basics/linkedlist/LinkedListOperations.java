package com.basics.linkedlist;

public class LinkedListOperations {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList()
    {
        if(head == null)
            System.out.println("LinkedList is Empty");
        Node temp = head;
        System.out.print(head.data+"->");
        while(temp.next != null)
        {
            temp = temp.next;
            System.out.print(temp.data+"->");
        }
        System.out.println("null");
    }

    public void addAtIndex(int data, int index)
    {
        Node newNode = new Node(data);
        if(head == null && index == 0)
        {
            addFirst(data);
            size++;
            return;
        }
        if(head == null && index > 0)
        {
            System.out.println("Adding Node in the given index is not possible as The LinkedList is Empty");
            return;
        }

        Node temp = head;
        int i = 0;
        while(i < index-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LinkedList is Empty");
            return -1;
        }
        if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LinkedList is Empty");
            return -1;
        }
        if(size == 1)
        {
            int val = head.data;
            size--;
            return val;
        }

        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        int val = temp.next.data;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int iterativeSearch(int key)
    {
        Node temp = head;
        int i = 0;
        while(temp!=null)
        {
            if(temp.data == key) {
                System.out.println("Key found at index = "+(i+1));
                return i;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("Key Not Found in the LinkedList");
        return -1;
    }

    public static void main(String[] args) {
        LinkedListOperations ll = new LinkedListOperations();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addAtIndex(50,2);
        ll.printLinkedList();
        ll.removeFirst();
        ll.printLinkedList();
        ll.removeLast();
        ll.printLinkedList();
        ll.addLast(35);
        ll.addLast(45);
        ll.printLinkedList();
        ll.iterativeSearch(45);
        ll.printLinkedList();
        System.out.println("Size of LinkedList = "+size);
    }
}
