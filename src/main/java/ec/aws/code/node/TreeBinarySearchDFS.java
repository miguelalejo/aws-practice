package ec.aws.code.node;

import java.util.Stack;
public class TreeBinarySearchDFS {
	
	public NodeLinked searchDFS(BinaryTree binary) {
		Stack<BinaryTree> stack = new Stack<>();
		stack.push(binary);
		BinaryTree node = null;
		NodeLinked nodeLinked = null;
		NodeLinked firstNodeLinked = null;
		while(!stack.isEmpty()) {
			node = stack.pop();
			if(nodeLinked==null) {
				nodeLinked = new NodeLinked();
				nodeLinked.id = node.id;
				firstNodeLinked = nodeLinked;
			}else {
				NodeLinked nodeLinkedNext = new NodeLinked();
				nodeLinkedNext.id = node.id;
				nodeLinked.next = nodeLinkedNext;
				nodeLinked = nodeLinkedNext;
			}
			if(node.rigth!=null) {
				stack.push(node.rigth);
			}
			if(node.left!=null) {
				stack.push(node.left);
			}			
		}
		nodeLinked.next = firstNodeLinked;
		return firstNodeLinked;		
	}
	
	class NodeLinked{
		int id;
		NodeLinked next;
	}
	class BinaryTree{
		int id;
		BinaryTree left;
		BinaryTree rigth;
		public BinaryTree(int id, BinaryTree left, BinaryTree rigth) {
			super();
			this.id = id;
			this.left = left;
			this.rigth = rigth;
		}
		
	}

}
