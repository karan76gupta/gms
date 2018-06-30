package com.ie.naukri.rms.services;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ie.naukri.rms.resources.*;
import org.springframework.stereotype.Service;

import java.util.Map;


public class LexService implements RequestHandler<LexRequest, LexResponse> {

    public LexResponse myHandler(LexRequest lexRequest, Context context) {
        context.getLogger().log(lexRequest.getCurrentIntent().getName());
        String appointment = null;
        if (lexRequest.getCurrentIntent().getSlots() !=null){

            Map<String,String> slots = lexRequest.getCurrentIntent().getSlots();
            if (slots.get("AppointmentType")!=null){
                 appointment= slots.get("AppointmentType");
            }
        }

        context.getLogger().log("Reached RMS Lex");
        LexResponse lexResponse = new LexResponse();
        DialogAction dialogAction = new DialogAction();
        dialogAction.setType("Close");
        Message message  = new Message();
        message.setContent("Your Interview is scheduled. :-)  "+appointment);
        message.setContentType("PlainText");
        dialogAction.setMessage(message);
        dialogAction.setFulfillmentState("Fulfilled");
        lexResponse.setDialogAction(dialogAction);
        System.out.println("Hello");
        return lexResponse;
    }

    @Override
    public LexResponse handleRequest(LexRequest lexRequest, Context context) {
        context.getLogger().log(lexRequest.getCurrentIntent().getName());
        String appointment = null;
        if (lexRequest.getCurrentIntent().getSlots() !=null){

            Map<String,String> slots = lexRequest.getCurrentIntent().getSlots();
            if (slots.get("AppointmentType")!=null){
                appointment= slots.get("AppointmentType");
            }
        }

        context.getLogger().log("Reached RMS Lex");
        LexResponse lexResponse = new LexResponse();
        DialogAction dialogAction = new DialogAction();
        dialogAction.setType("Close");
        Message message  = new Message();
        message.setContent("Your Interview is scheduled. :-)  "+appointment);
        message.setContentType("PlainText");
        dialogAction.setMessage(message);
        dialogAction.setFulfillmentState("Fulfilled");
        lexResponse.setDialogAction(dialogAction);
        System.out.println("Hello");
        return lexResponse;
    }
}
