package Pack20DesignPatterns.CreationalPatterns.factorymethod;

/**
 * 
 * Concrete subclass for creating new objects.
 * 
 */
public class OrcBlacksmith implements Blacksmith {

	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}

}
