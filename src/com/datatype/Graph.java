package com.datatype;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeMap;

/**
 * 图
 * 
 * @author cdh
 *
 */
public class Graph {
	// 节点数组
	private Vertex[] vertexList;
	// 数组的容量
	private int maxSize = 20;
	// 邻接矩阵
	private int[][] adjMat;
	// 当前节点
	private int nVertex;

	public Graph() {
		vertexList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		nVertex = 0;
		for (int i = 0; i < maxSize; i++) {
			for (int j = 0; j < maxSize; j++) {
				adjMat[i][j] = 0;
			}
		}
	}

	// 添加节点
	public void addVertex(char label) {
		vertexList[nVertex++] = new Vertex(label);
	}

	// 添加边
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	//深度优先搜索
	public void dfs() {
		MyStack stack = new MyStack();
		display(0);
		vertexList[0].wasVisited = true;
		stack.push(0);
		while(!stack.isEmpty()){
			int v = getadjWasVisited((int)stack.peek());
			if(v != -1) {
				stack.push(v);
				display(v);
				vertexList[v].wasVisited = true;
			}else {
				stack.pop();
			}
		}
		for(int j = 0;j < nVertex;j++) {
			vertexList[j].wasVisited = false;
		}
		
	}
	
	//广度优先搜索
	public void wfs() {
		
	}
	
	//显示方法
	public void display(int v) {
		System.out.println(vertexList[v].label);
	}
	
	//查找当前节点的未被访问过的邻接节点所在数组下标
    public int getadjWasVisited(int v) {
    	for(int i = 0;i < nVertex;i++) {
    		if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
    			return i;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {

		Graph graph = new Graph();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.dfs();

	}
}
