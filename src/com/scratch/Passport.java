package com.scratch;

import java.time.LocalDate;

public class Passport {
    private double passportnumber;
    private LocalDate IssueDate;
    private LocalDate ExpireDate;
    private String Country;
    Passport(){
        
    }
    Passport(int passportnumber,LocalDate IssueDate,LocalDate ExpireDate,String Country) {
        this.passportnumber=passportnumber;
        this.IssueDate=IssueDate;
        this.ExpireDate=ExpireDate;
        this.Country=Country;
        
    }
    void setPassportnumber(double passportnumber) {
        this.passportnumber=passportnumber;
    }
    void setIssueDate(LocalDate IssueDate) {
        this.IssueDate=IssueDate;
    }
    void setExpireDate(LocalDate ExpireDate) {
        this.ExpireDate=ExpireDate;
    }
    void setCountry(String Country) {
        this.Country=Country;
    }
    double getPassportnumber() {
        return this.passportnumber;
    }
    LocalDate getIssueDate() {
        return this.IssueDate;
    }
    LocalDate getExpireDate() {
        return this.ExpireDate;
    }
}
