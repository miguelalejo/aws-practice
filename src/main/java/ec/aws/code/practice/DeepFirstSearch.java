package ec.aws.code.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

import ec.aws.code.Node;

public class DeepFirstSearch {
	public Optional<Node> search(Node A, Node expected) {
		Stack<Node> oppenedNodes = new Stack<>();
		List<Node> visitedNodes = new ArrayList<>();
		oppenedNodes.push(A);
		while (!oppenedNodes.isEmpty()) {
			Node nodeVal = oppenedNodes.pop();
			visitedNodes.add(nodeVal);
			if (nodeVal.getId().equals(expected.getId())) {
				System.out.println(visitedNodes);
				return Optional.of(nodeVal);
			}
			if (nodeVal.getChlids() != null) {
				for (Node nodeChildren : nodeVal.getChlids()) {
					if (!visitedNodes.contains(nodeChildren)) {
						nodeChildren.setFather(nodeVal);
						oppenedNodes.push(nodeChildren);
					}
				}
			}

		}
		return Optional.ofNullable(null);
	}

}
