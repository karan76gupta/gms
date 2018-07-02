package com.ie.naukri.rms.services;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ie.naukri.rms.resources.*;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.apache.http.HttpHeaders.USER_AGENT;


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
        String requirementId = null;
        String candidateMailId= null;
        String date = null;
        String time = null;
        String clientId = "168613";
        String recruiterId = "9876854";
        if (lexRequest.getCurrentIntent().getSlots() !=null){
            Map<String,String> slots = lexRequest.getCurrentIntent().getSlots();
            if (slots !=null && slots.get("AppointmentType")!=null){
                appointment = slots.get("AppointmentType");
                requirementId =slots.get("ProjectId");
                candidateMailId = slots.get("CandidateMail");
                date = slots.get("Date");
                time = slots.get("Time");
            }
        }
        try {
            sendParametersToRMS(clientId,recruiterId,appointment,requirementId,candidateMailId,date,time);
        } catch (IOException e) {
            e.printStackTrace();
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
    public void sendParametersToRMS(String clientId,String recruiterId,String interviewType,String requirementName,String candidateMailId,
                                    String date,String time) throws IOException {

        String url = "http://csm.dev.30381.cluster.infoedge.com/restApi/fetchCsmSearchParam";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", USER_AGENT);
        post.setHeader("AppId","1");
        post.setHeader("SystemId","HM");
        post.setHeader("Content-Type","application/json");
        post.setHeader("Accept","application/json");
        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("client", clientId));
        urlParameters.add(new BasicNameValuePair("recruiterId", recruiterId));
        urlParameters.add(new BasicNameValuePair("interviewType", interviewType));
        urlParameters.add(new BasicNameValuePair("projectName", requirementName));
        urlParameters.add(new BasicNameValuePair("email", candidateMailId));
        urlParameters.add(new BasicNameValuePair("date", date));
        urlParameters.add(new BasicNameValuePair("time", time));

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());



    }
}
