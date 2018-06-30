package com.ie.naukri.rms.resources;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LexRequest {
    public CurrentIntent currentIntent;
    public Bot bot;
    public String userId;
    public String inputTranscript;
    public String invocationSource;
    public String outputDialogMode;
    public String messageVersion;
    public SessionAttributes sessionAttributes;
    public RequestAttributes requestAttributes;

    public CurrentIntent getCurrentIntent() {
        return currentIntent;
    }

    public void setCurrentIntent(CurrentIntent currentIntent) {
        this.currentIntent = currentIntent;
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInputTranscript() {
        return inputTranscript;
    }

    public void setInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
    }

    public String getInvocationSource() {
        return invocationSource;
    }

    public void setInvocationSource(String invocationSource) {
        this.invocationSource = invocationSource;
    }

    public String getOutputDialogMode() {
        return outputDialogMode;
    }

    public void setOutputDialogMode(String outputDialogMode) {
        this.outputDialogMode = outputDialogMode;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public SessionAttributes getSessionAttributes() {
        return sessionAttributes;
    }

    public void setSessionAttributes(SessionAttributes sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    public RequestAttributes getRequestAttributes() {
        return requestAttributes;
    }

    public void setRequestAttributes(RequestAttributes requestAttributes) {
        this.requestAttributes = requestAttributes;
    }
}
