class Vertex:
    def __init__(self, key):
        self.id = key
        self.connectedTo = {}

    def addNeighbour(self, v):
        self.connectedTo[v.id] = v
        return self.connectedTo
        
    def __str__(self):
        neighbours = ""
        for v in self.connectedTo.keys():
            neighbours += v + " "
        return str(self.id) + " -- " + neighbours
