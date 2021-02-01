package dev.tobycook.datastructures;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  @Override
  public String toString() {
    return "Node{" +
        "data=" + data +
        '}';
  }
}

public class LinkedList {
  Node head;

  public LinkedList() {
    this.head = null;
  }

  /**
   * Add new node to beginning of list.
   * O(1) complexity.
   * @param data the data
   */
  public void insert(int data) {
    Node node = new Node(data);
    node.next = head;
    head = node;
  }

  /**
   * Insert node after a given node.
   * O(1) complexity.
   * @param prev the previous node
   * @param data the data
   */
  public void insertAfter(Node prev, int data) {
    if (prev == null) {
      System.out.println("Previous node cannot be null!");
      return;
    }

    Node node = new Node(data);
    node.next = prev.next;
    prev.next = node;
  }

  /**
   * Append data to end of the list.
   * O(n) complexity.
   * @param data the data
   */
  public void append(int data) {
    Node node = new Node(data);

    if (head == null) {
      head = new Node(data);
      return;
    }

    Node last = head;
    while (last.next != null) {
      last = last.next;
    }

    last.next = node;
  }

  /**
   * Find the node by the data.
   * O(n) complexity.
   * @param data the data
   * @return the found node
   */
  public Node search(int data) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == data) {
        return temp;
      }
      temp = temp.next;
    }
    return null;
  }

  /**
   * Display the whole linked list.
   */
  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.head = new Node(9);
    list.insert(8);
    list.insert(7);

    list.display();

    list.append(10);

    list.display();

    Node searched = list.search(9);

    System.out.println(searched);
  }
}
