package Pack20DesignPatterns.OthersDesignPatterns.servicelayer.servicelayer.spell;

import Pack20DesignPatterns.OthersDesignPatterns.servicelayer.common.Dao;

/**
 * 
 * SpellDao interface.
 *
 */
public interface SpellDao extends Dao<Spell> {
	
	Spell findByName(String name);

}
