package PackOCA01JavaBasics.StudyStackTrace;

public class Automovel {
	private static final int MAX_SPEED = 180;
	private int currentSpeed;

	public void accelerate(int velocity) throws SpeedLimitException {
		if (this.currentSpeed + velocity > MAX_SPEED) {
			throw new SpeedLimitException("Your speed is bigger than limit!");
		}
		this.currentSpeed += velocity;
	}
}
