package com.credan.data.inport.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * @Author Sam Wang
 * @Date 2017/2/21.
 * @Version 0.0.1
 */
@Component
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration(){
        packages("com.credan.data.inport.web");
    }

}
