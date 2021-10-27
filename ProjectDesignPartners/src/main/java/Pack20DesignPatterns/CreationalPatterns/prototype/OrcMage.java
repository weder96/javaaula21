package Pack20DesignPatterns.CreationalPatterns.prototype;

public class OrcMage extends Mage {

	public OrcMage() {
	}

	public OrcMage(OrcMage mage) {
	}

	@Override
	public Mage clone() throws CloneNotSupportedException {
		return new OrcMage(this);
	}

	@Override
	public String toString() {
		return "Orcish mage";
	}

}
