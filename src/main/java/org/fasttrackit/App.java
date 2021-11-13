package org.fasttrackit;

import org.fasttrackit.persistence.SupplyDemandRepository;
import org.fasttrackit.transfer.CreateSupplyRequest;

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
        request.setDepartment("Logistic");
        request.setSupplies("Toner");
        request.setQuantityPcsPckgs(1);
        request.setValueRON(80);
        request.setDeliveryDate(LocalDate.now().plusWeeks(2));

//        supplyDemandRepository.createSupplyDemand(request);

        supplyDemandRepository.deleteSupplyDemand(1);



    }

}
