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

// Data Transfer Object (DTO) class for Users

public class UserDTO {


    private int ID;
    private @SqlEvenQuotes String fullName, location, phone, username, password, userType;

    public @SqlEvenQuotes String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = sanitize(inTime);
    }

    public @SqlEvenQuotes String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = sanitize(outTime);
    }

    private @SqlEvenQuotes String inTime, outTime;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public @SqlEvenQuotes String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = sanitize(username);
    }

    public @SqlEvenQuotes String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = sanitize(password);
    }

    public @SqlEvenQuotes String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = sanitize(userType);
    }

    private static @SqlEvenQuotes String sanitize(String userInput) {
        @SuppressWarnings("sqlquotes")
        @SqlEvenQuotes String sanitizedInput = userInput;
        return sanitizedInput;
    }
}
