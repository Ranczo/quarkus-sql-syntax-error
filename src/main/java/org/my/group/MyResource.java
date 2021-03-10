package org.my.group;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.OffsetDateTime;

@Path("/bug")
public class MyResource {

    @Inject
    TestRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Test bug() {
        var test = new Test();
        test.from = OffsetDateTime.now();

        repository.persistAndFlush(test);

        return test;
    }
}
