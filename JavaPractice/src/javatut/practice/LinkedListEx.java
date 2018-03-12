package javatut.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		LinkedList<String> l2 = new LinkedList<>();
		
		l2.offer("d");
		
		ll.add("a");
		ll.add("b");
		ll.add(1, "c");
		ll.add(1, "d");
		ll.getFirst();
		
		Iterator it = ll.iterator();
		
		while(it.hasNext()){
			System.out.println("" + it.next());
		}
		
	}
}
