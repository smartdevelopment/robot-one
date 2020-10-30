package pruebasmainn;

import java.util.Iterator;
import java.util.Scanner;

public class PruebasMainn {

	public static void main(String[] args) {

		int option = 0;
		int testNum = 0;
		int rAdvance = 0;

		Scanner in = new Scanner(System.in);
		boolean salida = true;

		System.out.println("*********************************************");

		RegistroColeccion coleccion = new RegistroColeccion();

		System.out.println("numero de robots basicos?:");
		testNum = in.nextInt();

		System.out.println("numero de robots avanzados?:");
		rAdvance = in.nextInt();

		if (testNum + rAdvance < 2) {
			System.err.println("ingrese mayor que 2");
		} else {

		}

		for (int i = 0; i < testNum; i++) {

			RobotBasico b = new RobotBasico();
			b.setTipoRobot("SODIAL");
			b.setId(i + 1);

			coleccion.agregarRobot(b);

		}

		for (int i = 0; i < rAdvance; i++) {

			RobotAvanzado b = new RobotAvanzado();
			b.setTipoRobot("OSOYOO");
			b.setId(i + 1);

			coleccion.agregarRobot(b);
		}

		System.out.println("Todos los objetos:");
		System.out.print(coleccion.toString());

		int distanciasBasic = 0;
		int distanciasAdvanc = 0;
		int contadorB = 0;
		int contadorA = 0;
		for (Robot robot : coleccion.getColeccion()) {

			if (robot.getTipoRobot().equals("SODIAL")) {
				distanciasBasic = distanciasBasic + robot.calcularDistancia(10);
				contadorB++;
			}

			if (robot.getTipoRobot().equals("OSOYOO")) {
				distanciasAdvanc = distanciasAdvanc
						+ robot.calcularDistancia(20);
				contadorA++;
			}

		}
		System.out.println("");
		System.out.println("Distancias Basico: " + distanciasBasic);
		System.out.println("Distancias Avanzado: " + distanciasAdvanc);
		
		System.out.println("Robots Basicos: " + contadorB);
		System.out.println("Robots Avanzados: "+ contadorA);


		System.out.println("chao");

	}

}
