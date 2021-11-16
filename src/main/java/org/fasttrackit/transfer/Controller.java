package org.fasttrackit.transfer;

import org.fasttrackit.domain.OfficeSupplies;

import java.time.LocalDate;
import java.util.Scanner;

public class Controller {

    public long deletedID;
    public long updatedID;
    public String department;
    public String supplyName;
    public double quantityPcsPckgs;
    public double supplyUnitPrice;
    public double valueRON;
    public double deliveryDate;
    public boolean completed;

    public void askDepartmentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate the name of department which requires the supply materials : ");
        this.department = scanner.nextLine();
    }

    public void askSupplyName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate the name of supply you need: ");
        this.supplyName = scanner.nextLine();
    }

    public void askSupplyQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate the quantity of materials (pieces): ");
        this.quantityPcsPckgs = scanner.nextDouble();
    }

    public void askSupplyUnitPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate the unit price of selected supply material  : ");
        this.supplyUnitPrice = scanner.nextDouble();
    }

    public void askDeliveryDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate the delivery date of supply material (weeks)  : ");
        this.deliveryDate = scanner.nextDouble();
    }

    public void askDeleteId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate the ID of the supply material to be deleted : ");
        this.deletedID = scanner.nextLong();
    }

    public void askUpdateId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please indicate the ID of the supply material to be updated : ");
        this.updatedID = scanner.nextLong();
    }

    public SupplyRequest getRequest() {
//    public void getRequest() {

        Controller controller = new Controller();

        //get department's name
        controller.askDepartmentName();
        String departmentName = controller.department;
        System.out.println("Name of department: " + departmentName);

        //get supply name
        controller.askSupplyName();
        String supplyName = controller.supplyName;
        System.out.println("Name of supply: " + supplyName);

        //get supply quantity
        controller.askSupplyQuantity();
        double quantityPcsPckgs = controller.quantityPcsPckgs;
        System.out.println("Supply quantity: " + quantityPcsPckgs);

        //get supply unit price
        controller.askSupplyUnitPrice();
        double supplyUnitPrice = controller.supplyUnitPrice;
        System.out.println("Supply unit price: " + supplyUnitPrice);

        //get delivery date
        controller.askDeliveryDate();
        long deliveryDate = (long) controller.deliveryDate;
        System.out.println("The supplies will be delivered in : " + deliveryDate + " weeks ");

        //calculate the supply value
        OfficeSupplies officeSupplies = new OfficeSupplies();
        double valueRON = officeSupplies.calculateValueRON(quantityPcsPckgs, supplyUnitPrice);

        SupplyRequest request = new SupplyRequest();
        request.setDepartment(departmentName);
        request.setSupplies(supplyName);
        request.setQuantityPcsPckgs(quantityPcsPckgs);
        request.setQuantityUnitPrice(supplyUnitPrice);
        request.setValueRON(valueRON);
        request.setDeliveryDate(LocalDate.now().plusWeeks(deliveryDate));

        return request;
    }

}
