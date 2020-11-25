package com.datatype;
/**
 * 
 * @author cdh
 * 栈数据结构
 *
 */
public class MyStack {
    private long[] arr;
    //栈顶对应下标
    private int top;
    //默认构造方法
    public MyStack() {
    	arr = new long[10];
    	top = -1;
    }
    //带参构造
    public MyStack(int size) {
    	arr = new long[size];
    	top = -1;
    }
    //插入元素
    public void push(long data) {
    	arr[++top] = data;
    }
    //获取栈顶元素并弹出
    public long pop() {
    	return arr[top--];
    }
    //查看栈顶元素
    public long peek() {
    	return arr[top];
    }
    //判断栈是否为空
    public boolean isEmpty() {
    	return top==-1;
    }
    //判断栈是否满
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
