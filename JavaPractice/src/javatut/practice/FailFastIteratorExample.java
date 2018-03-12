package javatut.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorExample implements Runnable {

	// Creating an ArrayList of integers

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		// Adding elements to list

		list.add(1452);

		list.add(6854);

		list.add(8741);

		list.add(6542);

		list.add(3845);

		// Getting an Iterator from list

		Iterator<Integer> it = list.iterator();


		Thread t1 = new Thread(new FailFastIteratorExample());
		Thread t2 = new Thread(new FailFastIteratorExample());
		
		
//		FailFastIteratorExample tt = new FailFastIteratorExample();
//		tt.run();
		
//		FailFastIteratorExample tt1 = new FailFastIteratorExample();
//		tt1.run();

		t1.start();
		t2.start();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println("value::" + integer + "  -- "+ Thread.currentThread());

			// list.add(8457); //This will throw ConcurrentModificationException
		}

		System.out.println("DD");

	}

	@Override
	public void run() {
		
		System.out.println("from run method 1" + Thread.currentThread());
//		list.add(1);
		
		
//		##########No errors we access the iterator from another iterator
		try {
			Iterator<Integer> it = list.iterator();

			while (it.hasNext()) {
				Integer integer = (Integer) it.next();
				Thread.currentThread().sleep(5000);

			}
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		list.add(2);
		System.out.println("from run method 2" + Thread.currentThread());
	}

}