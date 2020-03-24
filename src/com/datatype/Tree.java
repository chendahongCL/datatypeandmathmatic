package com.datatype;

import java.util.Hashtable;
import java.util.TreeMap;

/**
 * 
 * @author cdh ������
 */
public class Tree {
	// �������ĸ��ڵ�
	public TreeNode root;

	// ����ڵ�
	public void insert(long data, String sData) {
		TreeNode newNode = new TreeNode(data, sData);
		// ��ǰ�ڵ������,�Ӹ��ڵ㿪ʼ
		TreeNode currentNode = root;
		// ��ǰ�ڵ�ĸ��ڵ�����
		TreeNode parentNode;
		// ���rootΪnull,˵����ǰ�������ǿ�,���²���Ľڵ㼴Ϊ���ڵ�
		if (root == null) {
			root = newNode;
			return;
		} else {
			while (true) {
				parentNode = currentNode;
				if (data < currentNode.data) {
					currentNode = currentNode.leftNode;
					if (currentNode == null) {
						parentNode.leftNode = newNode;
						return;
					}
				} else {
					currentNode = currentNode.rightNode;
					if (currentNode == null) {
						parentNode.rightNode = newNode;
						return;
					}
				}
			}
		}

	}

	// ���ҽڵ�
	public TreeNode find(long data) {
		// ��ǰ�ڵ������
		TreeNode currentNode = root;
		while (currentNode.data != data) {
			if (data < currentNode.data) {
				currentNode = currentNode.leftNode;
			} else {
				currentNode = currentNode.rightNode;
			}
			if (currentNode == null) {
				return null;
			}
		}
		return currentNode;
	}

	// ǰ�����������
	public void frontEach(TreeNode localNode) {
		if (localNode != null) {
			System.out.println(localNode.data + ", " + localNode.sData);
			frontEach(localNode.leftNode);
			frontEach(localNode.rightNode);
		}
	}

	// �������������,���ַ�ʽ���������������Ӵ�С����
	public void inEach(TreeNode localNode) {
		if (localNode != null) {
			inEach(localNode.leftNode);
			System.out.println(localNode.data + ", " + localNode.sData);
			inEach(localNode.rightNode);
		}
	}

	// �������������
	public void afterEach(TreeNode localNode) {
		if (localNode != null) {
			afterEach(localNode.leftNode);
			afterEach(localNode.rightNode);
			System.out.println(localNode.data + ", " + localNode.sData);
		}
	}

	// ɾ���������ڵ�
	public boolean delete(long data) {
		TreeNode currentNode = root;
		TreeNode parentNode = root;
		boolean isLeftNode = true;

		while (currentNode.data != data) {
			parentNode = currentNode;
			if (data < currentNode.data) {
				currentNode = currentNode.leftNode;
				isLeftNode = true;
			} else {
				currentNode = currentNode.rightNode;
				isLeftNode = false;
			}
			if (currentNode == null) {
				return false;
			}
		}
		// ɾ��û���ӽڵ����ֻ��һ���ӽڵ�Ľڵ�
		// û��Ҷ�ӽڵ�
		if (currentNode.leftNode == null && currentNode.rightNode == null) {
			if (currentNode == root) {
				root = null;
				return true;
			} else if (isLeftNode) {
				parentNode.leftNode = null;
				return true;
			} else {
				parentNode.rightNode = null;
				return true;
			}
		}
		// Ҫɾ���Ľڵ�ֻ��һ��Ҷ�ӽڵ�,���������ӽڵ�

		else if (currentNode.rightNode == null) {
			if (currentNode == root) {
				root = currentNode.leftNode;
				return true;
			} else if (isLeftNode) {
				parentNode.leftNode = currentNode.leftNode;
				return true;
			} else {
				parentNode.rightNode = currentNode.leftNode;
				return true;
			}
			}
			// Ҫɾ���Ľڵ�ֻ��һ��Ҷ�ӽڵ�,�������ұ��ӽڵ� 
			else if(currentNode.leftNode == null) {
			if (currentNode == root) {
				root = currentNode.rightNode;
				return true;
			} else if (isLeftNode) {
				parentNode.leftNode = currentNode.rightNode;
				return true;
			} else {
				parentNode.rightNode = currentNode.rightNode;
				return true;
			}
		} else {
			TreeNode successor = getSuccessor(currentNode);
			if (currentNode == root) {
				root = successor;
				return true;
			} else if (isLeftNode) {
				parentNode.leftNode = successor;
			} else {
				parentNode.rightNode = successor;
			}
			successor.leftNode = currentNode.leftNode;

		}

		return true;
	}

	// ��ȡ��ĳ���ڵ������ӽ�ĳ�ڵ�Ľڵ�
	public TreeNode getSuccessor(TreeNode delNode) {
		TreeNode successor = delNode;
		TreeNode successParent = delNode;
		TreeNode currentNode = delNode.rightNode;
		while (currentNode != null) {
			successParent = successor;
			successor = currentNode;
			currentNode = currentNode.leftNode;
		}
		if (successor != delNode.rightNode) {
			//successParent.leftNode = successor.rightNode;
			successor.rightNode = delNode.rightNode;
		}
		return successor;
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10, "����");
		tree.insert(15, "����1");
		tree.insert(20, "����2");
		tree.insert(13, "����1");
		tree.insert(7, "������");
		tree.insert(9, "����");
		tree.insert(6, "����");
		tree.insert(5, "����");
		tree.insert(90, "������");
		/*
		 * tree.insert(52, "����ʦ"); tree.insert(63, "κ�츳"); tree.insert(75, "������");
		 * tree.insert(92, "��������"); tree.insert(73, "������"); tree.insert(76, "֣ˬ");
		 * tree.delete(40);
		 */
		//tree.inEach(tree.root);
		tree.delete(13);
		tree.delete(6);
		tree.delete(90);
		//tree.delete(7);
		//tree.delete(15);
		//tree.delete(20);
		
		// tree.frontEach(tree.root);
		System.out.println("---------------------");
		tree.inEach(tree.root);
		// System.out.println("---------------------");
		// tree.afterEach(tree.root);
		// TreeNode treeNode = tree.find(1);
		// System.out.println(treeNode.data + ", " + treeNode.sData);
	}
}
