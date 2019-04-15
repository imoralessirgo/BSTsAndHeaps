import java.util.LinkedList;

class DataBT implements IBinTree {
	int data;
	IBinTree left;
	IBinTree right;

	DataBT(int data, IBinTree left, IBinTree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// an alternate constructor for when both subtrees are empty
	DataBT(int data) {
		this.data = data;
		this.left = new MtBT();
		this.right = new MtBT();
	}

	// determines whether this node or node in subtree has given element
	public boolean hasElt(int e) {
		return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
	}

	// adds 1 to the number of nodes in the left and right subtrees
	public int size() {
		return 1 + this.left.size() + this.right.size();
	}

	// adds 1 to the height of the taller subtree
	public int height() {
		return 1 + Math.max(this.left.height(), this.right.height());
	}
	
	// returns data value
	public int getData() {
		return this.data;
	}
	
	// determines if given binary tree is a valid heap
	public boolean isMinHeap() {
		
		boolean validChild1 = true;
		boolean validChild2 = true;
		boolean leftHeap = true;
		boolean rightHeap = true;
		
		if(this.left.size() != 0) {
			validChild1 = this.data <= this.left.getData();
			leftHeap = this.left.isMinHeap();
		}
		if(this.right.size() != 0) {
			validChild2 = this.data <= this.right.getData();
			rightHeap = this.right.isMinHeap();
		}
		
		return validChild1 && validChild2 && leftHeap && rightHeap;
	}
	
	// flattens out the BT into a list
	public LinkedList<Integer> parseToList(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(this.data);
		for(int dataLeft : this.left.parseToList()) {
			list.add(dataLeft);
		}
		for(int dataRight : this.right.parseToList()) {
			list.add(dataRight);
		}
		return list;
	}
}