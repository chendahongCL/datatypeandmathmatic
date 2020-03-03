package com.datatype;
/**
 * 数据类型之有序数组
 * @author cdh
 *
 */
public class MyOrderArray {
	//默认数组
    private long[] longArray;
    //数组中的元素个数
    private int elementSize;
    
    public MyOrderArray() {
    	longArray = new long[50];
    }
    
    public MyOrderArray(int size) {
    	longArray = new long[size];
    }
    
    /**
     * 插入方法
     */
    public void insert(long data) {
    	int i;
    	for(i=0;i<elementSize;i++) {
    		if(longArray[i]>data) {break;}
    		
    	}
    	for(int j = elementSize;j>i;j--) {
    		longArray[j]=longArray[j-1];
    	}
    	longArray[i]=data;
    	elementSize++;
    }
    /*/
     * 打印数组
     */
    public void display() {
    	System.out.print("[");
    	for(int i = 0;i<elementSize;i++) {
    		System.out.print(longArray[i]+" ");
    	}
    	System.out.print(" "+"]");
    }
    /**
     * 
     *查找某个元素在数组中的下标
     */
    public int search(long value) {
    	int i;
    	for(i=0;i<elementSize;i++) {
    		if(longArray[i]==value) {
    			break;
    		}
    	}
    	if(i==elementSize) {
    		return -1;
    	}
    	return i;
    }
    /**
     * 
     * 根据下标查询下标对应的元素
     */
    public long get(int index) {
    	if(index>=elementSize || index<0) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	return longArray[index];
    }
    /**
     * 
     * 删除数据
     */
    public void delete(int index) {
    	if(index>=elementSize || index<0) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	for(int i=index;i<elementSize;i++) {
    		longArray[i] = longArray[i+1];
    	}
    	elementSize--;
    }
    /**
     * 
     * 更新数据
     */
    public void update(int index,long value) {
    	if(index>=elementSize || index<0) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	longArray[index] = value;
    }
    /**
     * 
     * 二分查找算法,返回元素对应下标
     */
    public int binarySearch(long value) {
    	int middle;
    	int low=0;
    	int high = elementSize;
    	while(true) {
    		middle = (low+high)/2;
    		if(longArray[middle] == value) {
    			return middle;
    		}
    		if(low>high) {
    			return -1;
    		}
    		if(longArray[middle]>value) {
    			high=middle--;
    		}
    		if(longArray[middle]<value) {
    			low=middle++;
    		}
    	}
    }
    public static void main(String[] args) {
		MyOrderArray myOrderArray = new MyOrderArray(10);
		myOrderArray.insert(1);
		myOrderArray.insert(9);
		myOrderArray.insert(100);
		myOrderArray.insert(6);
		myOrderArray.insert(7);
		myOrderArray.insert(6);
		//myArray.update(2, 4);
		//myArray.delete(2);
		myOrderArray.display();
		System.out.println(myOrderArray.binarySearch(100));
		//System.out.println(myArray.search(5));
		//System.out.println(myArray.get(0));
	}
}
