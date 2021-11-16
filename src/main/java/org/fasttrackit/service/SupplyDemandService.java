package org.fasttrackit.service;

import org.fasttrackit.persistence.SupplyDemandRepository;
import org.fasttrackit.transfer.Controller;
import org.fasttrackit.transfer.SupplyRequest;

import java.sql.SQLException;
import java.util.Scanner;

public class SupplyDemandService {

    public void service() throws SQLException {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Office supplies orders program. Please select operation.");

        System.out.println("*************************************");
        System.out.println("Press A. to add supply items");
        System.out.println("*************************************");
        System.out.println("Press V. to view the introduced items ");
        System.out.println("*************************************");
        System.out.println("Press U. to update the introduced items");
        System.out.println("*************************************");
        System.out.println("Press D. to delete the introduced items, by id number");
        System.out.println("*************************************");
        System.out.println("Press E. to Exit");
        System.out.println("*************************************");

        do {
            System.out.println(" **********");
            System.out.println(" Chose an option ");
            System.out.println(" **********");
            option = scanner.next().charAt(0);
            char optionUc = Character.toUpperCase(option);
            SupplyDemandRepository supplyDemandRepository = new SupplyDemandRepository();
            Controller controller = new Controller();

            switch (optionUc) {

                case 'A':

                    SupplyRequest request = controller.getRequest();

                    supplyDemandRepository.createSupplyDemand(request);
                    System.out.println("New supply has been created. ");
                    break;

                case 'V':

                    //        read method
                    System.out.println("Read supplies");
                    System.out.println( "List of registered supply materials: \n "
                            + supplyDemandRepository.getSupplies());
                    break;

                case 'U':

                    controller.askUpdateId();
                    long idUpd = controller.updatedID;

                    SupplyRequest requestUpdate = controller.getRequest();

                    supplyDemandRepository.updateSupplyDemand(idUpd, requestUpdate);
                    System.out.println("Updated supply with id: " + idUpd);
                    break;

                case 'D':
                    //get supply unit price
                    controller.askDeleteId();
                    long id = controller.deletedID;

//                    delete method
                    supplyDemandRepository.deleteSupplyDemand(id);
                    System.out.println("Deleted supply with id: " + id);
                    break;

                case 'E':
                    System.out.println("*************************************");
                    break;

                default:
                    System.out.println("Invalid option! Please try again ! ");
                    break;
            }
        } while (option != 'E');

        System.out.println("Thank you ! Good bye ! ");
        }

}
