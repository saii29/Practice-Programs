package javatut.practice;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		//sorting list of objects of Wrapper classes
		//sortTest();
		
		//containsTest();
		
		ensureCapacityTest();
        
	}

	private static void ensureCapacityTest() {
		StringBuffer buff1 = new StringBuffer("");

		System.out.println("Old Capacity of buff1 = " + buff1.capacity());
		buff1.ensureCapacity(20); 
		System.out.println("New Capacity of buff1 = " + buff1.capacity());
		
		StringBuffer buff3 = new StringBuffer("");

		System.out.println("Old Capacity of buff3 = " + buff3.capacity());
		buff3.ensureCapacity(2); 
		System.out.println("New Capacity of buff3 = " + buff3.capacity());

		StringBuffer buff2 = new StringBuffer("compilejksde");

		System.out.println("Old Capacity of buff2= " + buff2.capacity());
		buff2.ensureCapacity(75);
		System.out.println("New Capacity of buff2= " + buff2.capacity());
	}

	private static void containsTest() {
		List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add(null);
        strList.add(null);
        strList.add("E");
//        Collections.sort(strList);
        System.out.println("containsTest:"+strList.contains(null));
        
        
        List<Car> carList = new ArrayList<>();
        carList.add(null);
        carList.add(new Car(1,"a"));
        carList.add(new Car(2,"b"));
        Car car = new Car();
        carList.add(car);
        System.out.println("containsTest:"+carList.contains(car));
        
	}

	private static void sortTest() {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add(null);
        strList.add(null);
        strList.add("E");
//        Collections.sort(strList);
        Integer[] ii = new Integer[5];
//        String [] ss = new String[strList.toArray()]; 
        for(String str: strList) System.out.print(" "+str);
        System.out.println("");
		
	}
	
	

}
