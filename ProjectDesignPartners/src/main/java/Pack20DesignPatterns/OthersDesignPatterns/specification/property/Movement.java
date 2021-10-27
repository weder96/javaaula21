package Pack20DesignPatterns.OthersDesignPatterns.specification.property;

/**
 * 
 * Movement property.
 *
 */
public enum Movement {

    WALKING("walking"), SWIMMING("swimming"), FLYING("flying");
    
    private String title;

    Movement(String title) {
        this.title = title;
    }

    @Override
	public String toString() {
        return title;
	}	
}
