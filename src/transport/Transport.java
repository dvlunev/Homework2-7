package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final double engineVolume;

    private final List<Sponsor> sponsors = new ArrayList<>();

    private final List<Mechanic<?>> mechanics = new ArrayList<>();

    private Driver<?> driver;

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        if (StringUtils.isNullOrEmptyOrBlank(brand)) {
            brand = "default";
        }
        this.brand = brand;
        if (StringUtils.isNullOrEmptyOrBlank(model)) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 2.0;
        }
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Driver<?> getDriver() {
        return driver;
    }

    public void setDriver(Driver<?> driver) {
        this.driver = driver;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refill();

    public abstract void printType();

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public boolean passDiagnostics() throws NotDiagnosticException {
        if (brand.equals("default") || model.equals("default")) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Транспорт: Марка " + brand +
                ", Модель " + model +
                ", Обьем двигателя " + engineVolume;
    }
}
