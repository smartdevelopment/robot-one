package pruebasmainn;


public class RobotAvanzado extends Robot {
    private int duracionBat;

    public RobotAvanzado() {
    }

    public RobotAvanzado(int duracionBat, int id, String tipoRobot, String tipoEnergia, int recorrido) {
        super(id, tipoRobot, tipoEnergia, recorrido);
        this.duracionBat = duracionBat;
    }

    public int getDuracionBat() {
        return duracionBat;
    }

    public void setDuracionBat(int duracionBat) {
        this.duracionBat = duracionBat;
    }

    @Override
	public String toString() {
		return "RobotAvanzado [duracionBat=" + duracionBat + "]";
	}
    
   
    
    @Override
    public int calcularDistancia(int cm) {
    	return DURACION_BATERIA_ROBOT_AVANZADO_EN_MINUTOS * cm;
        
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
