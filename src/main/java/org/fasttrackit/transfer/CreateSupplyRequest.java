package org.fasttrackit.transfer;

import java.time.LocalDate;

//DTO
public class CreateSupplyRequest {

    private String department;
    private String supplies;
    private double quantityPcsPckgs;
    private double valueRON;
    private LocalDate deliveryDate;

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

    @Override
    public String toString() {
        return "CreateSupplyRequest{" +
                "department='" + department + '\'' +
                ", supplies='" + supplies + '\'' +
                ", quantityPcsPckgs=" + quantityPcsPckgs +
                ", valueRON=" + valueRON +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
