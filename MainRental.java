package com.Pemlan;

public class MainRental {
    public static void main(String[] args) {
        CarRider atthar = new CarRider("Attharsyah", 18, "123456789");
        CarRider baso = new CarRider("Baso", 19, "123456789");
        CarRider tika = new CarRider("Mustika", 20, "123456789");
        CarRider maimunah = new CarRider("Maimunah", 19, "123456789");

        CarData data = new CarData();
        data.addCar("TRUK", "DD 123 MA", "Avanza");
        data.addCar("SEDAN", "DD 234 AR", "BMW");
        data.addCar("SPORT", "N 657 MHF", "Honda");
        data.addCar("SEDAN", "N 633 IOW", "Mazda");
        data.listOfCar();
        System.out.println("");

        RentArchive arsip = new RentArchive();
        arsip.Rent(atthar, CarData.carList.get(1), 3);
        arsip.Rent(baso, CarData.carList.get(1), 4);
        arsip.Rent(tika, CarData.carList.get(3), 10);
        arsip.Rent(maimunah, CarData.carList.get(2), 2);
        System.out.println("");

        arsip.info();
    }
}
