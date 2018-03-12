package javatut.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SyncList implements Runnable{
	
	static List<String> fruitList = new ArrayList<>();
	List<String> ll = new LinkedList<>();

	public static void main(String args[]) {
		
		Thread t1 = new Thread(new SyncList());
		Thread t2 = new Thread(new SyncList());
		

		// Synchronizing ArrayList in Java
		fruitList = Collections.synchronizedList(fruitList);
		
		t1.start();
		t2.start();
		
		/*fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Pineapple");*/


		// we must use synchronize block to avoid non-deterministic behavior
		try {
			System.out.println(Thread.currentThread().toString());
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (fruitList) {
			Iterator<String> itr = fruitList.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		System.out.println(t1.toString() +" " + t2.toString());
		System.out.println(t1.isAlive() +" " + t2.isAlive());
	}

	@Override
	public void run() {
		fruitList.add("from run method 1" + Thread.currentThread());
		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fruitList.add("from run method 2" + Thread.currentThread());
	}

}
