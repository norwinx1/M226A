public class Heater {
    private int temperature;
    private final int min;
    private final int max;
    private int increment;

    public Heater(int min, int max) {
        this.temperature = 15;
        this.increment = 5;
        this.min = min;
        this.max = max;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public void warmer() {
        if (temperature + increment < max) {
            temperature += increment;
        }
    }

    public void cooler() {
        if (temperature - increment > min) {
            temperature -= increment;
        }
    }
}
