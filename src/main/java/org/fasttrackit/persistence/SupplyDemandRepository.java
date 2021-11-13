package org.fasttrackit.persistence;

import org.fasttrackit.config.DatabaseConfiguration;
import org.fasttrackit.domain.OfficeSupplies;
import org.fasttrackit.transfer.CreateSupplyRequest;
import org.fasttrackit.transfer.UpdateSupplyRequest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public void updateSupplyDemand(long id, UpdateSupplyRequest request) throws SQLException {
        String sql = "UPDATE supplies SET  value_RON = ?, delivery_date = ?, completed = ?  WHERE id = ? ";

        try (PreparedStatement preparedStatement = DatabaseConfiguration.getConnection().prepareStatement(sql)) {
            preparedStatement.setDouble(1, request.getValueRON());
            preparedStatement.setDate( 2, Date.valueOf(request.getDeliveryDate()));
            preparedStatement.setBoolean(3, request.isCompleted());
            preparedStatement.setLong( 4, id);

            preparedStatement.executeUpdate();
        }
    }

    public List<OfficeSupplies> getSupplies() throws SQLException {
        String sql = " SELECT id, department, supplies, quantity_pcs_pckgs, value_RON, delivery_date, " +
                "completed FROM supplies ";

        List<OfficeSupplies> supplies = new ArrayList<>();

        try (Statement statement = DatabaseConfiguration.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                OfficeSupplies supply = new OfficeSupplies();
                supply.setId(resultSet.getLong("id"));
                supply.setDepartment(resultSet.getString("department"));
                supply.setSupplies(resultSet.getString("supplies"));
                supply.setQuantityPcsPckgs(resultSet.getDouble("quantity_pcs_pckgs"));
                supply.setValueRON((resultSet.getDouble("value_RON")));
                supply.setDeliveryDate(resultSet.getDate("delivery_date").toLocalDate());
                supply.setCompleted(resultSet.getBoolean("completed"));

                supplies.add(supply);
            }
        }
        return supplies;
    }
}
