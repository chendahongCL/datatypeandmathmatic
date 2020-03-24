package com.mathmatic;
/**
 * 
 * @author cdh
 * 快速排序算法 
 * 快速排序由C. A. R. Hoare在1962年提出。它的基本思想是：
 * 选择序列中的某个数作为基准值
 * 通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中左边的数据都比基准值小,右边的数据都比基准值大
 * 然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 *
 */
public class QuikSort {
	
	/**
	 * 获取一趟排序后的基准值所在索引
	 * @param dataArr 需要排序的数组
	 * @param start  数组的起始下标
	 * @param end 数组的结束下标
	 * @return  每一轮排序后的基准值所在的索引
	 */
    public static int getBasicIndex(int[] dataArr,int start, int end) {
    	int base = dataArr[start];
    	while(start < end) {
    		while(start < end && dataArr[end] >= base) {
    			end--;
    		}
    		if(start < end) {
    			int temp = dataArr[start];
        		dataArr[start] = dataArr[end];
        		dataArr[end] = temp;
        		start++;
    		}
    		
    		while(start < end && dataArr[start] <= base) {
    			start ++;
    		}
    		if(start < end) {
    			int temp = dataArr[end];
        		dataArr[end] = dataArr[start];
        		dataArr[start] = temp;
        		end--;
    		}
    		
    		
    	}
    	return start;
    }
    
    public static void sort(int[] dataArr,int start, int end) {
    	if(start > end) {
    		return;
    	}else {
    		int basicIndex = getBasicIndex(dataArr, start, end);
    		sort(dataArr,start,basicIndex-1);
    		sort(dataArr, basicIndex+1, end);
    	}
    }
    
    public static void main(String[] args) {
		int[] dataArr = {2,4,1,9,100,45,34,2,92,-8};
		QuikSort.sort(dataArr, 0,dataArr.length-1);
		for(int i = 0;i < dataArr.length; i++) {
			System.out.print(dataArr[i]+" ");
		}
		
	}
}
