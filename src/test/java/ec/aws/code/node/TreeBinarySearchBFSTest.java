package ec.aws.code.node;

import org.junit.jupiter.api.Test;
import ec.aws.code.node.TreeBinarySearchBFS.NodeLinked;
import ec.aws.code.node.TreeBinarySearchBFS.BinaryTree;
public class TreeBinarySearchBFSTest {
	TreeBinarySearchBFS treeBinarySearch = new TreeBinarySearchBFS();
	@Test
	public void test1() {
		BinaryTree binaryRigth = treeBinarySearch.new BinaryTree(3,null,null);
		BinaryTree binaryLeft = treeBinarySearch.new BinaryTree(2,null,null);
		BinaryTree binary = treeBinarySearch.new BinaryTree(1,binaryLeft,binaryRigth);
		binary.id = 1;		
		NodeLinked nodeLinked = treeBinarySearch.searchNodeListBFS(binary);
		int i=0;
		NodeLinked node = nodeLinked;
		while(i<10) {			
			System.out.print(node.id);
			node = node.next;
			i++;
			
		}		
	}
	
	@Test
	public void test2() {
		
		BinaryTree binaryRigth7 = treeBinarySearch.new BinaryTree(7,null,null);
		BinaryTree binaryLeft6 = treeBinarySearch.new BinaryTree(6,null,null);		
		BinaryTree binaryRigth5 = treeBinarySearch.new BinaryTree(5,null,null);
		BinaryTree binaryLeft4 = treeBinarySearch.new BinaryTree(4,null,null);		
		BinaryTree binaryRigth3 = treeBinarySearch.new BinaryTree(3,binaryLeft6,binaryRigth7);
		BinaryTree binaryLeft2 = treeBinarySearch.new BinaryTree(2,binaryLeft4,binaryRigth5);
		BinaryTree binary = treeBinarySearch.new BinaryTree(1,binaryLeft2,binaryRigth3);
		binary.id = 1;		
		NodeLinked nodeLinked = treeBinarySearch.searchNodeListBFS(binary);
		int i=0;
		NodeLinked node = nodeLinked;
		while(i<10) {			
			System.out.print(node.id);
			node = node.next;
			i++;
			
		}		
	}
	
}
