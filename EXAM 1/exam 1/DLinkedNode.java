
/**

 * Do not modify this class. 
 * @author Celia Chen
 * This class contains:
 * 		toString()
 */
public class DLinkedNode {

	int value;
	DLinkedNode prev;
	DLinkedNode next;
	
	public DLinkedNode(int value) {
		this.value = value;
	}
	
	public DLinkedNode (int value, DLinkedNode prev, DLinkedNode next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	
	public String toString() {
		return this.value+"";
	}
}
