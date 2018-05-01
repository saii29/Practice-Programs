package javatut.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray8 {

	static int size;
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		size = a.length;
		ArrayList<Integer> al = new ArrayList(Arrays.asList(new Integer[size]));
		System.out.println(al);
		int[] b = new int[size];
		
		Arrays.stream(a).forEach(x->{
			al.set(size-1,x);
			b[size-1]=x;
			size--;
		});
		for(int el:b){
			System.out.print(el);			
		}
		System.out.println();
		System.out.println(al);
		
		
		
		
		
	}
}
