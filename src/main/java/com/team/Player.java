package com.team;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by kp0cH4 on 06/04/17.
 */
@Entity
public class Player {

    @Id @GeneratedValue
    Long idPlayer;
    String name;
    String position;

    public Player(){
        super();
    }
    public Player(String name, String position) {
        this();
        this.name = name;
        this.position = position;
    }
    public Long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Long idPlayer) {
        this.idPlayer = idPlayer;
    }
    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
