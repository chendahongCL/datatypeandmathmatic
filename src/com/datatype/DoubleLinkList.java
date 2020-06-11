package com.datatype;

/**
 * 链表之双向链表
 * 
 * @author cdh
 *
 */
public class DoubleLinkList {
	// 链表头部节点
	private Node firstNode;
	// 链表的尾部节点
	private Node lastNode;

	// 从头部插入元素
	public void insertFirst(long data) {
		Node node = new Node(data);
		if (isEmpty()) {
			firstNode = node;
			lastNode = node;
		} else {
			node.next = firstNode;
			firstNode.previous = node;
			firstNode = node;
		}
	}

	// 从尾部插入元素
	public void insertLast(long data) {
		Node node = new Node(data);
		if (isEmpty()) {
			firstNode = node;
			lastNode = node;
		} else {
			lastNode.next = node;
			node.previous = lastNode;
			lastNode = node;
		}
	}

	// 删除头部元素
	public Node deleteFirst() {
		if (!isEmpty()) {
			Node tmp = firstNode;
			if(firstNode.next != null) {
				firstNode.next.previous = null;
			}
			firstNode = firstNode.next;
			return tmp;
		}
		return null;
	}
	
	//删除尾部元素
	public Node deleteLast() {
		if (!isEmpty()) {
			Node tmp = lastNode;
			if(lastNode.previous!=null) {
				lastNode.previous.next = null;
			}else {
				firstNode = null;
			}
			
			
			lastNode = lastNode.previous;
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

	// 判断是否为null
	public boolean isEmpty() {
		return firstNode == null;
	}

	// 根据节点删除数据
	public Node deleteNode(long data) {
		Node currentNode = firstNode;
		while (currentNode.data != data) {
			if (currentNode.next == null) {
				return null;
			}
			currentNode = currentNode.next;
		}
		if (currentNode != null) {
			if (currentNode == firstNode) {
				firstNode.next.previous = null;
				firstNode = firstNode.next;
			}else {
				currentNode.previous.next = null;
			}
		}
		return currentNode;
	}
	
	public static void main(String[] args) {
		DoubleLinkList doubleLinkList = new DoubleLinkList();
		doubleLinkList.insertFirst(2);
		doubleLinkList.insertFirst(4);
		doubleLinkList.insertFirst(6);
		doubleLinkList.insertLast(1);
		doubleLinkList.insertLast(3);
		doubleLinkList.insertLast(5);
		//doubleLinkList.display();
		//System.out.println();
		//doubleLinkList.deleteFirst();
		//doubleLinkList.deleteLast();
		//doubleLinkList.deleteNode(6);
		//doubleLinkList.deleteNode(5);
		//doubleLinkList.display();
		while(!doubleLinkList.isEmpty()) {
			doubleLinkList.deleteFirst();
			doubleLinkList.display();
			System.out.println();
			System.out.println("这是release分支---");
			System.out.println("------");
			System.out.println("这是dev分支---");
			System.out.println("bbbbbbbbbbbbbbb");
			
		}
	}
}
