package Pack20DesignPatterns.CreationalPatterns.prototype;

public abstract class Beast extends Prototype {

	@Override
	public abstract Beast clone() throws CloneNotSupportedException;

}
