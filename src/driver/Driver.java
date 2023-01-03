package driver;

import transport.StringUtils;
import transport.Transport;

public abstract class Driver<A extends Transport> {

    private final String fullName;
    private boolean driverLicense;
    private int experience;
    private String typeOfLicense;

    public Driver(String fullName,
                  boolean driverLicense,
                  int experience,
                  String typeOfLicense) throws IllegalArgumentException {
        if (StringUtils.isNullOrEmptyOrBlank(fullName)) {
            fullName = "ФИО не указано";
        }
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        setExperience(experience);
        setTypeOfLicense(typeOfLicense);
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            experience = 0;
        }
        this.experience = experience;
    }

    public String getTypeOfLicense() {
        return typeOfLicense;
    }

    public void setTypeOfLicense(String typeOfLicense) throws IllegalArgumentException {
        this.typeOfLicense = typeOfLicense;
    }

    public abstract void startMove(A transport);

    public abstract void finishMove(A transport);

    public abstract void refill(A transport);

    public void checkDriver(A transport) {
        if (driverLicense) {
            System.out.println("Водитель " + getFullName() +
                    " управляет автомобилем " + transport.getBrand() +
                    " и будет участвовать в заезде");
        } else {
            System.out.println("Водитель " + getFullName() +
                    " управляющий автомобилем " + transport.getBrand() +
                    " не имеет прав и не будет участвовать в заезде");
        }
    }

    @Override
    public String toString() {
        return fullName +
                ", наличие прав " + driverLicense +
                ", водительский стаж " + experience + " лет" +
                ", категория прав " + typeOfLicense;
    }
}
