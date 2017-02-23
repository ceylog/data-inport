package com.credan.data.inport.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;

/**
 * @Author Sam Wang
 * @Date 2017/2/21.
 * @Version 0.0.1
 */
@Component
@ApplicationPath("/api/v1")
public class JerseyConfiguration extends ResourceConfig {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private ApplicationContext appCtx;

    @PostConstruct
    public void setup() {
        logger.info("Rest classes found:");
        appCtx.getBeansWithAnnotation(Path.class).forEach((name, resource) -> {
            logger.info(" -> {}", resource.getClass().getName());
            register(resource);
        });
    }

}
