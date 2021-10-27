package Pack20DesignPatterns.ArchitecturalStandards.flux.action;

/**
 * 
 * Action is the data payload dispatched to the stores when something happens.
 *
 */
public abstract class Action {

	private ActionType type;
	
	public Action(ActionType type) {
		this.type = type;
	}
	
	public ActionType getType() {
		return type;
	}
}
