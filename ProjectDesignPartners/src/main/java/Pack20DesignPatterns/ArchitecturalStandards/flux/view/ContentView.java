package Pack20DesignPatterns.ArchitecturalStandards.flux.view;


import Pack20DesignPatterns.ArchitecturalStandards.flux.action.Content;
import Pack20DesignPatterns.ArchitecturalStandards.flux.store.ContentStore;
import Pack20DesignPatterns.ArchitecturalStandards.flux.store.Store;

/**
 * 
 * ContentView is a concrete view.
 *
 */
public class ContentView implements View {

	private Content content = Content.PRODUCTS;

	@Override
	public void storeChanged(Store store) {
		ContentStore contentStore = (ContentStore) store;
		content = contentStore.getContent();
		render();
	}

	@Override
	public void render() {
		System.out.println(content.toString());
	}
}
