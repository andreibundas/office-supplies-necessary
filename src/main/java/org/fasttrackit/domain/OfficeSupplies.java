package org.fasttrackit.domain;

import java.time.LocalDate;

public class OfficeSupplies {

    private long id;
    private String department;
    private String supplyName;
    private double quantityPcsPckgs;
    private double supplyUnitPrice;
    private double valueRON;
    private LocalDate deliveryDate;
    private boolean completed;

    public double calculateValueRON(double quantityPcsPckgs, double supplyPriceUnit ) {
        double valueRON = quantityPcsPckgs * supplyPriceUnit;
        return valueRON;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public double getQuantityPcsPckgs() {
        return quantityPcsPckgs;
    }

    public void setQuantityPcsPckgs(double quantityPcsPckgs) {
        this.quantityPcsPckgs = quantityPcsPckgs;
    }

    public double getValueRON() {
        return valueRON;
    }

    public void setValueRON(double valueRON) {
        this.valueRON = valueRON;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public double getSupplyUnitPrice() {
        return supplyUnitPrice;
    }

    public void setSupplyUnitPrice(double supplyUnitPrice) {
        this.supplyUnitPrice = supplyUnitPrice;
    }

    @Override
    public String toString() {
        return "OfficeSupplies{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", supplyName='" + supplyName + '\'' +
                ", quantityPcsPckgs=" + quantityPcsPckgs +
                ", supplyUnitPrice=" + supplyUnitPrice +
                ", valueRON=" + valueRON +
                ", deliveryDate=" + deliveryDate +
                ", completed=" + completed +
                '}';
    }
}
