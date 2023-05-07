package pnb.pbo1.js.helper;

@SuppressWarnings("ClassCanBeRecord")
public class City {
    private final String name;
    private final int temperature;

    /**
     * Constructor untuk class City
     * @param name Nama kota
     * @param temperature Temperatur kota
     */
    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    // Getter dari var name dan temperature
    public String getName() {
        return name;
    }
    public int getTemperature() {
        return temperature;
    }


}
