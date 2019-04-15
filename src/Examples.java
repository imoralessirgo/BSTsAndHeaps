import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {
		
	HeapChecker HC = new HeapChecker();
	
	DataHeap myHeap1 = new DataHeap(0);
	DataHeap myHeap2 = new DataHeap(3,new DataHeap(5),new DataHeap(6) );
	DataHeap myHeap3 = (DataHeap) myHeap2.addElt(2);
	DataHeap myHeap4 = (DataHeap) myHeap3.addElt(9);
	DataHeap myHeap5 = (DataHeap) myHeap1.addElt(7);
	
	
	
	  @Test
	  public void testAddLargerNum(){
	    assertTrue(HC.addEltTester(myHeap3,9,myHeap4));
	  }
	  @Test
	  public void testAddSmallerNum(){
	    assertTrue(HC.addEltTester(myHeap2,2,myHeap3));
	  }
	  @Test
	  public void testNoChildNode(){
	    assertTrue(HC.addEltTester(myHeap1,7,myHeap1.addElt(7)));
	  }
	  @Test
	  public void testAddExistingValue(){
	    assertTrue(HC.addEltTester(myHeap2,5,myHeap2.addElt(5)));
	  }
	  @Test
	  public void testRemoveNodeWithChildren(){
	    assertTrue(HC.remMinEltTester(myHeap2,myHeap2.remMinElt()));
	  }
	  @Test
	  public void testRemoveNodeWithNoChildren(){
	    assertTrue(HC.remMinEltTester(myHeap1,myHeap1.remMinElt()));
	  }
}
