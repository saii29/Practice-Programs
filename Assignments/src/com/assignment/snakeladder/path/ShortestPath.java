package com.assignment.snakeladder.path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

	Queue<Vertex> q = new LinkedList<>();
	Vertex vertex = new Vertex();

	public ArrayList<Integer> findShortestPath(HashMap<Integer, Integer> snakeMap, HashMap<Integer, Integer> ladderMap,
			int n) {

		int visited[] = new int[n];
		vertex.setId(0);
		vertex.setDistSource(0);

		visited[0] = 1;
		q.add(vertex);

		// Using BFS
		while (!q.isEmpty()) {
			vertex = q.remove();
			int position = vertex.getId();
			System.out.println("vertex number::" + vertex.getDistSource() + " " + position + " " + vertex.getPath());
			// Break the loop after reaching end point
			if (position == n - 1)
				break;

			for (int i = position + 1; i <= (position + 6) && i < n; ++i) {

				// visit only once
				if (visited[i] == 0) {

					Vertex curVertex = new Vertex();
					curVertex.setDistSource(vertex.getDistSource() + 1);
					visited[i] = 1;

					if (snakeMap.containsKey(i)) {
						curVertex.setId(snakeMap.get(i));
					}
					if (ladderMap.containsKey(i)) {
						curVertex.setId(ladderMap.get(i));
					}

					else {
						curVertex.setId(i);
					}

					curVertex.getPath().add(i - position);
					curVertex.getPath().addAll(vertex.getPath());

					q.add(curVertex);
					System.out.println("curVertex:"+curVertex.getId());

				}
			}
		}

		return vertex.getPath();

	}
}
