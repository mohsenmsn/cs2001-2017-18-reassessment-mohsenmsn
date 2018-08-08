package com.example.mohen.mpg_calc;

public class Info {
    private String date;
    private int mileage;
    private int fuel;
     public Info(String date, int mileage, int fuel) {
         this.date = date;
         this.mileage = mileage;
         this.fuel = fuel;
     }
    public Integer getMileage() {
         return mileage;
    }
    public Integer fuel() {
        return fuel;
    }
    public String getDate () {
        return date;
    }
}
