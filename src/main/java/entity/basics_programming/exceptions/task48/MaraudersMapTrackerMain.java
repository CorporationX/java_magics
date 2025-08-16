package entity.basics_programming.exceptions.task48;

public class MaraudersMapTrackerMain {
    public static void main(String[] args) {
        MaraudersMapTracker tracker = new MaraudersMapTracker();

        tracker.trackCoordinates("Гермиона", 100, 200);
        tracker.trackCoordinates("Гарри", -10, 5);
        tracker.trackCoordinates("Драко", null, null);
    }
}
