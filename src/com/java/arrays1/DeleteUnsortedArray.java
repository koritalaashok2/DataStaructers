package com.java.arrays1;

public class DeleteUnsortedArray {
	public static void main(String[] args) {
		int arry[] = { 12, 54, 7, 89, 13 };
		int n = arry.length;
		int key = 89;
		int position= findArrayforSearch(arry,n,key);
		System.out.println("Position is ----"+position);

	}

	private static int findArrayforSearch(int[] arry, int n, int key) {
		
		for(int i=0;i<n;i++) {
			if(arry[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
