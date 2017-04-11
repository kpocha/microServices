package com.pi;

import com.pi.dao.TeamDao;
import com.team.Player;
import com.team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroServicesApplication {

    @Autowired TeamDao teamDao;

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesApplication.class, args);
	}

	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charlie Brown", "corredor"));
		players.add(new Player("Franco Bielli", "pitcher"));

		Team team = new Team("San rafael","Peanus","",players);

		teamDao.save(team);

	}



}
