package ec.aws.mogix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WarGame {
	enum TipoEntidad {
		Tanque, Helicoptero, Base, Obstaculo, Libre
	}

	class Celda {
		int x;
		int y;
		TipoEntidad tipoEntidad;

		public Celda(int x, int y, TipoEntidad tipoEntidad) {
			super();
			this.x = x;
			this.y = y;
			this.tipoEntidad = tipoEntidad;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Celda other = (Celda) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		private WarGame getEnclosingInstance() {
			return WarGame.this;
		}

	}

	class Tablero {
		int w;
		int h;
		int n;
		Celda[][] celdas;
		private List<Celda> listaObstaculos;

		public Tablero(int w, int h, int n, List<Celda> listaObstaculos) {
			super();
			this.w = w;
			this.h = h;
			this.n = n;
			this.listaObstaculos = listaObstaculos;
		}

		public Tablero(int w, int h, List<Celda> listaObstaculos) {
			super();
			this.w = w;
			this.h = h;
			this.listaObstaculos = listaObstaculos;
			this.celdas = constuirTablero(listaObstaculos);
		}

		private Celda[][] constuirTablero(List<Celda> listaObstaculos) {
			Celda[][] tablero = new Celda[h][];
			for (int i = h - 1; i > 0; i--) {
				tablero[i] = new Celda[w];
				for (int j = 0; j < w; j++) {
					tablero[i][j] = new Celda(i, j, TipoEntidad.Libre);
				}
			}
			for (Celda celda : listaObstaculos) {
				tablero[celda.x][celda.y].tipoEntidad = TipoEntidad.Obstaculo;
			}

			tablero[h - 1][0].tipoEntidad = TipoEntidad.Helicoptero;
			tablero[0][0].tipoEntidad = TipoEntidad.Tanque;
			tablero[h - 1][w].tipoEntidad = TipoEntidad.Base;
			return tablero;
		}

		public Celda[][] eliminarObstaculos(Celda[][] tablero, List<Celda> listaObstaculos) {
			for (Celda celda : listaObstaculos) {
				tablero[celda.x][celda.y].tipoEntidad = TipoEntidad.Libre;
			}
			return tablero;
		}

		public List<Relation> obtenerNodosHijos(Tablero tablero, Celda celda) {
			int fil = tablero.h;
			int cols = tablero.w;
			List<Relation> listaRelaciones = new ArrayList();
			for (int k = celda.x; k < celda.x + 2; k++) {
				if (k < 0 || k >= fil) {
					continue;
				}				

				if (celda.x == k ) {
					continue;
				} else {
					if (TipoEntidad.Obstaculo != tablero.celdas[k][celda.y].tipoEntidad) {
						listaRelaciones.add(new Relation(new Node(tablero.celdas[k][celda.y]), 1));
					}
				}
			}
			
			for (int k = celda.y; k < celda.y + 2; k++) {
				if (k < 0 || k >= cols) {
					continue;
				}				

				if (celda.y == k ) {
					continue;
				} else {
					if (TipoEntidad.Obstaculo != tablero.celdas[celda.x][k].tipoEntidad) {
						listaRelaciones.add(new Relation(new Node(tablero.celdas[celda.x][k]), 1));
					}
				}
			}
			return listaRelaciones;
		}

		public List<Relation> obtenerNodosHijosHelicoptero(Tablero tablero, List<Celda> obstaculos, Celda celda) {
			List<Relation> listaRelaciones = new ArrayList();
			int fil = tablero.h;
			int cols = tablero.w;
			for (int k = 0; k < celda.x + 2; k++) {
				if (k < 0 || k >= fil) {
					continue;
				}				

				if (celda.x == k ) {
					continue;
				} else {
					if (TipoEntidad.Obstaculo != tablero.celdas[k][celda.y].tipoEntidad) {
						
						listaRelaciones.add(new Relation(new Node(tablero.celdas[k][celda.y]), 1));
					}
				}
			}
			
			for (int k = celda.y; k < celda.y + 2; k++) {
				if (k < 0 || k >= fil) {
					continue;
				}				

				if (celda.y == k ) {
					continue;
				} else {
					if (TipoEntidad.Obstaculo != tablero.celdas[celda.x][k].tipoEntidad) {
						listaRelaciones.add(new Relation(new Node(tablero.celdas[celda.x][k]), 1));
					}
				}
			}
			
			return listaRelaciones;

		}

		public boolean buscarBase(Node nodeRoot, Tablero tablero) {
			Queue<Node> opennedNodes = new LinkedList<>();
			List<Node> visitedNodes = new ArrayList<>();
			NodeLinked nodeLinked = null;
			NodeLinked firstNodeLinked = null;
			opennedNodes.add(nodeRoot);
			Node node = null;
			while (!opennedNodes.isEmpty()) {
				node = opennedNodes.poll();
				visitedNodes.add(node);
				if (nodeLinked == null) {
					nodeLinked = new NodeLinked();
					nodeLinked.node = node;
					firstNodeLinked = nodeLinked;
				} else {
					NodeLinked nextNodeLinked = new NodeLinked();
					nextNodeLinked.node = node;
					nodeLinked.next = nextNodeLinked;
					nodeLinked = nextNodeLinked;
				}
				if (node.id.tipoEntidad == TipoEntidad.Base) {
					nodeLinked.next = firstNodeLinked;
					nodeLinked.isLastNode = true;
					return true;
				}
				node.children = obtenerNodosHijos(tablero, node.id);
				for (Relation relation : node.children) {
					Node nodeChild = relation.node;
					if (!visitedNodes.contains(nodeChild)) {
						if (!opennedNodes.contains(nodeChild)) {
							nodeChild.root = node;
							nodeChild.gn = node.gn + relation.costo;
							opennedNodes.add(nodeChild);
						} else {
							Node nodeTemp = opennedNodes.stream().filter(r -> r.id == nodeChild.id).findAny()
									.orElse(null);
							Node nodeRootTemp = nodeTemp.root;
							int costoAnterior = nodeTemp.gn;
							int costoNuevo = node.gn + relation.costo;
							if (costoNuevo < costoAnterior) {
								nodeChild.root = node;
								nodeChild.gn = costoNuevo;
								Queue<Node> opennedNodesTemp = new LinkedList<>();
								opennedNodes.stream().forEach(r -> {
									if (r.id == nodeChild.id) {
										opennedNodesTemp.add(nodeChild);
									} else {
										opennedNodesTemp.add(r);
									}
								});
								opennedNodes = opennedNodesTemp;
							} else {
								nodeChild.root = nodeRootTemp;
							}
						}
					}

				}

			}
			return false;
		}

		public int destruirBaseEnamigo(Tablero tablero) {
			List<Celda> listaCeldas = listaObstaculos;
			Celda helicoptero = tablero.celdas[tablero.h - 1][0];

		}

	}

	class NodeLinked {
		boolean isLastNode;
		Node node;
		NodeLinked next;
	}

	class Node {
		Celda id;
		List<Relation> children;
		Node root;
		int gn;

		public Node(Celda id) {
			super();
			this.id = id;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		private WarGame getEnclosingInstance() {
			return WarGame.this;
		}

	}

	class Relation {
		Node node;
		int costo;

		public Relation(Node node, int costo) {
			super();
			this.node = node;
			this.costo = costo;
		}

	}

}
