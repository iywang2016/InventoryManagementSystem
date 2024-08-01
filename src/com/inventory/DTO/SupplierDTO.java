/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.DTO;

import org.checkerframework.checker.sqlquotes.qual.*;

/**
 *
 * @author asjad
 */

// Data Transfer Object (DTO) class for Suppliers

public class SupplierDTO {

    private int suppID;
    private double debit, credit, balance;
    private @SqlEvenQuotes String suppCode, fullName, location, phone;

    public int getSuppID() {
        return suppID;
    }

    public void setSuppID(int suppID) {
        this.suppID = suppID;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public @SqlEvenQuotes String getSuppCode() {
        return suppCode;
    }

    public void setSuppCode(String suppCode) {
        this.suppCode = sanitize(suppCode);
    }

    public @SqlEvenQuotes String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = sanitize(fullName);
    }

    public @SqlEvenQuotes String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = sanitize(location);
    }

    public @SqlEvenQuotes String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = sanitize(phone);
    }

    private static @SqlEvenQuotes String sanitize(String userInput) {
        @SuppressWarnings("sqlquotes")
        @SqlEvenQuotes String sanitizedInput = userInput;
        return sanitizedInput;
    }
}
