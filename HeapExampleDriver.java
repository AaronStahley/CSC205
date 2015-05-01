import Project9.LinkedHeap;


public class HeapExampleDriver {
	public static void main(String[] args) {

		LinkedHeap<Integer> t = new LinkedHeap<Integer>();
		
		t.addElement(5);
		System.out.println("Heap: " + t);
		t.addElement(2);
		System.out.println("Heap: " + t);
//		t.addElement(3);
//		System.out.println("Heap: " + t);
		t.addElement(9);
		System.out.println("Heap: " + t);
		t.addElement(7);
		System.out.println("Heap: " + t);
		t.addElement(6);
		System.out.println("Heap: " + t);
		t.addElement(10);
		System.out.println("Heap: " + t);
		t.addElement(4);
		System.out.println("Heap: " + t);
		t.addElement(1);
		
		
		System.out.println("Heap: " + t);
		System.out.println(" Min: " + t.findMin());
		
		Integer k = t.removeMin();
		System.out.println(" Min: " + t.findMin() + 
				" after removing " + k);
		
		k = t.removeMin();
		System.out.println(" Min: " + t.findMin() + 
				" after removing " + k);
		
		k = t.removeMin();
		System.out.println(" Min: " + t.findMin() + 
				" after removing " + k);
		
		k = t.removeMin();
		System.out.println(" Min: " + t.findMin() + 
				" after removing " + k);
		
		k = t.removeMin();
		System.out.println(" Min: " + t.findMin() + 
				" after removing " + k);
		
		k = t.removeMin();
		System.out.println(" Min: " + t.findMin() + 
				" after removing " + k);
		
		System.out.println("Heap: " + t);
	}
}
