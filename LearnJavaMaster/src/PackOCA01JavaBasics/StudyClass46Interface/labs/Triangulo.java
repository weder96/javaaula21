package PackOCA01JavaBasics.StudyClass46Interface.labs;


/**
 *
 * @author loiane
 */
public class Triangulo extends Figura2D {
    
    private double base;
    private double altura;

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((altura * base)/2);
    }
    
    
}
