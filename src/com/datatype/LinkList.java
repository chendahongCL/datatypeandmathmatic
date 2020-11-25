/*
package com.datatype;

*/
/**
 * ���ݽṹ֮����������
 * 
 * @author cdh
 *
 *//*

public class LinkList {
	// ����ͷ���ڵ�
	private Node firstNode;

	// ��ͷ������Ԫ��
	public void insertFirst(long data) {
		Node node = new Node(data);
		if (firstNode == null) {
			firstNode = node;
		} else {
			node.next = firstNode;
			firstNode = node;
		}
	}

	// ɾ��ͷ��Ԫ��
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

	// ���ҽڵ�
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
	
	//ɾ���ڵ�
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
	
	//�ݹ�ʵ�ֵ�����ת
	public Node reverseNodeDiGui(Node head) {
		if(head ==null || head.next ==null) {
			return head;
		}
		Node newHead = reverseNodeDiGui(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	//�ǵݹ�ʵ������ת
	public Node reverseNodeFeiDiiGu(Node head) {
		Node currentNode = head;
		Node prexNode = null;
		Node nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prexNode;
			prexNode = currentNode;
			currentNode = nextNode;
			
		}
		return prexNode;
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
		//Node node = linkList.deleteNode(1);
		//System.out.println(node);
		linkList.display();
		System.out.println();
		Node firstNode = linkList.reverseNodeFeiDiiGu(linkList.firstNode);
		linkList.firstNode = firstNode;
		linkList.display();
		

	}
}
*/
