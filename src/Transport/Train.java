package Transport;
public class Train extends Transport{ //Создайте класс «Поезд» (Train), который будет расширять класс Transport.
    private double tripPrice; // «Цена поездки»,
    private int travelTime; // «Время поездки»,
    private String departureStationName; // «Название станции отбытия»,
    private String endingStation; // «Конечная остановка»,
    private int numberOfWagons; // «Количество вагонов».
    public Train(String brand,
                 String model,
                 int manufacturingYear,
                 String manufacturingCountry,
                 String color,
                 double tripPrice,
                 int travelTime,
                 String departureStationName,
                 String endingStation,
                 int numberOfWagons,
                 int maximalSpeed,
                 String fuelType
    ) {
        super(brand, model, manufacturingYear, manufacturingCountry, color, maximalSpeed, fuelType);
        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        setDepartureStationName(departureStationName);
        setEndingStation(endingStation);
        setNumberOfWagons(numberOfWagons);
    }
    public double getTripPrice() {
        return tripPrice;
    }
    public void setTripPrice(double tripPrice) {
        this.tripPrice = Math.max(tripPrice, 1);
    }
    public int getTravelTime() {
        return travelTime;
    }
    public void setTravelTime(int travelTime) {
        this.travelTime = Math.max(travelTime, 1);
    }
    public String getDepartureStationName() {
        return departureStationName;
    }
    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = ValidationUtils.validOrDefault(departureStationName, "Информация не указана");
    }
    public String getEndingStation() {
        return endingStation;
    }
    public void setEndingStation(String endingStation) {
        this.endingStation = ValidationUtils.validOrDefault(endingStation, "Информация не указана");;
    }
    public int getNumberOfWagons() {
        return numberOfWagons;
    }
    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = Math.max(numberOfWagons, 1);
    }
    @Override
    public String toString() {
        return "Поезд: " +
                super.toString() +
                ", Цена поездки - " + getTripPrice() + " рублей " +
                ", время поездки - " + getTravelTime() +
                ", станция отбытия - " + getDepartureStationName() +
                ", конечная станция - " + getEndingStation() +
                ", количество вагонов - " + getNumberOfWagons();
    }
    @Override
    public void refill() {
        System.out.println("Refilling train with " + this.fuelType);

    }
    @Override
    protected String checkFuelTypeOrDefault(String fuelType) {
        if (fuelType == null || "Diesel".contains(fuelType)) {
            return "Diesel";
        }else {
            return fuelType;
        }
    }
}