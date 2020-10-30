package pruebasmainn;


public abstract class Robot implements IDateable {
    
    protected int id;
    protected String tipoRobot;
    protected String tipoEnergia;
    protected int recorrido;

    public Robot() {
    }

    public Robot(int id, String tipoRobot, String tipoEnergia, int recorrido) {
        this.id = id;
        this.tipoRobot = tipoRobot;
        this.tipoEnergia = tipoEnergia;
        this.recorrido = recorrido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoRobot() {
        return tipoRobot;
    }

    public void setTipoRobot(String tipoRobot) {
        this.tipoRobot = tipoRobot;
    }

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public int getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }

    @Override
	public String toString() {
		return "Robot [id=" + id + ", tipoRobot=" + tipoRobot
				+ ", tipoEnergia=" + tipoEnergia + ", recorrido=" + recorrido
				+ "]";
	}


    public abstract int calcularWatts ();
    
    
    
    
    
}
