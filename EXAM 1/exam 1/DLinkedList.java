/**
 * Do not modify this class. 
 * @author Celia Chen
 * This class contains:
 * 		isEmpty()
 * 		insert(int value)
 * 		size()
 * 		contains(int value)
 * 		toString()
 */

public class DLinkedList {

	DLinkedNode head;
	DLinkedNode tail;
	
	public DLinkedList() {
		
	}
	
	// This method returns true if this DLinkedList is empty.
	public boolean isEmpty() {
		return head==null;
	}
	
	// This method inserts the value to the end of this DLinkedList.
	
	public void insert (int value) {
		DLinkedNode newNode  = new DLinkedNode(value);

		if (head == null) {
			this.head = newNode;
		}
		else {
			
			DLinkedNode current = this.head;
			while (current.next !=  null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
			
		}
		this.tail = newNode;
	}
	
	// This method provides a String representation of this DLinkedList.
	
	public String toString() {
		if (this.head == null) {
			return "";
		}
		String str = "Head to tail: ";
		
		DLinkedNode current = this.head;
		while (current.next != null) {
			str += current.value + " => ";
			current = current.next;
		}
		str += current.value + "\n Tail to head: ";
		current = this.tail;
		while (current.prev  != null) {
			str += current.value + " <= ";
			current = current.prev;
		}
		str += current.value + "\n";
		return str;
	}
	
	// This method returns the size of this DLinkedList.
	public int size() {
		int count = 0;
		DLinkedNode current = this.head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	// This method return true if this DLinkedList contains the value. False otherwise.
	
	public boolean contains(int value) {
		if (this.head == null) {
			return false;
		}
		else {
			DLinkedNode current = this.head;
			while (current!= null) {
				if (current.value == value) {
					return true;
				}
				current = current.next;
			}
			return false;
		}
	}
}
