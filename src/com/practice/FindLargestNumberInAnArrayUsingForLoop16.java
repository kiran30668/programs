package com.practice;

public class FindLargestNumberInAnArrayUsingForLoop16 {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 596, 354, 2, 9 };
		
		int maxNumber=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNumber) {
				maxNumber=arr[i];
			}
		}
		System.out.println("The Largestr Number is: "+maxNumber);
	}

}
