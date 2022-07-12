package com.ojas.demo.service;

import java.util.List;

import com.ojas.demo.binding.Team;

public interface TeamService {

	
	public boolean saveTeam(Team team);
	public List<Team> getAllTeams();
	public Team getTeamById(int id);
	public boolean updateTeam(Team st);
	public void deleteTeam(int id);
}
