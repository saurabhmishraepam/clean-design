package com.epam.cleandesign.srp.service;

import com.epam.cleandesign.srp.bean.Employee;

import java.util.ArrayList;
import java.util.List;

public class CacheService {

    private List<Employee> employeeCache = new ArrayList<>();;

    public synchronized List<Employee> getCache(){
        return employeeCache;
    }
    public synchronized void addToCache(Employee emp){
        employeeCache.add(emp);
    }


}
