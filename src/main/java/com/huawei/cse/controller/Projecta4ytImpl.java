package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-09-26T07:38:46.498Z")

@RestSchema(schemaId = "projecta4yt")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projecta4ytImpl {

    @Autowired
    private Projecta4ytDelegate userProjecta4ytDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjecta4ytDelegate.helloworld(name);
    }

}
