package com.assignment.snakeladder.path;

import java.util.ArrayList;

public class Vertex {

	private int id;
	private int distSource;
	private ArrayList<Integer> path = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDistSource() {
		return distSource;
	}
	public void setDistSource(int distSource) {
		this.distSource = distSource;
	}
	public ArrayList<Integer> getPath() {
		return path;
	}
	public void setPath(ArrayList<Integer> path) {
		this.path = path;
	}


	
}
