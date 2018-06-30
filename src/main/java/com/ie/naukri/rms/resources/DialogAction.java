package com.ie.naukri.rms.resources;


public class DialogAction {
    String type;
    String fulfillmentState;
    Message message;

    public Message getMessage() {
        return message;
    }

    public String getFulfillmentState() {
        return fulfillmentState;
    }

    public void setFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
    }

    public void setMessage(Message message) {
        this.message = message;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
