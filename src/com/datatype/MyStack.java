package com.datatype;
/**
 * 
 * @author cdh
 * 栈数据结构
 *
 */
public class MyStack {
    private long[] arr;
    private int top;
    public MyStack() {
    	arr = new long[10];
    	top = -1;
    }
    public MyStack(int size) {
    	arr = new long[size];
    	top = -1;
    }
    
    public void push(long data) {
    	arr[++top] = data;
    }
    
    public long pop() {
    	return arr[top--];
    }
    
    public long peek() {
    	return arr[top];
    }
    
    public boolean isEmpty() {
    	return top==-1;
    }
    
    public boolean isFull() {
    	return top == arr.length -1;
    }
    
    public static void main(String[] args) {
		MyStack myStack = new MyStack(4);
		myStack.push(1);
		myStack.push(5);
		myStack.push(7);
		myStack.push(2);
		
		//System.out.println(myStack.isEmpty());
		//System.out.println(myStack.isFull());
		//System.out.println(myStack.peek());
		//System.out.println(myStack.peek());
		while(myStack.top != -1) {
			System.out.print(myStack.pop()+" ");
		}
	}
    
}
