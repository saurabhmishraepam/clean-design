package com.epam.cleandesign.srp;


import com.epam.cleandesign.srp.bean.Email;
import com.epam.cleandesign.srp.bean.Employee;
import com.epam.cleandesign.srp.service.EmailNotificationService;
import com.epam.cleandesign.srp.service.EmployeeService;
import com.epam.cleandesign.srp.service.mapper.HtmlMapper;
import com.epam.cleandesign.srp.service.mapper.JSONMapper;

import java.sql.Connection;
import java.util.*;

public final class EmployeeManager {

    private EmailNotificationService emailNotification;
    private EmployeeService employeeService;
    private JSONMapper jsonMapper;
    private HtmlMapper htmlMapper;

    public EmployeeManager(Connection connection){
        emailNotification =new EmailNotificationService();
        employeeService =new EmployeeService(connection);
        jsonMapper=new JSONMapper();
        htmlMapper=new HtmlMapper<Employee>();
    }
    public void sendEmployeesReport() {
        String emailSubject= "Employees report";
        Email email =new Email("abcd@gmail.com", "web@gmail.com", emailSubject, getAllEmployeesAsHtml());
        emailNotification.sendEmail(email);
    }
    private synchronized String getAllEmployeesAsHtml() {
        return htmlMapper.getAllEmployeesAsHtml(readEmployees());
    }
    public synchronized String employeesAsJson() {
     return jsonMapper.getAsString(readEmployees());
    }
    private List<Employee> readEmployees() {
        return employeeService.readEmployees();
    }
}
