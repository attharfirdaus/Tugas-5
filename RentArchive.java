package com.Pemlan;

import java.util.ArrayList;

public class RentArchive {
    public static ArrayList <CarRent> rentData;

    public RentArchive(){
        rentData = new ArrayList<CarRent>();
    }

    public void Rent (CarRider rider, Car car, int rentDur){
        if (car.isStatus() == true){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        }
        else {System.out.println("MAAF, MOBIL SUDAH DISEWA");}
    }

    public void info(){
        System.out.println("------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("------------------------");
        for (CarRent y : rentData){
            System.out.println("NAMA PEMINJAM : " + y.getRider().getName());
            System.out.println("TIPE MOBIL    : " + y.getCar().getCarType());
            System.out.println("N0. POLISI    : " + y.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + y.getRentDur());
            System.out.println("------------------------");
        }
    }
}
