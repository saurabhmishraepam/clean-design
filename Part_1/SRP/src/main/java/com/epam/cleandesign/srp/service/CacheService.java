package com.epam.cleandesign.srp.service;

import com.epam.cleandesign.srp.bean.Employee;

import java.util.ArrayList;
import java.util.List;

public class CaheService {

    private List<Employee> emaployeeCache = new ArrayList<>();;

    public synchronized List<Employee> getCache(){
        return emaployeeCache;
    }
    public synchronized void addToCache(Employee emp){
         emaployeeCache.add(emp);
    }


}
