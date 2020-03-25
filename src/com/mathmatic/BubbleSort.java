package com.mathmatic;
/**
 * 冒泡排序算法
 * @author cdh
 *
 */
public class BubbleSort {
    public static void sort(long[] arr) {
    	long temp = 0l;
    	for(int i = 0;i<arr.length-1;i++) {
    		for(int j = arr.length - 1;j>i;j--) {
    			if(arr[j]<arr[j-1]) {
    				temp = arr[j];
    				arr[j]=arr[j-1];
    				arr[j-1] = temp;
    			}
    		}
    	}
    }
    
    public static void main(String[] args) {
		long[] arr = {1,6,8,3,-5,99,-7,23};
		BubbleSort.sort(arr);
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
}
