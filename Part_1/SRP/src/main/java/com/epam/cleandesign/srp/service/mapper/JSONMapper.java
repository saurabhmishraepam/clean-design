package com.epam.cleandesign.srp.service.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JSONMapper {
    public synchronized String getAsString(List list) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(list);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
