package org.fasttrackit.persistence;

import org.fasttrackit.config.DatabaseConfiguration;
import org.fasttrackit.transfer.CreateSupplyRequest;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DAO ( Data Access Object)
@SuppressWarnings("ALL")
public class SupplyDemandRepository {

    public void createSupplyDemand(CreateSupplyRequest request) throws SQLException {
        String sql = "INSERT INTO supplies (department, supplies, quantity_pcs_pckgs, value_RON, delivery_date) VALUES (?, ?, ?, ?, ?) ";

        try (PreparedStatement preparedStatement = DatabaseConfiguration.getConnection().prepareStatement(sql)) {
            preparedStatement.setString(1, request.getDepartment());
            preparedStatement.setString( 2, request.getSupplies());
            preparedStatement.setDouble( 3, request.getQuantityPcsPckgs());
            preparedStatement.setDouble( 4, request.getValueRON());
            preparedStatement.setDate(5, Date.valueOf(request.getDeliveryDate()));

            preparedStatement.executeUpdate();
        }

    }

    public void deleteSupplyDemand(long id) throws SQLException {
        String sql = "DELETE FROM supplies WHERE id = ? ";

        try (PreparedStatement preparedStatement = DatabaseConfiguration.getConnection().prepareStatement(sql)) {
            preparedStatement.setLong(1, id);

            preparedStatement.executeUpdate();
        }

    }

}
