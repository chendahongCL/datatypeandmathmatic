package com.datatype;
/**
 * 数据结构之链表节点
 * @author cdh
 *
 */
public class Node {
	// 节点数据
	public long data;
	// 节点指针域
	public Node next;
	
	public Node(long data) {
		this.data = data; 
		this.next = null;
	}
	
	public void display() {
		System.out.println(data);
	}
}
