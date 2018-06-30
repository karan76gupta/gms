package com.ie.naukri.rms.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller("/demo")
public class DemoController {

    //@GET
    //@Produces(MediaType.APPLICATION_JSON)
    //@Path("/{checkId}")
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String getData(int id){
       /* TestMessage testMessage= new TestMessage();
        testMessage.setMessage("hello"+id);*/
        return "okk";
    }
}
