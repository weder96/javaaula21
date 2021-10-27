package PackOCA01JavaBasics.StudyStackTrace;

public class Application {
	public static void main(String[] args) throws Exception {
		Road r = new Road();

		try {
			r.start();
		} catch (RoadException e) {
			e.printStackTrace();
		}
	}
}
