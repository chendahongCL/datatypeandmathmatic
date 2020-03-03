package com.datatype;
/**
 * 数据类型之数组
 * @author cdh
 *
 */
public class MyArray {
	//默认数组
    private long[] longArray;
    //数组中的元素个数
    private int elementSize;
    
    public MyArray() {
    	longArray = new long[50];
    }
    
    public MyArray(int size) {
    	longArray = new long[size];
    }
    
    /**
     * 插入方法
     */
    public void insert(long data) {
    	longArray[elementSize] = data;
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
    public static void main(String[] args) {
		MyArray myArray = new MyArray(10);
		myArray.insert(1);
		myArray.insert(2);
		myArray.insert(3);
		myArray.update(2, 4);
		//myArray.delete(2);
		myArray.display();
		myArray.display();
		System.out.print("aaa");
		//System.out.println(myArray.search(5));
		//System.out.println(myArray.get(0));
	}
}
