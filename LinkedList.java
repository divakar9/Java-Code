import java.util.*;

public class LinkedList {
	private static class Node { 
		int v;
		Node next;
		public Node(int v, Node n) { this.v = v; next = n; }
	}
	private Node head;
	public LinkedList() {
		head = null;
	}
  
	public void addStart(int v) {
		head = new Node(v, head);
	}
  
	public void removeEnd() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			return;
		}
    
		Node p, q;
		for (p = head, q = p.next; q.next != null; p = q, q = q.next)
			;
		p.next = null;
	}
	public void removeStart() {
		head = head.next;
	}
  
	public String toString() {
		StringBuilder b = new StringBuilder();
		for (Node p = head; p != null; p = p.next)
			b.append(p.v).append(' ');
		return b.toString();
	}
	public static void main(String[]args) {
		LinkedList a = new LinkedList();
		for (int i = 10; i > 0; i--)
			a.addStart(i);
		System.out.println(a);
	}
}
