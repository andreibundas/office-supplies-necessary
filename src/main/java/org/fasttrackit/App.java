package org.fasttrackit;

import org.fasttrackit.service.SupplyDemandService;

import java.sql.SQLException;


public class App 
{
    public static void main( String[] args ) throws SQLException {

        SupplyDemandService supplyDemandService = new SupplyDemandService();
        supplyDemandService.service();


    }

}
