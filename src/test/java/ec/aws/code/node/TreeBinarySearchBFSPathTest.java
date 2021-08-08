package ec.aws.code.node;

import org.junit.jupiter.api.Test;

import ec.aws.code.node.TreeBinarySearchBFSPath.BinaryTree;
import ec.aws.code.node.TreeBinarySearchBFSPath.NodeLinked;

public class TreeBinarySearchBFSPathTest {
	TreeBinarySearchBFSPath treeBinarySearch = new TreeBinarySearchBFSPath();
	@Test
	public void test1() {
		BinaryTree binaryRigth = treeBinarySearch.new BinaryTree(3,null,null);
		BinaryTree binaryLeft = treeBinarySearch.new BinaryTree(2,null,null);
		BinaryTree binary = treeBinarySearch.new BinaryTree(1,binaryLeft,binaryRigth);
		NodeLinked nodeResult = treeBinarySearch.search(binary,3);		
		NodeLinked nodeLinked = nodeResult;
		while(!nodeLinked.isLastNode) {			
			System.out.print(nodeLinked.node.id);
			nodeLinked = nodeLinked.next;					
		}		
		System.out.println("Path");
		BinaryTree binaryPath =nodeResult.node; 
		while(binaryPath!=null) {
			System.out.print(binaryPath.id);
			binaryPath = binaryPath.root;
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
		NodeLinked nodeResult = treeBinarySearch.search(binary,5);		
		NodeLinked nodeLinked = nodeResult;
		while(!nodeLinked.isLastNode) {			
			System.out.print(nodeLinked.node.id);
			nodeLinked = nodeLinked.next;					
		}		
		System.out.println("Path");
		BinaryTree binaryPath =nodeResult.node; 
		while(binaryPath!=null) {
			System.out.print(binaryPath.id);
			binaryPath = binaryPath.root;
		}	
	}
	
	@Test
	public void test3() {		
		BinaryTree binaryRigth7 = treeBinarySearch.new BinaryTree(7,null,null);
		BinaryTree binaryLeft6 = treeBinarySearch.new BinaryTree(6,null,null);		
		BinaryTree binaryRigth5 = treeBinarySearch.new BinaryTree(5,null,null);
		BinaryTree binaryLeft4 = treeBinarySearch.new BinaryTree(4,null,null);		
		BinaryTree binaryRigth3 = treeBinarySearch.new BinaryTree(3,binaryLeft6,binaryRigth7);
		BinaryTree binaryLeft2 = treeBinarySearch.new BinaryTree(2,binaryLeft4,binaryRigth5);
		BinaryTree binary = treeBinarySearch.new BinaryTree(1,binaryLeft2,binaryRigth3);		
		NodeLinked nodeResult = treeBinarySearch.search(binary,10);		
		NodeLinked nodeLinked = nodeResult;
		while(!nodeLinked.isLastNode) {			
			System.out.print(nodeLinked.node.id);
			nodeLinked = nodeLinked.next;					
		}		
		System.out.println("Path");
		BinaryTree binaryPath =nodeResult.node; 
		while(binaryPath!=null) {
			System.out.print(binaryPath.id);
			binaryPath = binaryPath.root;
		}	
	}
	
}
