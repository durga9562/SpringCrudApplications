package com.ojas.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.demo.binding.Team;
import com.ojas.demo.entity.TeamsEntity;
import com.ojas.demo.repositoty.TeamsRepositoy;
@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamsRepositoy teamRepo;
	
	
	@Override
	public boolean saveTeam(Team team) {
		// TODO Auto-generated method stub
		
		TeamsEntity entity=new TeamsEntity();
		BeanUtils.copyProperties(team, entity);
		TeamsEntity savedTeam=teamRepo.save(entity);
		boolean flag=false;
		if(savedTeam!=null)
			flag=true;
		
		return flag;
	}

	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		List<TeamsEntity> getTeams=teamRepo.findAll();
		List<Team> viewTeams=new ArrayList<>();
		for(TeamsEntity te:getTeams) {
			Team t=new Team();
			BeanUtils.copyProperties(te, t);
			viewTeams.add(t);
		}
		return viewTeams;
	}

	@Override
	public Team getTeamById(int id) {
		// TODO Auto-generated method stub
		Optional<TeamsEntity> findById=teamRepo.findById(id);
		TeamsEntity teamEntity=findById.get();
		Team team=new Team();
		BeanUtils.copyProperties(teamEntity, team);
		return team;
	}

	@Override
	public boolean updateTeam(Team st) {
		// TODO Auto-generated method stub
		TeamsEntity tentity=teamRepo.findById(st.getTid()).get();
		BeanUtils.copyProperties(st, tentity);
		TeamsEntity saveTeam=teamRepo.save(tentity);
		if(saveTeam!=null)
			return true;
		return false;
	}

	@Override
	public void deleteTeam(int id) {
		// TODO Auto-generated method stub
		teamRepo.deleteById(id);

	}

}
