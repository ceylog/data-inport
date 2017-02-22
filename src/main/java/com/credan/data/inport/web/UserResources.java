package com.credan.data.inport.web;

import com.credan.data.inport.entity.User;
import com.credan.data.inport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Author Sam Wang
 * @Date 2017/2/22.
 * @Version 0.0.1
 */
@Component
@Path("/user")
public class UserResources{

    @Autowired
    private UserService userService;

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUser(){
        return userService.getUsers();
    }

}
