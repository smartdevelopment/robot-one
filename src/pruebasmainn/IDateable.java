package pruebasmainn;


public interface IDateable {
    
    
    //SE AGREGAN LOS VALORES DE LOS MINUTOS
    int DURACION_BATERIA_ROBOT_BASICO_EN_MINUTOS = 15;
    int DURACION_BATERIA_ROBOT_AVANZADO_EN_MINUTOS = 60;
    int ENERGIA_CONSUMIDA_EN_UN_MINUTO_EN_WATTS = 10;
    
    int calcularDistancia (int cm);
    int calcularEnergia (int watts);
    
    public abstract int calcularWatts ();
    
            
            
    
}
