package PackOCP11JavaClassDesign.Study03.geometry;

public class Circle {
    private int radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(int _radius) {
        this.radius = _radius;
    }

    public void setRadius(int _radius) {
        this.radius = _radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
