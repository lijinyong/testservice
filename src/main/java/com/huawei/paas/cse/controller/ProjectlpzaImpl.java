package com.huawei.paas.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-28T12:36:02.876Z")

@RestSchema(schemaId = "projectlpza")
@RequestMapping(path = "/controller", produces = MediaType.APPLICATION_JSON)
public class ProjectlpzaImpl {

    @Autowired
    private ProjectlpzaDelegate userProjectlpzaDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectlpzaDelegate.helloworld(name);
    }

}
