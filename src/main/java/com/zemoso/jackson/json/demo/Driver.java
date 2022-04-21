package com.zemoso.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String args[]){

        try{
            // create the Object Mapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Read the JSON File and map/convert to Java POJO: data/sample-lite.json
            Student student = objectMapper.readValue(new File("data/sample-full.json"),Student.class);

            // print the Student Details::
            System.out.println(student.toString());






        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
