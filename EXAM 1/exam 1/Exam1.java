
/*
 * Zahir Choudhry
 */

public class Exam1 {

	/*
	 * Please include the runtime of your method here:
	 * O ( n ) Linear
	 */
	public static boolean hasTwoCommon(DLinkedList dl1, DLinkedList dl2) {
		int common = 0; // This will increment each time there is a common number
		if(dl1.isEmpty() || dl2.isEmpty() ){
			//System.out.println("h");
			return false;
		} else {
			DLinkedNode current = dl1.head;
			
			for(int i = 0; i < dl1.size(); i++){ // Runs for the length of the first list
				System.out.println(current.value);
				if(common == 2){
					return true;
				} else if (dl2.contains(current.value)){
					//System.out.println(common);
					common++;
					current = current.next;
				} else {
					current = current.next; // Will iterate down current
				}		
			}
		}
		return false;
	}
	
	/*
	 * Please include the runtime of your method here:
	 * O ( n ) Linear
	 */
	public static DLinkedList deleteMiddle(DLinkedList dl) {
		//System.out.println(dl.size());
		DLinkedNode current = dl.head; // Create a current node
		if(dl.size() % 2 == 0){ // If the size of the list is even
			for(int i = 0; i < dl.size()/2; i++){ // gets to second element in the middle
				current = current.next; // use loop to get to the desired node
			}
			System.out.println(current.value);
			current.prev.next = current.next;
			current.next.prev = current.prev;
			current.prev = null;
			current.next = null;
			return dl;

		} else { // If the length of the list is odd
			for(int i = 0; i < dl.size()/2; i++){ // gets to second element in the middle
				current = current.next; // use loop to get to the desired node
			}
			System.out.println(current.value);
			current.prev.next = current.next;
			current.next.prev = current.prev;
			current.prev = null;
			current.next = null;
			return dl;
		}
	}
	
	
	/*
	 * Please include the runtime of your method here:
	 * O ( n ) Linear
	 */
	public static DLinkedList moveToLast(DLinkedList dl, int n) { // WORKS
		DLinkedList temp = new DLinkedList();
		DLinkedNode current = dl.head;

		if (dl.isEmpty()){
			return dl;
		}

		for(int i = 0; i < n; i++){ // Loop to the desired point 'n'
			current = current.next;
		}

		while(current != null){ // Then, add all those numbers to the front of the other list
			temp.insert(current.value);
			System.out.println("Bob");
			current = current.next;
		}
		current = dl.head; // Reset the head of the list

		for(int i = 0; i < n; i++){ // Loop to 'n' again, this time adding Nodes to 'temp'
			temp.insert(current.value);
			current = current.next;
		}	
		dl = temp;
		return temp;
	}
	
	
		/*
	 * Please include the runtime of your method here:
	 * O ( n^2 ) Quadratic
	 */
	public static int[] nextGreaterNodes (DLinkedList list) {
		int [] nums = new int [list.size()]; // Creates array of list size
		DLinkedNode current = list.head;
		DLinkedNode current2 = current.next;

		if (list.isEmpty()){
			return nums;
		}

		for(int i = 0; i < list.size(); i++){
			int rep = current.value;
			if(current == list.tail){ // If at the last element
				nums[i] = 0;
			} else {
				while(rep > current2.value){ // Stops when it finds a value greater than current
					current2 = current2.next;
				}
				nums[i] = current2.value; // assign current2 to nums[i]
				current = current.next;
				current2 = current.next;
			}
		}

		/*for(int j = 0; j < list.size(); j++){
			//System.out.print(nums);
		} */
		return nums;
	}
	
	
	/*
	 * Extra Credit
	 */
	
	/*
	 * Please include the runtime of your method here:
	 * O ( ? )
	 */
	
	/*
	public static DLinkedList swapTwo (DLinkedList dl) {
		DLinkedNode current = dl.head;
		if(dl.size() % 2 == 0)
			while(current.next != null) {
				if(current = dl.head)
			}
		return dl;
	}
	*/
	
}

