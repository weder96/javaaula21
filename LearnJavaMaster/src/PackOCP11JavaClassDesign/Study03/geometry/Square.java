package PackOCP11JavaClassDesign.Study03.geometry;

public class Square {
    private int height;
    private int width;

    public Square() {
        this.height = 1;
        this.width = 1;
    }

    public Square(int _height, int _width) {
        this.height = _height;
        this.width = _width;
    }

    public void setHeight(int _height) {
        this.height = _height;
    }

    public void setWidth(int _width) {
        this.width = _width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public double calculateArea() {
        return this.height * this.width;
    }
}
