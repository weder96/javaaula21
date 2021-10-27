package PackOCA01JavaBasics.StudyStackTrace;

public class Road {
	public void start() throws RoadException {
		Automovel a = new Automovel();
		try {
			a.accelerate(100);
			a.accelerate(90);
		} catch (SpeedLimitException e) {
			throw new RoadException("Road problem!", e);
		}
	}
}
