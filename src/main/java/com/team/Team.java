package com.team;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by kp0cH4 on 06/04/17.
 */
@Entity
//@XmlRootElement //para que me devuelva un xml. Si al link le pongo .json devuelve json. :)
public class Team {

    @Id
    @GeneratedValue
    Long idTeam;

    public Long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    String name;
    String location;
    String mascotte;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="teamId")
    Set<Player> players;

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Team(String name, String location, String mascotte, Set<Player> players) {
        this();
        this.name = name;
        this.location = location;
        this.mascotte = mascotte;
        this.players = players;
    }

    public Team(){
        super();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }
}
