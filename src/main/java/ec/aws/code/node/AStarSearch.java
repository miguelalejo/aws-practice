package ec.aws.code.node;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class AStarSearch {

	public NodeLinked search(Node nodeRoot, String val) {
		Queue<Node> opennedNodes = new LinkedList<>();
		List<Node> visitedNodes = new ArrayList<>();
		NodeLinked nodeLinked = null;
		NodeLinked firstNodeLinked = null;
		opennedNodes.add(nodeRoot);
		Node node = null;
		while (!opennedNodes.isEmpty()) {
			node = opennedNodes.poll();
			visitedNodes.add(node);
			if (nodeLinked == null) {
				nodeLinked = new NodeLinked();
				nodeLinked.node = node;
				firstNodeLinked = nodeLinked;
			} else {
				NodeLinked nextNodeLinked = new NodeLinked();
				nextNodeLinked.node = node;
				nodeLinked.next = nextNodeLinked;
				nodeLinked = nextNodeLinked;
			}
			if (node.id == val) {
				nodeLinked.next = firstNodeLinked;
				nodeLinked.isLastNode = true;
				return nodeLinked;
			}
			for (Relation relation : node.children) {
				Node nodeChild = relation.node;
				if (!visitedNodes.contains(nodeChild)) {
					if (!opennedNodes.contains(nodeChild)) {
						nodeChild.root = node;
						nodeChild.gn = node.gn + relation.costo;
						opennedNodes.add(nodeChild);
					} else {
						Node nodeTemp = opennedNodes.stream().filter(r -> r.id == nodeChild.id).findAny().orElse(null);
						Node nodeRootTemp = nodeTemp.root;
						int costoAnterior = nodeTemp.gn;
						int costoNuevo = node.gn + relation.costo;
						if (costoNuevo < costoAnterior) {
							nodeChild.root = node;
							nodeChild.gn = costoNuevo;
							Queue<Node> opennedNodesTemp = new LinkedList<>();
							opennedNodes.stream().forEach(r -> {
								if (r.id == nodeChild.id) {
									opennedNodesTemp.add(nodeChild);
								} else {
									opennedNodesTemp.add(r);
								}
							});
							opennedNodes = opennedNodesTemp;
						} else {
							nodeChild.root = nodeRootTemp;
						}
					}
				}

			}

		}
		nodeLinked.next = firstNodeLinked;
		nodeLinked.isLastNode = true;
		return firstNodeLinked;

	}

	class NodeLinked {
		boolean isLastNode;
		Node node;
		NodeLinked next;
	}

	class Node {
		String id;
		Relation[] children;
		Node root;
		int gn;

		public Node(String id) {
			super();
			this.id = id;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		private AStarSearch getEnclosingInstance() {
			return AStarSearch.this;
		}

	}

	class Relation {
		Node node;
		int costo;

		public Relation(Node node, int costo) {
			super();
			this.node = node;
			this.costo = costo;
		}

	}

}
