package Pack20DesignPatterns.CreationalPatterns.prototype;

public abstract class Mage extends Prototype {

	@Override
	public abstract Mage clone() throws CloneNotSupportedException;

}
