package com.test;

import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
		
		//get numbers 
		   Scanner in = new Scanner(System.in);
	        
	        String numString;
	        
	        numString = in.nextLine();
	        String[] numArray = numString.split(" ");
	        
	        int count = Integer.parseInt(numArray[0]);
	        
	        int[] nums = new int[count];
	        for(int i = 0; i < count; i++) {
	            nums[i] = Integer.parseInt(numArray[i]);
	        }
	        
	        int aSum = (nums[0] + nums[count - 1]) * (count + 1)/ 2;
	        
	        for(int i = 0; i < count; i++) {
	        	aSum -= nums[i];
	        }
	        
	        System.out.println(aSum);
	    
	}

}
