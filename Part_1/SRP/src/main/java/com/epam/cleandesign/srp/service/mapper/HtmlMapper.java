package com.epam.cleandesign.srp.service.mapper;

import com.epam.cleandesign.srp.bean.Employee;

import java.util.List;

public class HtmlMapper<T extends Employee> {

    public synchronized String getAllEmployeesAsHtml(List<T> employees) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>").append("<tr><th>Employee</th><th>Position</th></tr>");
        for (Employee employee : employees) {
            builder.append("<tr><td>").append(employee.getFirstName()).append(" ").append(employee.getLastName())
                    .append("</td><td>").append(employee.getSeniority()).append(" ").append(employee.getRole())
                    .append("</td></tr>");
        }
        builder.append("</table>");

        return builder.toString();
    }

}
