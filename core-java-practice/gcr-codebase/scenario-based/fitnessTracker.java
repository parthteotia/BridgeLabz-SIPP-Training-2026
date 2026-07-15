interface Trackable {
    void logActivity(String activityType, int durationMinutes);

    default void resetData() {
        System.out.println("[Trackable] All fitness data has been reset to zero.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    private String deviceName;
    private int totalMinutesTracked = 0;

    public FitnessDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void logActivity(String activityType, int durationMinutes) {
        this.totalMinutesTracked += durationMinutes;
        System.out.println("[" + deviceName + "] Logged " + durationMinutes + " mins of " + activityType);
    }

    @Override
    public void generateReport() {
        System.out.println("\n--- " + deviceName + " Daily Report ---");
        System.out.println("Total Active Time: " + totalMinutesTracked + " minutes.");
        System.out.println("-----------------------------\n");
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("PING [" + deviceName + "]: " + message);
    }
}

public class fitnessTracker {
    public static void main(String[] args) {
        FitnessDevice myWatch = new FitnessDevice("FitPulse Pro V2");

        myWatch.logActivity("Running", 45);
        myWatch.logActivity("Weightlifting", 30);
        myWatch.sendAlert("Goal reached! You've crossed 60 minutes of activity today!");
        myWatch.generateReport();
        myWatch.resetData();
    }
}
