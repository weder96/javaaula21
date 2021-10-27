package Pack20DesignPatterns.OthersDesignPatterns.servicelayer.magic;

import java.util.List;

import Pack20DesignPatterns.OthersDesignPatterns.servicelayer.servicelayer.spell.Spell;
import Pack20DesignPatterns.OthersDesignPatterns.servicelayer.spellbook.Spellbook;
import Pack20DesignPatterns.OthersDesignPatterns.servicelayer.wizard.Wizard;

/**
 * 
 * Service interface.
 *
 */
public interface MagicService {

	List<Wizard> findAllWizards();

	List<Spellbook> findAllSpellbooks();
	
	List<Spell> findAllSpells();

	List<Wizard> findWizardsWithSpellbook(String name);

	List<Wizard> findWizardsWithSpell(String name);
}
