package com.datatype;
/**
 * 
 * @author cdh
 * 二叉树节点
 *
 */
public class TreeNode {
    public long data;
    public String sData;
    //节点的左子节点
    public TreeNode leftNode;
    //节点的右子节点
    public TreeNode rightNode;
    
    //构造方法
    public TreeNode(long data,String sData) {
    	this.data = data;
    	this.sData = sData;
    }
}
