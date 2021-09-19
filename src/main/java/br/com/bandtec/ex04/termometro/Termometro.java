package br.com.bandtec.ex04.termometro;

public class Termometro {

    // attributes
    Double currentTemperature, maxTemperature, minTemperature;

    // constructor
    Termometro (Double current) {
        this.currentTemperature = current;
        this.maxTemperature = current;
        this.minTemperature = current;
    }
    Termometro (Integer current) {
        Double value = Double.valueOf(current);
        this.currentTemperature = value;
        this.maxTemperature = value;
        this.minTemperature = value;
    }

    // increase temperature
    public void increaseTemperature(Double value) {
        this.currentTemperature += value;
        updateMin();
        updateMax();
    }

    public void increaseTemperature(Integer value) {
        increaseTemperature(Double.valueOf(value));
    }

    // decrease temperature
    public void decreaseTemperature(Double value) {
        this.currentTemperature -= value;
        updateMax();
        updateMin();
    }

    public void decreaseTemperature(Integer value) {
        this.decreaseTemperature(Double.valueOf(value));
    }

    // shows current temperature in fahreinheit
    public Double currentFahreinheit() {
        return (this.currentTemperature * 9/5) + 32;
    }

    // update min temperature
    private void updateMin() {
        if (this.currentTemperature < this.minTemperature) {
            this.minTemperature = this.currentTemperature;
        }
    }

    // update max temperature
    private void updateMax() {
        if (this.currentTemperature > this.maxTemperature) {
            this.maxTemperature = this.currentTemperature;
        }
    }

    // tostring override
    @Override
    public String toString() {
        String str = "-".repeat(30) + 
        "\ncurrent: %.2f C" +
        "\nmax: %.2f C" + 
        "\nmin: %.2f C" + 
        "\nfahreinheit: %.2f F\n"+
        "-".repeat(30);
        return String.format(
            str, 
            this.currentTemperature, 
            this.maxTemperature, 
            this.minTemperature,
            this.currentFahreinheit()
        );
    }

}
