package gg.core;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.jgrapht.Graph;

import gg.core.Parser.Edge;
import gg.core.Parser.Node;


public class GraphModel {
	
	private LinkedList<Integer> nodes;
	private LinkedList<EdgeJson> edges;
	private HashMap<Integer, String> nodeTypes;
	private String name;
	
	public GraphModel(Graph<Node, Edge> graph, String name) {
		
		nodes = new LinkedList<Integer>();
		edges = new LinkedList<GraphModel.EdgeJson>();
		nodeTypes = new HashMap<Integer, String>();
		HashMap<Node,Integer> mapNode = new HashMap<Node, Integer>();
		this.name = name;

		
		int i = 0;
		for (Node n : graph.vertexSet()) {
			nodes.add(i);
			nodeTypes.put(i, n.toString());
			mapNode.put(n, i);
			i = i + 1;
		}
		
		for (Node n : graph.vertexSet()) {
			for (Edge e : graph.edgesOf(n)) {
				if (!graph.getEdgeSource(e).equals(n))
					continue;
				EdgeJson e2j = new EdgeJson(mapNode.get(n), mapNode.get(graph.getEdgeTarget(e)), e.getLabel());
				edges.add(e2j);
			}
			
		}
	}
	
	public int numNodes() {
		return nodes.size();
	}
	
	
	
	
	
	public LinkedList<Integer> getNodes() {
		return nodes;
	}

	public void setNodes(LinkedList<Integer> nodes) {
		this.nodes = nodes;
	}

	public LinkedList<EdgeJson> getEdges() {
		return edges;
	}

	public void setEdges(LinkedList<EdgeJson> edges) {
		this.edges = edges;
	}

	public HashMap<Integer, String> getNodeTypes() {
		return nodeTypes;
	}

	public void setNodeTypes(HashMap<Integer, String> nodeTypes) {
		this.nodeTypes = nodeTypes;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





	public static class EdgeJson {
		private int source;
		private int target;
		private String name;
		
		public EdgeJson(int source, int target, String name) {
			super();
			this.source = source;
			this.target = target;
			this.name = name;
		}

		public int getSource() {
			return source;
		}

		public void setSource(int source) {
			this.source = source;
		}

		public int getTarget() {
			return target;
		}

		public void setTarget(int target) {
			this.target = target;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
