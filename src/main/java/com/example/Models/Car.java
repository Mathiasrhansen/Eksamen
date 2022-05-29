package com.example.Models;

public class Car {
private String carModel;
private String brand;
private int carbonEmission;
private double registrationCost;
private String equipmentLevel;
private Boolean isRented;
private Boolean isSold;
private Boolean isDamaged;
private String chassisNumber;
private String vinNumber;


    public Car(String carModel, String brand, int carbonEmission, double registrationCost, String equipmentLevel, Boolean isRented, Boolean isSold, Boolean isDamaged, String chassisNumber, String vinNumber) {
        this.carModel = carModel;
        this.brand = brand;
        this.carbonEmission = carbonEmission;
        this.registrationCost = registrationCost;
        this.equipmentLevel = equipmentLevel;
        this.isRented = isRented;
        this.isSold = isSold;
        this.isDamaged = isDamaged;
        this.chassisNumber = chassisNumber;
        this.vinNumber = vinNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarbonEmission() {
        return carbonEmission;
    }

    public void setCarbonEmission(int carbonEmission) {
        this.carbonEmission = carbonEmission;
    }

    public double getRegistrationCost() {
        return registrationCost;
    }

    public void setRegistrationCost(double registrationCost) {
        this.registrationCost = registrationCost;
    }

    public String getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(String equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public Boolean getRented() {
        return isRented;
    }

    public void setRented(Boolean rented) {
        isRented = rented;
    }

    public Boolean getSold() {
        return isSold;
    }

    public void setSold(Boolean sold) {
        isSold = sold;
    }

    public Boolean getDamaged() {
        return isDamaged;
    }

    public void setDamaged(Boolean damaged) {
        isDamaged = damaged;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", brand='" + brand + '\'' +
                ", carbonEmission=" + carbonEmission +
                ", registrationCost=" + registrationCost +
                ", equipmentLevel='" + equipmentLevel + '\'' +
                ", isRented=" + isRented +
                ", isSold=" + isSold +
                ", isDamaged=" + isDamaged +
                ", chassisNumber='" + chassisNumber + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                '}';
    }
}
// OBS - VIN number indeholder både tal og bogstaver
 /* @Override
  public int compareTo(Car second) {
        if(this.getVinNumber() > second.getVinNumber())
        return 1;
    else if(this.getVinNumber() < second.getVinNumber())
        return -1;
    else return 0;
    }
*/

