package co.com.sofka.util;

public enum Destinations {
    MADAN("Madan"),
    SHENJI("Shenji");

    public final String value;

    Destinations(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
