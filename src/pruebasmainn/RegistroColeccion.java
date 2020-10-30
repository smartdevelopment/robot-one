package pruebasmainn;

import java.util.ArrayList;

public class RegistroColeccion {

	private ArrayList<Robot> coleccion = new ArrayList<Robot>();

	public ArrayList<Robot> getColeccion() {
		return coleccion;
	}

	public void setColeccion(ArrayList<Robot> coleccion) {
		this.coleccion = coleccion;
	}

	public void mostrarRobots() {
		System.out.println(coleccion.toString());
	}

	/**
	 * Agrega un robot a la lista
	 * 
	 * @param robot
	 * @return
	 * @throws Exception
	 */
	public boolean agregarRobot(Robot robot) {

		int id = robot.getId();
		String model = robot.getTipoRobot();

		boolean encontrado = false;

		for (Robot r : coleccion) {
			if (r.getId() == id && r.getTipoRobot().equals(model)) {
				encontrado = true;
			}
		}

		if (encontrado) {
			System.err.println("robot ya existe en la lista!");
		} else {
			coleccion.add(robot);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "RegistroColeccion [coleccion=" + coleccion + "]";
	}
}
