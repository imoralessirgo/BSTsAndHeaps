import java.util.LinkedList;

class MtBT implements IBinTree {
	MtBT(){}

	// returns false since empty tree has no elements
	public boolean hasElt(int e) {
		return false;
	}

	// returns 0 since empty tree has no elements
	public int size() {
		return 0;
	}

	// returns 0 since empty tree has no branches
	public int height() {
		return 0;
	}
	
	// returns 0 since it has no data
	public int getData() {
		return 0;
	}
	
	// returns true since it contains no data
	public boolean isMinHeap() {
		return true;
	}
	
	// returns an empty list since tree has no elements
	public LinkedList<Integer> parseToList(){
		return new LinkedList<Integer>();
	}
	
}