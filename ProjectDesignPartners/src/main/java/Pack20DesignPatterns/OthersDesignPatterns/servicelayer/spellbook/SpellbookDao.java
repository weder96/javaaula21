package Pack20DesignPatterns.OthersDesignPatterns.servicelayer.spellbook;

import Pack20DesignPatterns.OthersDesignPatterns.servicelayer.common.Dao;

/**
 * 
 * SpellbookDao interface.
 *
 */
public interface SpellbookDao extends Dao<Spellbook> {
	
	Spellbook findByName(String name);

}
