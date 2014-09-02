package graph;

import java.util.List;

public interface Vertex {
	public Object getContent();
	public List<Vertex> getNeighbours();
}