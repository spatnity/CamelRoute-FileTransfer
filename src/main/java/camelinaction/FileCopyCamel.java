package camelinaction;
import java.io.File;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopyCamel extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("file:data/inbox?noop=true")
        .log("File copied via camel")
        .to("file:data/outbox");
    }

}
