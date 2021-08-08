package ec.aws.code.node;

import java.util.Queue;
import java.util.LinkedList;

public class TreeBinarySearchBFS {
	public NodeLinked searchNodeListBFS(BinaryTree binary) {
		Queue<BinaryTree> openedNodes = new LinkedList<>();
		NodeLinked firstNodeLinked = null;
		NodeLinked nodeLinked = null;
		BinaryTree node = null;
		openedNodes.add(binary);		
		while(!openedNodes.isEmpty()) {
			node = openedNodes.poll();
			if(nodeLinked==null) {
				nodeLinked = new NodeLinked(node.id);
				firstNodeLinked = nodeLinked;
			}else {
				NodeLinked nextNode = new NodeLinked(node.id);
				nodeLinked.next = nextNode;
				nodeLinked = nextNode;				
			}			
			if(node.left!=null) {
				openedNodes.add(node.left);
			}
			if(node.rigth!=null) {
				openedNodes.add(node.rigth);
			}
		}		
		nodeLinked.next = firstNodeLinked;		
		return firstNodeLinked;
		
	} 
	
	class NodeLinked{
		int id;
		NodeLinked next;
		public NodeLinked(int id) {
			this.id = id;
		}
		
		public NodeLinked(int id, NodeLinked node) {
			this.id = id;
			this.next = node;
		}
		
	}

	class BinaryTree{
		int id;
		BinaryTree left;
		BinaryTree rigth;
		public BinaryTree(int id) {
			super();
			this.id = id;		
			
		}	
		public BinaryTree(int id, BinaryTree left, BinaryTree rigth) {
			super();
			this.id = id;
			this.left = left;
			this.rigth = rigth;
		}	
		
		
	}
}
