package Pack20DesignPatterns.OthersDesignPatterns.servicelayer.wizard;

import Pack20DesignPatterns.OthersDesignPatterns.servicelayer.common.Dao;

/**
 * 
 * WizardDao interface.
 *
 */
public interface WizardDao extends Dao<Wizard> {
	
	Wizard findByName(String name);

}
