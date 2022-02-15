package de.uslu.citest.alarm;

public enum AlarmLevel {

    RED(0),
    YELLOW(30),
    GREEN(60);

    private final int threshold;

    AlarmLevel(int threshold) {
        this.threshold = threshold;
    }

    public String getMessage(int numberOfCustomers) {
        return numberOfCustomers <= threshold
                ? "Maximale Personenzahl nicht überschritten"
                : "Zu viele Personen";
    }

}
