package com.pi;

import com.pi.dao.TeamDao;
import com.team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kp0cH4 on 06/04/17.
 */
@RestController
public class TeamController {

    @Autowired
    TeamDao teamDao;


    @RequestMapping("/teams/{name}")
    public Team hiThere(@PathVariable String name){
        return teamDao.findByName(name);
    }
}
