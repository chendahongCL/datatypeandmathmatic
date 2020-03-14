package com.datatype;

/**
 * 链表之双向链表
 * 
 * @author cdh
 *
 */
public class LastFirstLinkList {
	// 链表头部节点
	private Node firstNode;
	//链表的尾部节点
	private Node lastNode;
	// 从头部插入元素
	public void insertFirst(long data) {
		Node node = new Node(data);
		if (isEmpty()) {
			firstNode = node;
			lastNode = node;
		} else {
			node.next = firstNode;
			firstNode = node;
		}
	}
	
	//从尾部插入元素
	public void insertLast(long data) {
		Node node = new Node(data);
		if (isEmpty()) {
			firstNode = node;
			lastNode = node;
		} else {
			lastNode.next = node;
			lastNode = node;
		}
	}

	// 删除头部元素
	public Node deleteFirst() {
		if(!isEmpty()) {
			Node tmp = firstNode;
			firstNode = tmp.next;
			return tmp;
		}
		return null;
	}
	

	public void display() {
		Node currentNode = firstNode;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	// 查找节点
	public Node find(long data) {
		Node curentNode = firstNode;
		while (curentNode.data != data) {
			if (curentNode.next == null) {
				return null;
			}
			curentNode = curentNode.next;
		}
		return curentNode;
	}
	
	//判断是否为null
	public boolean isEmpty() {
		return firstNode ==null;
	}

	// 根据节点删除数据
	public Node deleteNode(long data) {
		Node currentNode = firstNode;
		Node previousNode = firstNode;
		while (currentNode.data != data) {
			if (currentNode.next == null) {
				return null;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode != null) {
			if (currentNode == firstNode) {
				firstNode = firstNode.next;
			}
			previousNode.next = currentNode.next;
		}
		return currentNode;
	}
	
	public static void main(String[] args) {
		LastFirstLinkList lastFirstLinkList = new LastFirstLinkList();
		lastFirstLinkList.insertFirst(2);
		lastFirstLinkList.insertFirst(4);
		lastFirstLinkList.insertFirst(6);
		lastFirstLinkList.insertLast(1);
		lastFirstLinkList.insertLast(3);
		lastFirstLinkList.insertLast(5);
		lastFirstLinkList.display();
		System.out.println();
		lastFirstLinkList.deleteFirst();
		lastFirstLinkList.deleteFirst();
		lastFirstLinkList.display();
		
	}

}
