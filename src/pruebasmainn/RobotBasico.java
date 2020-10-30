package pruebasmainn;

public class RobotBasico extends Robot {

    private int cantPila;

    public RobotBasico() {
    }

    public RobotBasico(int cantPila, int id, String tipoRobot, String tipoEnergia, int recorrido) {
        super(id, tipoRobot, tipoEnergia, recorrido);
        this.cantPila = cantPila;
    }

    public int getCantPila() {
        return cantPila;
    }

    public void setCantPila(int cantPila) {
        this.cantPila = cantPila;
    }


    @Override
    public int calcularDistancia(int cm) {
        return DURACION_BATERIA_ROBOT_BASICO_EN_MINUTOS * cm;
      
            
        
    }

    @Override
	public String toString() {
		return "RobotBasico [cantPila=" + cantPila + "]";
	}

	@Override
    public int calcularEnergia(int watts) {
        return 0;
        
    }

    @Override
    public int calcularWatts() {
        return 0;
    }
    
}
