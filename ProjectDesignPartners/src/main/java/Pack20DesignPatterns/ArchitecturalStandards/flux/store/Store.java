package Pack20DesignPatterns.ArchitecturalStandards.flux.store;

import Pack20DesignPatterns.ArchitecturalStandards.flux.action.Action;
import Pack20DesignPatterns.ArchitecturalStandards.flux.view.View;

import java.util.LinkedList;
import java.util.List;


/**
 * 
 * Store is a data model.
 *
 */
public abstract class Store {
	
	private List<View> views = new LinkedList<View>();
	
	public abstract void onAction(Action action);

	public void registerView(View view) {
		views.add(view);
	}
	
	protected void notifyChange() {
		views.stream().forEach((view) -> view.storeChanged(this));
	}
}
