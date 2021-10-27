package PackOCA01JavaBasics.StudyClass46Interface.labs;

/**
 *
 * @author loiane
 */
public class Circulo extends Figura2D {
    
    private double raio;

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (raio * raio) * Math.PI;
    }
    
    
}
