package com.example.Models;

import java.sql.Date;

public class RentalAgreement {
    private int customerID;
    private String vinNumber;
    private int employeeID;
    private int rentalAgreementID;
    private double price;
    private Date dateOfAgreement;
    private Date rentalStartdate;
    private Date rentalEnddate;
    private String dropOff;
    private String licensePlate;


    public RentalAgreement(int customerID, String vinNumber, int employeeID, String dropOff, double price, Date dateOfAgreement, Date rentalStartdate, Date rentalEnddate, String licensePlate) {
        this.vinNumber = vinNumber;
        this.employeeID = employeeID;
        this.dropOff = dropOff;
        this.price = price;
        this.dateOfAgreement = dateOfAgreement;
        this.rentalStartdate = rentalStartdate;
        this.rentalEnddate = rentalEnddate;
        this.customerID = customerID;
        this.licensePlate = licensePlate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getRentalAgreementID() {
        return rentalAgreementID;
    }

    public void setRentalAgreementID(int rentalAgreementID) {
        this.rentalAgreementID = rentalAgreementID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfAgreement() {
        return dateOfAgreement;
    }

    public void setDateOfAgreement(Date dateOfAgreement) {
        this.dateOfAgreement = dateOfAgreement;
    }

    public Date getRentalStartdate() {
        return rentalStartdate;
    }

    public void setRentalStartdate(Date rentalStartdate) {
        this.rentalStartdate = rentalStartdate;
    }

    public Date getRentalEnddate() {
        return rentalEnddate;
    }

    public void setRentalEnddate(Date rentalEnddate) {
        this.rentalEnddate = rentalEnddate;
    }

    public String getDropOff() {
        return dropOff;
    }

    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}