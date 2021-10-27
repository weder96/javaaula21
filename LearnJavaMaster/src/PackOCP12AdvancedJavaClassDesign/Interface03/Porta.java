package PackOCP12AdvancedJavaClassDesign.Interface03;

public class Porta implements Cloneable {
	private double height;
	private double width;
	private boolean opened;

	public Porta(double height, double width) {
		super();
		this.height = height;
		this.width = width;
		this.opened = false;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public void open() {
		this.opened = true;
	}

	public void close() {
		this.opened = false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Porta copy = new Porta(this.getHeight(), this.getWidth());
		copy.setOpened(this.isOpened());
		return copy;
	}
}
