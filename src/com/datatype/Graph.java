package com.datatype;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeMap;

/**
 * ͼ
 * 
 * @author cdh
 *
 */
public class Graph {
	// �ڵ�����
	private Vertex[] vertexList;
	// ���������
	private int maxSize = 20;
	// �ڽӾ���
	private int[][] adjMat;
	// ��ǰ�ڵ�
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

	// ��ӽڵ�
	public void addVertex(char label) {
		vertexList[nVertex++] = new Vertex(label);
	}

	// ��ӱ�
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	//�����������
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
	
	//�����������
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
	
	//��ʾ����
	public void display(int v) {
		System.out.println(vertexList[v].label);
	}
	
	//���ҵ�ǰ�ڵ��δ�����ʹ����ڽӽڵ����������±�
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

	}
}
