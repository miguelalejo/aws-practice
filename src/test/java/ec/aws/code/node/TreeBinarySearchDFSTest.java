package ec.aws.code.node;

import org.junit.jupiter.api.Test;
import ec.aws.code.node.TreeBinarySearchDFS.BinaryTree;
import ec.aws.code.node.TreeBinarySearchDFS.NodeLinked;

public class TreeBinarySearchDFSTest {
	TreeBinarySearchDFS treeBinarySearch = new TreeBinarySearchDFS();
	@Test
	public void test1() {
		BinaryTree binaryRigth7 = treeBinarySearch.new BinaryTree(7,null,null);
		BinaryTree binaryLeft6 = treeBinarySearch.new BinaryTree(6,null,null);		
		BinaryTree binaryRigth5 = treeBinarySearch.new BinaryTree(5,null,null);
		BinaryTree binaryLeft3 = treeBinarySearch.new BinaryTree(3,null,null);		
		BinaryTree binaryRigth4 = treeBinarySearch.new BinaryTree(4,binaryLeft6,binaryRigth7);
		BinaryTree binaryLeft2 = treeBinarySearch.new BinaryTree(2,binaryLeft3,binaryRigth4);
		BinaryTree binary = treeBinarySearch.new BinaryTree(1,binaryLeft2,binaryRigth5);		
		NodeLinked nodeLinked=treeBinarySearch.searchDFS(binary);
		int i=0;
		NodeLinked node = nodeLinked;
		while(i<10) {
			System.out.print(node.id);
			node = node.next;
			i++;
			
		}
		

	}
}
