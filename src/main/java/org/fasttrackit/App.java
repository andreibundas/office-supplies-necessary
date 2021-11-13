package org.fasttrackit;

import org.fasttrackit.persistence.SupplyDemandRepository;
import org.fasttrackit.transfer.CreateSupplyRequest;
import org.fasttrackit.transfer.UpdateSupplyRequest;

import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println( "Hello World!" );


        SupplyDemandRepository supplyDemandRepository = new SupplyDemandRepository();

        CreateSupplyRequest request = new CreateSupplyRequest();
//        request.setDepartment("Logistic");
//        request.setSupplies("Toner");
//        request.setQuantityPcsPckgs(1);
//        request.setValueRON(80);
//        request.setDeliveryDate(LocalDate.now().plusWeeks(2));

//        supplyDemandRepository.createSupplyDemand(request);

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
        System.out.println(supplyDemandRepository.getSupplies());
    }

}
