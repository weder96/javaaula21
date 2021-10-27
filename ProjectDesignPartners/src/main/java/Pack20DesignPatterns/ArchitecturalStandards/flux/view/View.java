package Pack20DesignPatterns.ArchitecturalStandards.flux.view;


import Pack20DesignPatterns.ArchitecturalStandards.flux.store.Store;

/**
 * 
 * Views define the representation of data.
 *
 */
public interface View {

	public void storeChanged(Store store);

	public void render();
}
