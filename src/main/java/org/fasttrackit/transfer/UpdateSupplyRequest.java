package org.fasttrackit.transfer;

import java.time.LocalDate;

public class UpdateSupplyRequest {


    private boolean completed;
    private LocalDate deliveryDate;
    private double valueRON;

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getValueRON() {
        return valueRON;
    }

    public void setValueRON(double valueRON) {
        this.valueRON = valueRON;
    }

    @Override
    public String toString() {
        return "UpdateSupplyRequest{" +
                "completed=" + completed +
                ", deliveryDate=" + deliveryDate +
                ", valueRON=" + valueRON +
                '}';
    }
}
