package org.fasttrackit;

import org.fasttrackit.domain.OfficeSupplies;
import org.fasttrackit.domain.SupplyMaterials;
import org.fasttrackit.persistence.SupplyDemandRepository;
import org.fasttrackit.transfer.CreateSupplyRequest;
import org.fasttrackit.transfer.PriceFromUserRequest;
import org.fasttrackit.transfer.QuantityFromUserRequest;

import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println( "Welcome! Please select operation" );

        OfficeSupplies officeSupplies = new OfficeSupplies();

        PriceFromUserRequest priceFromUserRequest = new PriceFromUserRequest();
        priceFromUserRequest.askPriceXeroxPaper();
        QuantityFromUserRequest quantityFromUserRequest = new QuantityFromUserRequest();
        quantityFromUserRequest.askQuantityXeroxPaper();

        double priceXeroxPaper = priceFromUserRequest.priceXeroxPaper;

        double quantityXeroxPaper = quantityFromUserRequest.getQuantityXeroxPaper();

        double valueRONxerox = officeSupplies.calculateValueRON(quantityXeroxPaper,priceXeroxPaper);

        System.out.println("Value of xeroxPaper: " + valueRONxerox);


        SupplyDemandRepository supplyDemandRepository = new SupplyDemandRepository();

        CreateSupplyRequest request = new CreateSupplyRequest();
        request.setDepartment("Sales");
        request.setSupplies("Xerox Paper");
        request.setQuantityPcsPckgs(quantityXeroxPaper);
        request.setValueRON(valueRONxerox);
        request.setDeliveryDate(LocalDate.now().plusWeeks(2));

        supplyDemandRepository.createSupplyDemand(request);

        // delete method
//        supplyDemandRepository.deleteSupplyDemand(1);


        //update method
//        UpdateSupplyRequest requestu = new UpdateSupplyRequest();
//        requestu.setValueRON(55);
//        requestu.setDeliveryDate(LocalDate.now().plusWeeks(2));
//        requestu.setCompleted(true);
//
//        supplyDemandRepository.updateSupplyDemand(2, requestu);


        //read method
//        System.out.println(supplyDemandRepository.getSupplies());




    }

}
