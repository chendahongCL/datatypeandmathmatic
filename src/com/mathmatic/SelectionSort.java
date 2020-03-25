package com.mathmatic;
/**
 * 
 * @author cdh
 *选择排序
 */
public class SelectionSort {
    public static void sort(long[] arr) {
    	int k = 0;
    	long temp;
    	for(int i=0;i<arr.length;i++) {
    		k = i;
    		for(int j = i+1;j<arr.length;j++) {
				
				  if(k==arr.length-1) 
					  break;
				 
    			if(arr[j]<arr[k]) {
    				k=j;
    			}
    		}
    		temp=arr[k];
    		arr[k]=arr[i];
     		arr[i]=temp; 
		}
	}
    
    public static void main(String[] args) {
    	long[] arr = {1,6,8,3,-5,89,-3};
		SelectionSort.sort(arr);
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
}
