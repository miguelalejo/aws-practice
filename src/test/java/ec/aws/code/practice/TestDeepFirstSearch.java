package ec.aws.code.practice;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import ec.aws.code.Node;

public class TestDeepFirstSearch {
	DeepFirstSearch bfs = new DeepFirstSearch();

	@Test
	public void test1() {
		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node D = new Node("D");
		Node E = new Node("E");
		A.setChlids(new Node[] { B, C });
		B.setChlids(new Node[] { D, E });
		Optional<Node> result = bfs.search(A, D);
		printNodePath(result.get());		
	}
	
	
	@Test
	public void test2() {
		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node D = new Node("D");
		Node E = new Node("E");
		Node F = new Node("F");
		Node G = new Node("G");
		Node H = new Node("H");
		A.setChlids(new Node[] { B, C });
		B.setChlids(new Node[] { D, E });
		C.setChlids(new Node[] { F, G });
		G.setChlids(new Node[] { H });
		Optional<Node> result = bfs.search(A, H);
		printNodePath(result.get());		
	}
	
	
	public void printNodePath(Node terminal) {
		while(terminal!=null){
			System.out.println(terminal.getId());
			terminal = terminal.getFather();
		}
	}
	
	

}
