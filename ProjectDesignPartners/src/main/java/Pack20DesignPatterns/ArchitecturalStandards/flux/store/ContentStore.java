package Pack20DesignPatterns.ArchitecturalStandards.flux.store;


import Pack20DesignPatterns.ArchitecturalStandards.flux.action.Action;
import Pack20DesignPatterns.ArchitecturalStandards.flux.action.ActionType;
import Pack20DesignPatterns.ArchitecturalStandards.flux.action.Content;
import Pack20DesignPatterns.ArchitecturalStandards.flux.action.ContentAction;

/**
 * 
 * ContentStore is a concrete store.
 *
 */
public class ContentStore extends Store {

	private Content content = Content.PRODUCTS;

	@Override
	public void onAction(Action action) {
		if (action.getType().equals(ActionType.CONTENT_CHANGED)) {
			ContentAction contentAction = (ContentAction) action;
			content = contentAction.getContent();
			notifyChange();
		}
	}
	
	public Content getContent() {
		return content;
	}
}
