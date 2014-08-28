import Vertex as vertex

if __name__ == "__main__":
    va = vertex.Vertex("A")
    va.addNeighbour(vertex.Vertex("B"))
    print(va)
