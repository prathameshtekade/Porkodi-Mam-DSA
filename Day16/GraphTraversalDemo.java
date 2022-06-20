package Graphs;

import java.util.*;

public class GraphTraversalDemo {
	
	public static List<Integer> bfs(int[][] graph, int V, int sourceVertex){
		
		List<Integer>  visited = new ArrayList<>();
		ArrayDeque<Integer>  adjQueue = new ArrayDeque<>();
		
		adjQueue.addLast(sourceVertex);
		
		while(visited.size() < V && adjQueue.isEmpty() == false) {
			int vertex = adjQueue.removeFirst();
			visited.add(vertex);
			for(int i =0; i<V; i++) {
				if(graph[vertex][i] != 0 && adjQueue.contains(i) == false && visited.contains(i) == false) {
					//there is a edge between vertex and i
					adjQueue.addLast(i);
				}
			}
		}
		
		
		
		return visited;
	}
	
	
	public static void main(String[] args) {
		
		int graph[][] = {
				{0,1,1,1,0,0},
				{1,0,0,0,1,0},
				{1,0,0,1,1,0},
				{1,0,1,0,0,1},
				{0,1,1,0,0,0},
				{0,0,0,1,0,0}
		};
		
		int V = 6;
		int sourceVertex = 0;
		
		System.out.println("Breadth first Search....");
		List<Integer> bfsVisited = bfs(graph, V, sourceVertex);
		for (Integer vertex : bfsVisited ) {
			System.out.println(vertex);
		}
		
		
	}

}
