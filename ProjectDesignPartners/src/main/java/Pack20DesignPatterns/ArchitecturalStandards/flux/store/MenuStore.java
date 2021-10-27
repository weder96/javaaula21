package Pack20DesignPatterns.ArchitecturalStandards.flux.store;


import Pack20DesignPatterns.ArchitecturalStandards.flux.action.Action;
import Pack20DesignPatterns.ArchitecturalStandards.flux.action.ActionType;
import Pack20DesignPatterns.ArchitecturalStandards.flux.action.MenuAction;
import Pack20DesignPatterns.ArchitecturalStandards.flux.action.MenuItem;

/**
 * 
 * MenuStore is a concrete store.
 *
 */
public class MenuStore extends Store {

	private MenuItem selected = MenuItem.HOME;
	
	@Override
	public void onAction(Action action) {
		if (action.getType().equals(ActionType.MENU_ITEM_SELECTED)) {
			MenuAction menuAction = (MenuAction) action;
			selected = menuAction.getMenuItem();
			notifyChange();
		}
	}
	
	public MenuItem getSelected() {
		return selected;
	}
}
