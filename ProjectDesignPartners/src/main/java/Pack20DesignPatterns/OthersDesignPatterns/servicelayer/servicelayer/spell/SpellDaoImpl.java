package Pack20DesignPatterns.OthersDesignPatterns.servicelayer.servicelayer.spell;

import Pack20DesignPatterns.OthersDesignPatterns.servicelayer.common.DaoBaseImpl;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


/**
 * 
 * SpellDao implementation.
 *
 */
public class SpellDaoImpl extends DaoBaseImpl<Spell> implements SpellDao {

	@Override
	public Spell findByName(String name) {
		Session session = getSession();
		Transaction tx = null;
		Spell result = null;
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(persistentClass);
			criteria.add(Restrictions.eq("name", name));
			result = (Spell) criteria.uniqueResult();
			result.getSpellbook().getWizards().size();
			tx.commit();
		}
		catch (Exception e) {
			if (tx!=null) tx.rollback();
			throw e;
		}
		finally {
			session.close();
		}		
		return result;
	}
}
