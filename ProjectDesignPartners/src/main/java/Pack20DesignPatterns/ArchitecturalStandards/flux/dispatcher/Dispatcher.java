package Pack20DesignPatterns.ArchitecturalStandards.flux.dispatcher;

import Pack20DesignPatterns.ArchitecturalStandards.flux.action.*;
import Pack20DesignPatterns.ArchitecturalStandards.flux.store.Store;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Dispatcher sends Actions to registered Stores.
 *
 */
public class Dispatcher {
	
	private static Dispatcher instance = new Dispatcher();
	
	private List<Store> stores = new LinkedList<Store>();
	
	private Dispatcher() {	
	}

	public static Dispatcher getInstance() {
		return instance;
	}
	
	public void registerStore(Store store) {
		stores.add(store);
	}
	
	public void menuItemSelected(MenuItem menuItem) {
		dispatchAction(new MenuAction(menuItem));
		switch (menuItem) {
		case HOME:
		case PRODUCTS:
		default:
			dispatchAction(new ContentAction(Content.PRODUCTS));
			break;
		case COMPANY:
			dispatchAction(new ContentAction(Content.COMPANY));
			break;
		}
	}
	
	private void dispatchAction(Action action) {
		stores.stream().forEach((store) -> store.onAction(action));
	}
}
