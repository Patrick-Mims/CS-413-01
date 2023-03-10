package edu.sfsu.classes;

public class Cars {
    private String make;
    private String model;
    private int year;
    private int odometer;
    public Cars() {
        System.out.println("Please enter the following details for your car...");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int miles) {
        this.odometer= miles;
    }

    public void display() {
       System.out.println(this.getMake());
    }
}
