package PackOCP11JavaClassDesign.Study03.geometry;

public class Trapezoid {
    private int base;
    private int top;
    private int height;

    public Trapezoid() {
        this.base = 1;
        this.top = 1;
        this.height = 1;
    }

    public Trapezoid(int _base, int _top, int _height) {
        this.base = _base;
        this.top = _top;
        this.height = _height;
    }

    public void setBases(int _base, int _top) {
        this.base = _base;
        this.top = _top;
    }

    public void setHeight(int _height) {
        this.height = _height;
    }

    public int getBase() {
        return this.base;
    }

    public int getTop() {
        return this.top;
    }

    public int getHeight() {
        return this.height;
    }

    public double calculateArea() {
        return (this.getBase() + this.getTop()) / 2.0 * this.getHeight();
    }
}
