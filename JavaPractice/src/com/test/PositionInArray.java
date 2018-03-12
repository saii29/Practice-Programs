package com.test;

public class PositionInArray {
	
	int[] arr ; // assign given array
	int x =  arr[0];
	int[] arrSorted; //sorted array
	private int length;
	
	int position = binarySearch(arrSorted, arrSorted[0], arrSorted[length-1], x);
	
	int binarySearch(int arr[], int f, int l, int x)
    {
		if (l>=f)
        {
            int mid = f + (l - f)/2;
 
            if (arr[mid] == x)
               return mid;
 
            if (arr[mid] > x)
               return binarySearch(arr, f, mid-1, x);
 
            return binarySearch(arr, mid+1, l, x);
        }
 
        return -1;
}
}
