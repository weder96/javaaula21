package Pack20DesignPatterns.BehavioralPatterns.command;

/**
 * 
 * Interface for Commands.
 * 
 */
public abstract class Command {

	public abstract void execute(Target target);

	public abstract void undo();

	public abstract void redo();

	@Override
	public abstract String toString();

}
