package com.datatype;
/**
 * ���ݽṹ֮����ڵ�
 * @author cdh
 *
 */
public class Node {
	// �ڵ�����
	public long data;
	// �ڵ���һ���ڵ�ָ����
	public Node next;
	//�ڵ���һ���ڵ�ָ����
	public Node previous;
	
	public Node(long data) {
		this.data = data; 
		this.next = null;
	}
	
	public void display() {
		System.out.println(data);
	}
}
