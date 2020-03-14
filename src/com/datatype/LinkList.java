package com.datatype;

/**
 * 数据结构之单向向链表
 * 
 * @author cdh
 *
 */
public class LinkList {
	// 链表头部节点
	private Node firstNode;

	// 从头部插入元素
	public void insertFirst(long data) {
		Node node = new Node(data);
		if (firstNode == null) {
			firstNode = node;
		} else {
			node.next = firstNode;
			firstNode = node;
		}
	}

	// 删除头部元素
	public Node deleteFirst() {
		Node tmp = firstNode;
		firstNode = tmp.next;
		return tmp;

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
	
	//删除节点
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
		if(currentNode != null) {
			if(currentNode == firstNode) {
				firstNode = firstNode.next;
			}
			previousNode.next = currentNode.next;
		}
		return currentNode;
	}

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.insertFirst(3);
		linkList.insertFirst(7);
		linkList.insertFirst(9);
		linkList.insertFirst(100);
		linkList.insertFirst(0);
		 // linkList.display();
		//System.out.println();
        //linkList.deleteFirst();
        //linkList.deleteFirst();
        //linkList.display();
		//Node node = linkList.find(7);
		Node node = linkList.deleteNode(1);
		System.out.println(node);
		linkList.display();
		

	}
}
