package com.pi.dao;

import com.team.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by kp0cH4 on 06/04/17.
 */
public interface TeamDao extends CrudRepository<Team,Long>{

    List<Team> findAll();
    //Convention findBy<field><operation>
    //operation = eq, Lt, Gt,Like,Between, etc
    Team findByName(String name);
}
