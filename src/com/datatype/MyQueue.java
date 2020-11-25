/*
package com.datatype;
*/
/**
 * 
 * @author cdh
 * 队列
 *
 *//*

public class MyQueue {
	//底层使用数组实现
    private long[] arr;
    //元素的有效个数
    private int elements;
    //队列的队首下标
    private int front;
    //队列的队尾下标
    private int end;
    
    //默认构造方法
    public MyQueue() {
    	arr = new long[10];
    	end = -1;
    }
    
    //带参构造
    public MyQueue(int size) {
    	arr = new long[size];
    	end = -1;
    }
    
    //插入元素
    public void insert(long data) {
    	arr[++end] = data;
    	elements++; 	
    }
    
    //移除数据
    public long remove() {
    	elements--;
    	return arr[front++];
    }
    
    //查看数据
    public long peek() {
    	return arr[front];
    }
    
    //判断队列是否满了
    public boolean isFull() {
    	return elements==arr.length;
    }
    
    //判断队列是否为空
    public boolean isEmpty() {
    	return elements == 0;
    }
    
    public static void main(String[] args) {
		MyQueue mq = new MyQueue(4);
		mq.insert(4);
		mq.insert(8);
		mq.insert(3);
		mq.insert(90);
		
		//System.out.println(mq.isEmpty());
		//System.out.println(mq.isFull());
		//System.out.println(mq.peek());
		//System.out.println(mq.peek());
		while(!mq.isEmpty()) {
			System.out.println(mq.remove());
		}
		mq.insert(110);
	}
}
*/
