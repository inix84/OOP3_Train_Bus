import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7f,
                "Желтый",
                2015,
                "Россия",
                120
        );
        Car audi = new Car(
                "Audi",
                "A8",
                3.0f,
                "Черный",
                2020,
                "Германия",
                250
        );
        Car bMW = new Car(
                "BMW",
                "Z8",
                3.0f,
                "Черный",
                2021,
                "Германия",
                300
        );
        Car kia = new Car(
                "Kia",
                "Sportage",
                2.4f,
                "Красный",
                2018,
                "Южная Корея",
                180
        );
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6f,
                "Оранжевый",
                2016,
                "Южная Корея",
                200
        );
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bMW);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println();

        Train martin = new Train(
                "«Ласточка»",
                "B-901",
              2011,
              "Россия",
                null,
                3500,
                0,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11,
                301,
                null
        );
        Train leningrad = new Train(
                "«Ленинград»",
                "D-125",
                2019,
                "Россия",
                null,
                1700,
                0,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8,
                270,
                null
        );

        System.out.println(martin);
        System.out.println(leningrad);

        System.out.println();

            //
    }
}