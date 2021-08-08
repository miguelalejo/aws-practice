package ec.aws.code;

public class Node {
	Node father;
	Node[] chlids;
	String id;

	public Node(String id) {
		super();		
		this.id = id;
	}

	public Node[] getChlids() {
		return chlids;
	}

	public void setChlids(Node[] chlids) {
		this.chlids = chlids;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	

}
