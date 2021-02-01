package dev.tobycook.datastructures;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedList {
  Node head;

  public LinkedList() {
    this.head = null;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.head = new Node(0);

    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);

    list.head.next = node1;
    node1.next = node2;
    node2.next = node3;

    list.display();
  }
}
