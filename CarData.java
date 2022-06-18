package com.Pemlan;

import java.util.ArrayList;

public class CarData {
    public static ArrayList <Car> carList;
    
    public CarData(){
        carList = new ArrayList<Car>();
    }

    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk));
    }

    public void listOfCar(){
        System.out.println("------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("------------------------");
        for (Car x : carList){
            System.out.println("TIPE MOBIL : " + x.getCarType());
            System.out.println("NO. POLISI : " + x.getPolNum());
            System.out.println("MERK MOBIL : " + x.getMerk());
            System.out.println("------------------------");
        }
    }
}
