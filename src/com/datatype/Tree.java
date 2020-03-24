package com.datatype;

import java.util.Hashtable;
import java.util.TreeMap;

/**
 * 
 * @author cdh 二叉树
 */
public class Tree {
	// 二叉树的根节点
	public TreeNode root;

	// 插入节点
	public void insert(long data, String sData) {
		TreeNode newNode = new TreeNode(data, sData);
		// 当前节点的引用,从根节点开始
		TreeNode currentNode = root;
		// 当前节点的父节点引用
		TreeNode parentNode;
		// 如果root为null,说明当前二叉树是空,则新插入的节点即为根节点
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

	// 查找节点
	public TreeNode find(long data) {
		// 当前节点的引用
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

	// 前序遍历二叉树
	public void frontEach(TreeNode localNode) {
		if (localNode != null) {
			System.out.println(localNode.data + ", " + localNode.sData);
			frontEach(localNode.leftNode);
			frontEach(localNode.rightNode);
		}
	}

	// 中序遍历二叉树,此种方式遍历出来的数将从大到小排列
	public void inEach(TreeNode localNode) {
		if (localNode != null) {
			inEach(localNode.leftNode);
			System.out.println(localNode.data + ", " + localNode.sData);
			inEach(localNode.rightNode);
		}
	}

	// 后序遍历二叉树
	public void afterEach(TreeNode localNode) {
		if (localNode != null) {
			afterEach(localNode.leftNode);
			afterEach(localNode.rightNode);
			System.out.println(localNode.data + ", " + localNode.sData);
		}
	}

	// 删除二叉树节点
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
		// 删除没有子节点或者只有一个子节点的节点
		// 没有叶子节点
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
		// 要删除的节点只有一个叶子节点,并且是左子节点

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
			// 要删除的节点只有一个叶子节点,并且是右边子节点 
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

	// 获取比某个节点大但是最接近某节点的节点
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
		tree.insert(10, "柳岩");
		tree.insert(15, "杨幂1");
		tree.insert(20, "杨幂2");
		tree.insert(13, "杨幂1");
		tree.insert(7, "范冰冰");
		tree.insert(9, "球球");
		tree.insert(6, "球球");
		tree.insert(5, "球球");
		tree.insert(90, "任丽艳");
		/*
		 * tree.insert(52, "苍老师"); tree.insert(63, "魏天赋"); tree.insert(75, "李丽珍");
		 * tree.insert(92, "吉泽明步"); tree.insert(73, "安以轩"); tree.insert(76, "郑爽");
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
