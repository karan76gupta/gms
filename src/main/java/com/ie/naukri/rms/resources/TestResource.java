/**
 * Copyright (C) InfoEdge (India) Limited - All Rights Reserved. Unauthorized copying of this file, via any medium is
 * strictly prohibited. Proprietary and confidential.
 * <p>
 * Written by Amit Kumar<kumar.amit@naukri.com>.
 */
package com.ie.naukri.rms.resources;

import com.ie.naukri.rms.services.TestService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;

/**
 * TestResource
 *
 * @author Amit Kumar<kumar.amit@naukri.com>
 *
 * @created 28-Oct-2016 3:02:21 PM
 */
@Path("/test")
public class TestResource {

    @Inject
    private TestService testService;

    @Context
    private UriInfo uriInfo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response getTestMessageById(@PathParam("id") final int id) {
      /*  final TestMessage testMessage = new TestMessage("Message" + id);
        return Response.ok(testMessage).build();*/
      return null;
    }

   /* @PATCH
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response patchTestMessage(@PathParam("id") final int id, String patchInput) {
        final TestMessage currentTestMessage = (TestMessage) getTestMessageById(id).getEntity();
        //final TestMessage patchedTestMessage = JsonObjectPatcher.patchObject(currentTestMessage, patchInput);

        return Response.ok(null).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTestMessage() {
        final TestMessage testMessage = testService.fetchTestMessage();
        return Response.ok(testMessage).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postTestMessage(final TestMessage testMessage) {
        // Get message id. Ideally, in post call, you will save data into database and get unique id.
        final int messageId = testMessage.getMessage().hashCode();

        // Add a response header with name "Location" and value as GET url for this newly created message
        final URI location = this.uriInfo.getAbsolutePathBuilder().path(Integer.toString(messageId)).build();
        return Response.created(location).build();
    }*/

}
