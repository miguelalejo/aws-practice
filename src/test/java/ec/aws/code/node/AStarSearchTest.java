package ec.aws.code.node;

import org.junit.jupiter.api.Test;

import ec.aws.code.node.AStarSearch.Node;
import ec.aws.code.node.AStarSearch.NodeLinked;
import ec.aws.code.node.AStarSearch.Relation;

public class AStarSearchTest {
	AStarSearch aStarSearch = new AStarSearch();
	@Test
	public void test1() {
		Node nodeA = aStarSearch.new Node("A");
		Node nodeB = aStarSearch.new Node("B");
		Node nodeC = aStarSearch.new Node("C");
		Node nodeD = aStarSearch.new Node("D");
		Node nodeE = aStarSearch.new Node("E");
		Node nodeF = aStarSearch.new Node("F");
		Node nodeG = aStarSearch.new Node("G");
		Relation relA1 = aStarSearch.new Relation(nodeA,1);
		Relation relB1 = aStarSearch.new Relation(nodeB,1);
		Relation relC1 = aStarSearch.new Relation(nodeC,1);
		Relation relD1 = aStarSearch.new Relation(nodeD,1);
		Relation relE1 = aStarSearch.new Relation(nodeE,1);
		Relation relF1 = aStarSearch.new Relation(nodeF,1);
		Relation relG1 = aStarSearch.new Relation(nodeG,1);
		nodeA.children = new Relation[]{relB1,relC1,relE1};
		nodeB.children = new Relation[]{relA1,relG1,relD1};
		nodeC.children = new Relation[]{relA1,relB1,relD1};
		nodeE.children = new Relation[]{relF1};
		nodeF.children = new Relation[]{relG1};
		nodeG.children = new Relation[]{relB1,relD1,relF1};		
		NodeLinked nodeLinked = aStarSearch.search(nodeA, "B");
		NodeLinked nodeLinkedPath = nodeLinked.next;
		boolean isLatNode = false;
		while(!isLatNode) {
			System.out.print(nodeLinkedPath.node.id);
			isLatNode = nodeLinkedPath.isLastNode;
			nodeLinkedPath = nodeLinkedPath.next;			
		}
		
	}
	
	@Test
	public void test2() {
		Node nodeA = aStarSearch.new Node("A");
		Node nodeB = aStarSearch.new Node("B");
		Node nodeC = aStarSearch.new Node("C");
		Node nodeD = aStarSearch.new Node("D");
		Node nodeE = aStarSearch.new Node("E");
		Node nodeF = aStarSearch.new Node("F");
		Node nodeG = aStarSearch.new Node("G");
		Relation relA1 = aStarSearch.new Relation(nodeA,1);
		Relation relB1 = aStarSearch.new Relation(nodeB,1);
		Relation relC1 = aStarSearch.new Relation(nodeC,1);
		Relation relD1 = aStarSearch.new Relation(nodeD,1);
		Relation relE1 = aStarSearch.new Relation(nodeE,1);
		Relation relF1 = aStarSearch.new Relation(nodeF,1);
		Relation relG1 = aStarSearch.new Relation(nodeG,1);
		nodeA.children = new Relation[]{relB1,relC1,relE1};
		nodeB.children = new Relation[]{relA1,relG1,relD1};
		nodeC.children = new Relation[]{relA1,relB1,relD1};
		nodeD.children = new Relation[]{relB1,relC1};
		nodeE.children = new Relation[]{relA1,relF1};
		nodeG.children = new Relation[]{relB1,relF1};		
		NodeLinked nodeLinked = aStarSearch.search(nodeA, "G");
		NodeLinked nodeLinkedPath = nodeLinked.next;
		boolean isLatNode = false;
		while(!isLatNode) {
			System.out.print(nodeLinkedPath.node.id);
			isLatNode = nodeLinkedPath.isLastNode;
			nodeLinkedPath = nodeLinkedPath.next;			
		}
		System.out.println("Path");
		Node nodePath = nodeLinked.node;
		while(nodePath!=null) {
			System.out.print(nodePath.id);
			nodePath = nodePath.root;
		}
		
	}
	
	
	@Test
	public void test3() {
		Node nodeA = aStarSearch.new Node("A");
		Node nodeB = aStarSearch.new Node("B");
		Node nodeC = aStarSearch.new Node("C");
		Node nodeD = aStarSearch.new Node("D");
		Node nodeE = aStarSearch.new Node("E");
		Node nodeF = aStarSearch.new Node("F");
		Node nodeG = aStarSearch.new Node("G");
		Relation relA1 = aStarSearch.new Relation(nodeA,1);
		Relation relB1 = aStarSearch.new Relation(nodeB,1);
		Relation relC1 = aStarSearch.new Relation(nodeC,1);
		Relation relD1 = aStarSearch.new Relation(nodeD,1);
		Relation relE1 = aStarSearch.new Relation(nodeE,1);
		Relation relF1 = aStarSearch.new Relation(nodeF,1);
		Relation relG1 = aStarSearch.new Relation(nodeG,1);
		nodeA.children = new Relation[]{relB1,relE1};
		nodeB.children = new Relation[]{relA1,relC1};
		nodeC.children = new Relation[]{relB1,relD1,relF1};
		nodeD.children = new Relation[]{relF1,relC1,relG1};
		nodeE.children = new Relation[]{relA1,relF1};
		nodeF.children = new Relation[]{relC1,relD1,relG1,relE1};
		nodeG.children = new Relation[]{relD1,relF1};		
		NodeLinked nodeLinked = aStarSearch.search(nodeA, "G");
		NodeLinked nodeLinkedPath = nodeLinked.next;
		boolean isLatNode = false;
		while(!isLatNode) {
			System.out.print(nodeLinkedPath.node.id);
			isLatNode = nodeLinkedPath.isLastNode;
			nodeLinkedPath = nodeLinkedPath.next;			
		}
		System.out.println("Path");
		Node nodePath = nodeLinked.node;
		while(nodePath!=null) {
			System.out.print(nodePath.id);
			nodePath = nodePath.root;
		}
		
	}
	
	@Test
	public void test4() {
		Node nodeA = aStarSearch.new Node("A");
		Node nodeB = aStarSearch.new Node("B");
		Node nodeC = aStarSearch.new Node("C");
		Node nodeD = aStarSearch.new Node("D");
		Node nodeE = aStarSearch.new Node("E");
		Node nodeF = aStarSearch.new Node("F");
		Node nodeG = aStarSearch.new Node("G");
		Relation relA1 = aStarSearch.new Relation(nodeA,1);
		Relation relA3 = aStarSearch.new Relation(nodeA,2);
		Relation relB1 = aStarSearch.new Relation(nodeB,1);
		Relation relB2 = aStarSearch.new Relation(nodeB,2);
		Relation relC1 = aStarSearch.new Relation(nodeC,1);
		Relation relC2 = aStarSearch.new Relation(nodeC,2);
		Relation relD1 = aStarSearch.new Relation(nodeD,1);
		Relation relD6 = aStarSearch.new Relation(nodeD,6);
		Relation relE1 = aStarSearch.new Relation(nodeE,1);
		Relation relE3 = aStarSearch.new Relation(nodeE,3);
		Relation relF1 = aStarSearch.new Relation(nodeF,1);
		Relation relF3 = aStarSearch.new Relation(nodeF,3);
		Relation relG1 = aStarSearch.new Relation(nodeG,1);
		Relation relG6 = aStarSearch.new Relation(nodeG,6);
		nodeA.children = new Relation[]{relB1,relE3};
		nodeB.children = new Relation[]{relA1,relC2};
		nodeC.children = new Relation[]{relB2,relD1,relF3};
		nodeD.children = new Relation[]{relF1,relC1,relG6};
		nodeE.children = new Relation[]{relA3,relF1};
		nodeF.children = new Relation[]{relC1,relD1,relG1,relE1};
		nodeG.children = new Relation[]{relD6,relF1};		
		NodeLinked nodeLinked = aStarSearch.search(nodeA, "G");
		NodeLinked nodeLinkedPath = nodeLinked.next;
		boolean isLatNode = false;
		while(!isLatNode) {
			System.out.print(nodeLinkedPath.node.id);
			isLatNode = nodeLinkedPath.isLastNode;
			nodeLinkedPath = nodeLinkedPath.next;			
		}
		System.out.println("Path");
		Node nodePath = nodeLinked.node;
		while(nodePath!=null) {
			System.out.print(nodePath.id);
			nodePath = nodePath.root;
		}		
	}
	
	
	@Test
	public void test5() {
		Node nodeA = aStarSearch.new Node("A");
		Node nodeB = aStarSearch.new Node("B");
		Node nodeC = aStarSearch.new Node("C");
		Node nodeD = aStarSearch.new Node("D");
		Node nodeE = aStarSearch.new Node("E");
		Node nodeF = aStarSearch.new Node("F");
		Node nodeG = aStarSearch.new Node("G");
		Relation relA1 = aStarSearch.new Relation(nodeA,1);
		Relation relA3 = aStarSearch.new Relation(nodeA,2);
		Relation relB1 = aStarSearch.new Relation(nodeB,1);
		Relation relB2 = aStarSearch.new Relation(nodeB,2);
		Relation relC1 = aStarSearch.new Relation(nodeC,1);
		Relation relC2 = aStarSearch.new Relation(nodeC,2);
		Relation relD1 = aStarSearch.new Relation(nodeD,1);
		Relation relD6 = aStarSearch.new Relation(nodeD,6);
		Relation relE1 = aStarSearch.new Relation(nodeE,1);
		Relation relE3 = aStarSearch.new Relation(nodeE,3);
		Relation relF1 = aStarSearch.new Relation(nodeF,1);
		Relation relF5 = aStarSearch.new Relation(nodeF,5);
		Relation relF3 = aStarSearch.new Relation(nodeF,3);		
		Relation relG5 = aStarSearch.new Relation(nodeG,5);
		Relation relG1 = aStarSearch.new Relation(nodeG,1);
		nodeA.children = new Relation[]{relB1,relE3};
		nodeB.children = new Relation[]{relA1,relC2};
		nodeC.children = new Relation[]{relB2,relD1,relF3};
		nodeD.children = new Relation[]{relF1,relC1,relG1};
		nodeE.children = new Relation[]{relA3,relF1};
		nodeF.children = new Relation[]{relC1,relD1,relG5,relE1};
		nodeG.children = new Relation[]{relD6,relF5};		
		NodeLinked nodeLinked = aStarSearch.search(nodeA, "G");
		NodeLinked nodeLinkedPath = nodeLinked.next;
		boolean isLatNode = false;
		while(!isLatNode) {
			System.out.print(nodeLinkedPath.node.id);
			isLatNode = nodeLinkedPath.isLastNode;
			nodeLinkedPath = nodeLinkedPath.next;			
		}
		System.out.println("Path");
		Node nodePath = nodeLinked.node;
		while(nodePath!=null) {
			System.out.print(nodePath.id);
			nodePath = nodePath.root;
		}		
	}
	
	@Test
	public void test6() {
		Node nodeA = aStarSearch.new Node("A");
		Node nodeB = aStarSearch.new Node("B");
		Node nodeC = aStarSearch.new Node("C");
		Node nodeD = aStarSearch.new Node("D");
		Node nodeE = aStarSearch.new Node("E");
		Node nodeF = aStarSearch.new Node("F");
		Node nodeG = aStarSearch.new Node("G");
		Relation relA1 = aStarSearch.new Relation(nodeA,1);
		Relation relA3 = aStarSearch.new Relation(nodeA,2);
		Relation relB1 = aStarSearch.new Relation(nodeB,1);
		Relation relB2 = aStarSearch.new Relation(nodeB,2);
		Relation relC1 = aStarSearch.new Relation(nodeC,1);
		Relation relC2 = aStarSearch.new Relation(nodeC,2);
		Relation relD1 = aStarSearch.new Relation(nodeD,1);
		Relation relD6 = aStarSearch.new Relation(nodeD,6);		
		Relation relE3 = aStarSearch.new Relation(nodeE,3);
		Relation relF1 = aStarSearch.new Relation(nodeF,1);
		Relation relF2 = aStarSearch.new Relation(nodeF,2);
		Relation relF3 = aStarSearch.new Relation(nodeF,3);
		Relation relF5 = aStarSearch.new Relation(nodeF,5);				
		Relation relG5 = aStarSearch.new Relation(nodeG,5);		
		nodeA.children = new Relation[]{relB1,relE3};
		nodeB.children = new Relation[]{relA1,relC2};
		nodeC.children = new Relation[]{relB2,relD1,relF2};
		nodeD.children = new Relation[]{relF1,relC1,relG5};
		nodeE.children = new Relation[]{relA3,relF3};
		nodeF.children = new Relation[]{relC2,relD1,relG5,relE3};
		nodeG.children = new Relation[]{relD6,relF5};		
		NodeLinked nodeLinked = aStarSearch.search(nodeA, "G");
		NodeLinked nodeLinkedPath = nodeLinked.next;
		boolean isLatNode = false;
		while(!isLatNode) {
			System.out.print(nodeLinkedPath.node.id);
			isLatNode = nodeLinkedPath.isLastNode;
			nodeLinkedPath = nodeLinkedPath.next;			
		}
		System.out.println("Path");
		Node nodePath = nodeLinked.node;
		while(nodePath!=null) {
			System.out.print(nodePath.id);
			nodePath = nodePath.root;
		}		
	}
	
	

}

