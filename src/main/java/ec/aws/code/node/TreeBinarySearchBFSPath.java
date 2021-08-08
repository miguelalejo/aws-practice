package ec.aws.code.node;

import java.util.Queue;
import java.util.LinkedList;

public class TreeBinarySearchBFSPath {

	public NodeLinked search(BinaryTree binaryTree, int val) {
		Queue<BinaryTree> oppendeNodes = new LinkedList<>();
		BinaryTree node = null;
		NodeLinked nodeLinked = null;
		NodeLinked firstNodeLinked = null;
		oppendeNodes.add(binaryTree);
		while (!oppendeNodes.isEmpty()) {
			node = oppendeNodes.poll();
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
				nodeLinked.isLastNode = true;
				nodeLinked.next = firstNodeLinked;
				return nodeLinked;
			}
			if (node.left != null) {
				node.left.root = node;
				oppendeNodes.add(node.left);
			}
			if (node.right != null) {
				node.right.root = node;
				oppendeNodes.add(node.right);
			}
		}
		nodeLinked.isLastNode = true;
		nodeLinked.next = firstNodeLinked;
		return firstNodeLinked;

	}

	class NodeLinked {
		boolean isLastNode;
		BinaryTree node;
		NodeLinked next;
	}
	
	class NoderesultTO {
		NodeLinked nodeLinked;
		BinaryTree node;
	}

	class BinaryTree {
		int id;
		BinaryTree left;
		BinaryTree right;
		BinaryTree root;
		public BinaryTree(int id, BinaryTree left, BinaryTree right) {
			super();
			this.id = id;
			this.left = left;
			this.right = right;
		}
		
		
	}

}
