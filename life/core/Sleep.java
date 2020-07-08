package life.core;

public class Sleep {
    public static void sleep(final int time) {
        try {
            Thread.sleep(time);
        } catch (final InterruptedException e) {
        }
    }

    public static void sleep() {
        sleep(1000);
    }
}