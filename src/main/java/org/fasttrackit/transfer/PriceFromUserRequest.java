package org.fasttrackit.transfer;

import org.fasttrackit.domain.SupplyMaterials;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PriceFromUserRequest {

    public double priceXeroxPaper;
    public double priceOfMarker;
    public double priceOfToner;


    public void askPriceXeroxPaper() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please indicate the price of xerox paper / package : ");
        this.priceXeroxPaper = scanner.nextDouble();
    }

}
