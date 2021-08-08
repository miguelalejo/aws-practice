package ec.aws.code.node;
import java.util.Stack;
public class TreeBinarySearchDFSPath {

	public NodeLinked search(BinaryTree binary, int val) {
		Stack<BinaryTree> opennedNodes = new Stack<>();
		opennedNodes.push(binary);
		BinaryTree node = null;
		NodeLinked nodeLinked = null;
		NodeLinked firstNodeLinked = null;
		while(!opennedNodes.isEmpty()) {
			node = opennedNodes.pop();
			if(nodeLinked==null) {
				nodeLinked = new NodeLinked();
				nodeLinked.node = node;
				firstNodeLinked = nodeLinked;
			}else {
				NodeLinked nextNodeLinked = new NodeLinked();
				nextNodeLinked.node = node;
				nodeLinked.next = nextNodeLinked;
				nodeLinked = nextNodeLinked;
			}
			if(node.id == val) {
				nodeLinked.next = firstNodeLinked;
				nodeLinked.isLastNode = true;
				return nodeLinked;
			}
			
			if(node.right!=null) {
				node.right.root = node;
				opennedNodes.push(node.right);				
			}
			if(node.left!=null) {
				node.left.root = node;
				opennedNodes.push(node.left);
			}
		}
		nodeLinked.next = firstNodeLinked;
		nodeLinked.isLastNode = true;
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
