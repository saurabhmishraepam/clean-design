package com.epam.cleandesign.srp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;

public class EmployeeService {

    private Connection connection;
    private CaheService caheService;
    public EmployeeService(Connection connection){
        this.connection=connection;
        caheService=new CaheService();
    }

    public List<Employee> readEmployees() {
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery("SELECT * FROM Employees")) {

                while (resultSet.next()) {

                    Employee employee = new Employee();

                    String firstName = resultSet.getString("FIRST_NAME");
                    String lastName = resultSet.getString("LAST_NAME");
                    String role = resultSet.getString("ROLE");
                    String seniority = resultSet.getString("SENIORITY");

                    employee.setFirstName(firstName);
                    employee.setLastName(lastName);
                    employee.setRole(EmployeeRole.valueOf(role));
                    employee.setSeniority(EmployeeSeniority.valueOf(seniority));
                    caheService.addToCache(employee);
                }
            } catch (SQLException e) {
                throw new IllegalStateException(e);
            }
        return caheService.getCache();
    }


}
