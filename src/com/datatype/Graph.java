/*
package com.datatype;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeMap;

*/
/**
 * 图
 * 
 * @author cdh
 *
 *//*

public class Graph {
	// 锟节碉拷锟斤拷锟斤拷
	private Vertex[] vertexList;
	// 锟斤拷锟斤拷锟斤拷锟斤拷锟�
	private int maxSize = 20;
	// 锟节接撅拷锟斤拷
	private int[][] adjMat;
	// 锟斤拷前锟节碉拷
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

	// 锟斤拷咏诘锟�
	public void addVertex(char label) {
		vertexList[nVertex++] = new Vertex(label);
	}

	// 锟斤拷颖锟�
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
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
	
	//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
	public void wfs() {
		MyQueue queue = new MyQueue();
		display(0);
		vertexList[0].wasVisited = true;
		queue.insert(0);
        int adjIndex = -1;
		while(!queue.isEmpty()) {
			int peek = (int)queue.peek();
			while((adjIndex = getadjWasVisited(peek)) != -1) {
				vertexList[adjIndex].wasVisited = true;
				queue.insert(adjIndex);
				display(adjIndex);
			}
			queue.remove();
		}
		for(int j = 0;j < nVertex;j++) {
			vertexList[j].wasVisited = false;
		}
	}
	
	//锟斤拷示锟斤拷锟斤拷
	public void display(int v) {
		System.out.println(vertexList[v].label);
	}
	
	//锟斤拷锟揭碉拷前锟节碉拷锟轿达拷锟斤拷锟斤拷使锟斤拷锟斤拷诮咏诘锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷卤锟�
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
		graph.addVertex('F');
		graph.addVertex('G');
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		//graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(4, 5);
		graph.addEdge(2, 1);
		graph.wfs();
		System.out.println("我想把这个提交上去！！！！！！");

	}
}
*/
