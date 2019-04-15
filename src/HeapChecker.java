import java.util.LinkedList;

// Class contains tester methods for heaps
public class HeapChecker {
	
	// tests the addElt method
	  boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
		  
		  LinkedList<Integer> tempList = hOrig.parseToList();
		  tempList.add(elt);
		  boolean containsAll = containsSameElements(tempList, hAdded.parseToList());		  
		  
		  return containsAll && hAdded.isMinHeap();
		   
		  }
	  
	  // test the remMinElt method
	  boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
		  int holdMin = hOrig.getData();
		  LinkedList<Integer> tempList = hOrig.parseToList();
		  tempList.removeFirstOccurrence(holdMin);
		  if (tempList.size() == 0 && hRemoved.size() == 0) {return true;} // returns tue since the heap was emptied
		  boolean correctSize = tempList.size() == hRemoved.parseToList().size();
		  boolean containsAll = containsSameElements(tempList, hRemoved.parseToList());
		  
		  return containsAll && correctSize && hRemoved.isMinHeap();
	  }

	  // Checks if a list contains every element in a second list
	  boolean containsSameElements(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		  boolean temp = true;
		  int i = 0;
		  if (list1.size() == list2.size()) {
			  while (i < list2.size() && temp) {
				  temp = list1.contains(list2.get(i));
				  i++;
			  }
			  return temp;
		  }else
			  return false;
	  }
}
