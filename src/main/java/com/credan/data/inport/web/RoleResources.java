package com.credan.data.inport.web;

import com.credan.data.inport.dao.AuthMapper;
import com.credan.data.inport.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Author Sam Wang
 * @Date 2017/2/23.
 * @Version 0.0.1
 */
@Component
@Path("/role")
public class RoleResources {

    @Autowired
    private AuthMapper authMapper;

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Role> getRoles(@FormParam("accountId") String accountId){
        return authMapper.getRolesByAccountId(accountId);
    }

}
