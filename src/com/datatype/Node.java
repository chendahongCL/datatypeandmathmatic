package com.datatype;
/**
 * ���ݽṹ֮����ڵ�
 * @author cdh
 *
 */
public class Node {
	// �ڵ�����
	public long data;
	// �ڵ�ָ����
	public Node next;
	
	public Node(long data) {
		this.data = data; 
		this.next = null;
	}
	
	public void display() {
		System.out.println(data);
	}
}
