package ec.aws.code.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ec.aws.code.Node;

public class BreadthFirstSearch {

	public Node search(Node start, Node expected) {
		Queue<Node> listOppenedNodes = new LinkedList<>();
		List<Node> visitedNodes = new ArrayList<>();
		listOppenedNodes.add(start);
		while (!listOppenedNodes.isEmpty()) {
			Node nodeVal = listOppenedNodes.poll();
			if (nodeVal.getId() == expected.getId()) {
				System.out.println(visitedNodes);
				return nodeVal;
			}
			if (!visitedNodes.contains(nodeVal)) {
				visitedNodes.add(nodeVal);
				if (nodeVal.getChlids() != null) {
					for (Node nodeChild : nodeVal.getChlids()) {
						nodeChild.setFather(nodeVal);
						listOppenedNodes.add(nodeChild);
					}
				}

			}
		}
		return null;

	}

}
