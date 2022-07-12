package com.ojas.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ojas.demo.binding.Team;
import com.ojas.demo.service.TeamServiceImpl;
@Controller
public class TeamsController {

	@Autowired
	private TeamServiceImpl teamService;
	@RequestMapping("/durga")
	public String loadForm(Model model) {
		Team team=new Team();
		model.addAttribute("team", team);
		return "addteam";
	}
	@RequestMapping("/addTeam")
	public String handleForm(@ModelAttribute("team") Team team,Model model) {
		boolean saveTeam=teamService.saveTeam(team);
		String msg="";
		if(saveTeam) {
			msg="Book Inserted succesFully";
			
		}else {
			msg="Book Not Inserted";
			
		}
		model.addAttribute("msg", msg);
		return "addteam";
	}
	@RequestMapping(value="/viewTeams")
	public String viewAllBooks(Model model) {
		
		List<Team>teamsList=teamService.getAllTeams();
		model.addAttribute("teams", teamsList);
		return "viewTeams";
	}
	@RequestMapping("/editteam")
	public String edit(@RequestParam int id,Model m) {
		Team team=teamService.getTeamById(id);
		m.addAttribute("team", team);
		return "editteam";
	}
	@PostMapping("/editTeam")
	public String editsave(@ModelAttribute("team") Team team,Model model) {
		System.out.println(team.getTid()+"Controller");
		boolean saved=teamService.updateTeam(team);
		String msg="";
		System.out.println("welcome Update"+saved);
		if(saved) {
			msg="updated succesfully";
		}else {
			msg="fail to updated";
			model.addAttribute("msg", msg);
		}
		return "redirect:/viewTeams";
	}
	@GetMapping("/deleteTeam")
	public String deleteById(@RequestParam("id")Integer id,Model model) {
		teamService.deleteTeam(id);
		return "redirect:/viewTeams";
	}
}
