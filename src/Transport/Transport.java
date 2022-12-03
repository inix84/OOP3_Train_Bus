package Transport;

public abstract class Transport { //Создайте класс Transport
    private final String brand; //«Марка»,
    private final String model; // «Модель»,
    private final int manufacturingYear; // «Год выпуска»
    private final String manufacturingCountry; //«Страна производства»,
    private String color; //«Цвет кузова»,
    private int maximalSpeed; //«Максимальная скорость передвижения».
    protected final String fuelType;

    public Transport(String brand,
                     String model,
                     int manufacturingYear,
                     String manufacturingCountry,
                     String color,
                     int maximalSpeed
                     ,String fuelType
    ) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.manufacturingYear = manufacturingYear >= 0 ? manufacturingYear : 2000;
        this.manufacturingCountry = ValidationUtils.validOrDefault(manufacturingCountry, "default");
        this.fuelType = checkFuelTypeOrDefault(fuelType);
        setColor(color);
        setMaximalSpeed(maximalSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public String getColor() {
        return color;
    }
    public int getMaximalSpeed() {
        return maximalSpeed;
    }
    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "Белый");
            }

    public void setMaximalSpeed(int maximalSpeed) {
        this.maximalSpeed = Math.max(maximalSpeed, 1);
            }

    public abstract void refill();

    protected abstract String checkFuelTypeOrDefault(String fuelType);


    @Override
    public String toString() {
        return "Transport :" +
                " марка - " + brand +
                ", модель - " + model +
                ", год производства - " + manufacturingYear +
                ", страна производства - " + manufacturingCountry +
                ", цвет - " + color +
                ", максимальная скорость - " + maximalSpeed;
    }
}
