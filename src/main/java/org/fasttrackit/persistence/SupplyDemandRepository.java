package org.fasttrackit.persistence;

import org.fasttrackit.config.DatabaseConfiguration;
import org.fasttrackit.domain.OfficeSupplies;
import org.fasttrackit.transfer.SupplyRequest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//DAO ( Data Access Object)
@SuppressWarnings("ALL")
public class SupplyDemandRepository {

    public void createSupplyDemand(SupplyRequest request) throws SQLException {
        String sql = "INSERT INTO supplies (department, supplies, quantity_pcs_pckgs, quantity_unit_price, " +
                "value_RON, delivery_date) VALUES (?, ?, ?, ?, ?, ?) ";

        try (PreparedStatement preparedStatement = DatabaseConfiguration.getConnection().prepareStatement(sql)) {
            preparedStatement.setString(1, request.getDepartment());
            preparedStatement.setString( 2, request.getSupplies());
            preparedStatement.setDouble( 3, request.getQuantityPcsPckgs());
            preparedStatement.setDouble( 4, request.getQuantityUnitPrice());
            preparedStatement.setDouble( 5, request.getValueRON());
            preparedStatement.setDate(6, Date.valueOf(request.getDeliveryDate()));

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

    public void updateSupplyDemand(long id, SupplyRequest request) throws SQLException {
        String sql = "UPDATE supplies SET department = ?, supplies = ?, quantity_pcs_pckgs = ?, quantity_unit_price = ?, value_RON = ?, delivery_date = ?  WHERE id = ? ";

        try (PreparedStatement preparedStatement = DatabaseConfiguration.getConnection().prepareStatement(sql)) {
            preparedStatement.setString(1, request.getDepartment());
            preparedStatement.setString( 2, request.getSupplies());
            preparedStatement.setDouble( 3, request.getQuantityPcsPckgs());
            preparedStatement.setDouble( 4, request.getQuantityUnitPrice());
            preparedStatement.setDouble( 5, request.getValueRON());
            preparedStatement.setDate( 6, Date.valueOf(request.getDeliveryDate()));
            preparedStatement.setLong( 7, id);

            preparedStatement.executeUpdate();
        }
    }

    public List<OfficeSupplies> getSupplies() throws SQLException {
        String sql = " SELECT id, department, supplies, quantity_pcs_pckgs, quantity_unit_price, value_RON, delivery_date, " +
                "completed FROM supplies ";

        List<OfficeSupplies> supplies = new ArrayList<>();

        try (Statement statement = DatabaseConfiguration.getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                OfficeSupplies supply = new OfficeSupplies();
                supply.setId(resultSet.getLong("id"));
                supply.setDepartment(resultSet.getString("department"));
                supply.setSupplyName(resultSet.getString("supplies"));
                supply.setQuantityPcsPckgs(resultSet.getDouble("quantity_pcs_pckgs"));
                supply.setSupplyUnitPrice(resultSet.getDouble("quantity_unit_price"));
                supply.setValueRON((resultSet.getDouble("value_RON")));
                supply.setDeliveryDate(resultSet.getDate("delivery_date").toLocalDate());
                supply.setCompleted(resultSet.getBoolean("completed"));

                supplies.add(supply);
            }
        }
        return supplies;
    }
}
