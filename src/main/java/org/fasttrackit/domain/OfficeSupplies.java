package org.fasttrackit.domain;

import java.time.LocalDate;

public class OfficeSupplies {

    private double id;
    private String department;
    private String supplies;
    private double quantityPcsPckgs;
    private double valueRON;
    private LocalDate deliveryDate;
    private boolean completed;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSupplies() {
        return supplies;
    }

    public void setSupplies(String supplies) {
        this.supplies = supplies;
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

    @Override
    public String toString() {
        return "Supplies{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", supplies='" + supplies + '\'' +
                ", quantityPcsPckgs=" + quantityPcsPckgs +
                ", valueRON=" + valueRON +
                ", deliveryDate=" + deliveryDate +
                ", completed=" + completed +
                '}';
    }
}
