package com.datatype;

/**
 * ����֮˫������
 * 
 * @author cdh
 *
 */
public class LastFirstLinkList {
	// ����ͷ���ڵ�
	private Node firstNode;
	//�����β���ڵ�
	private Node lastNode;
	// ��ͷ������Ԫ��
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
	
	//��β������Ԫ��
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

	// ɾ��ͷ��Ԫ��
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
	
	//�ж��Ƿ�Ϊnull
	public boolean isEmpty() {
		return firstNode ==null;
	}

	// ���ݽڵ�ɾ������
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
