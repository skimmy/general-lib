package graph;

import java.util.List;

public class SimpleVertex implements Vertex {
	
	private Object content;

	@Override
	public Object getContent() {
		return this.content;
	}

	@Override
	public List<Vertex> getNeighbours() {
		// TODO Auto-generated method stub
		return null;
	}
	
}