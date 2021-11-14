package org.fasttrackit.transfer;

import java.util.Scanner;

public class QuantityFromUserRequest {

    private double quantityXeroxPaper;
    private double quantityMarker;
    private double quantityToner;

    public void askQuantityXeroxPaper() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate the quantity for Xerox Paper (in packages) : ");
        this.quantityXeroxPaper = scanner.nextDouble();
    }

    public double getQuantityXeroxPaper() {
        return quantityXeroxPaper;
    }

    public void setQuantityXeroxPaper(double quantityXeroxPaper) {
        this.quantityXeroxPaper = quantityXeroxPaper;
    }

    public double getQuantityMarker() {
        return quantityMarker;
    }

    public void setQuantityMarker(double quantityMarker) {
        this.quantityMarker = quantityMarker;
    }

    public double getQuantityToner() {
        return quantityToner;
    }

    public void setQuantityToner(double quantityToner) {
        this.quantityToner = quantityToner;
    }
}
