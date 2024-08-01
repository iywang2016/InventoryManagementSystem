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

// Data Transfer Object (DTO) class for Products

public class ProductDTO {

    private int prodID, quantity, userID;
    private double costPrice, sellPrice;
    private Double totalCost, totalRevenue;
    private @SqlEvenQuotes String prodCode, prodName, date, suppCode, custCode, custName, brand;

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public @SqlEvenQuotes String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = sanitize(prodCode);
    }

    public @SqlEvenQuotes String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = sanitize(prodName);
    }

    public @SqlEvenQuotes String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = sanitize(date);
    }

    public @SqlEvenQuotes String getSuppCode() {
        return suppCode;
    }

    public void setSuppCode(String suppCode) {
        this.suppCode = sanitize(suppCode);
    }

    public @SqlEvenQuotes String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = sanitize(custCode);
    }

    public @SqlEvenQuotes String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = sanitize(custName);
    }

    public @SqlEvenQuotes String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = sanitize(brand);
    }

    private static @SqlEvenQuotes String sanitize(String userInput) {
        @SuppressWarnings("sqlquotes")
        @SqlEvenQuotes String sanitizedInput = userInput;
        return sanitizedInput;
    }
}
