package org.fasttrackit.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.fasttrackit.transfer.CreateTaskRequest;

import java.io.BufferedReader;

public class ObjectMapperConfiguration {

    public  static final ObjectMapper objectMapper = new ObjectMapper();

    // static block
    static {
        objectMapper.registerModule(new JavaTimeModule());
    }

    }

