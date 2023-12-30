package org.practice.problems;

public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public Node head = null;
    public Node tail = null;


    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    public void display() {
        //Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public void insert(int pos, int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Case 1: Insert at the beginning (pos == 0)
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            // If the list was empty, update the tail as well
            if (tail == null) {
                tail = newNode;
            }
            return;
        }

        // Case 2: Insert at a specific position
        Node current = head;
        int currentPosition = 0;

        // Traverse the list to find the node at position pos - 1
        while (current != null && currentPosition < pos - 1) {
            current = current.next;
            currentPosition++;
        }

        // Check if the position is valid
        if (current == null || currentPosition > pos - 1) {
            System.out.println("Invalid position. Node not inserted.");
            return;
        }

        // Insert the new node after the current node
        newNode.next = current.next;
        current.next = newNode;

        // If inserted at the end, update the tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void delete(int key) {
        // Case 1: If the list is empty
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // Case 2: If the node to be deleted is the head
        if (head.data == key) {
            head = head.next;
            // If the list becomes empty, update the tail as well
            if (head == null) {
                tail = null;
            }
            return;
        }

        // Case 3: If the node to be deleted is not the head
        Node current = head;
        Node previous = null;

        // Traverse the list to find the node with the key
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // Case 3.1: If the node with the key is not found
        if (current == null) {
            System.out.println("Node with key " + key + " not found. Nothing to delete.");
            return;
        }

        // Case 3.2: If the node with the key is found, delete it
        previous.next = current.next;

        // If the deleted node was the tail, update the tail
        if (current == tail) {
            tail = previous;
        }
    }


}
