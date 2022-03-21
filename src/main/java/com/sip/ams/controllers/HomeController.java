
package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody; //unused

import com.sip.ams.entities.Candidat;

@Controller
public class HomeController {
	static ArrayList<Candidat>lc;
	static {
		lc=new ArrayList<>();
		Candidat C1=new Candidat(1,"houria","houria@gmail.com","27876678");
		Candidat C2=new Candidat(2,"Amir","amir@gmail.com","1234567");
		Candidat C3=new Candidat(3,"farah","farah@gmail.com","76589987");
		lc.add(C1);lc.add(C2);lc.add(C3);
	}

	@GetMapping("/index")
//@ResponseBody
	public String home() {
		// return "<h2 align=center > Bienvenue au BootCamp!</h2>";
		return "home/index";
	}

	@GetMapping("/candidats")
	public String listCondidats(Model m) {
		
		

		String formateur = "Med Amine S";
		String libelleFormation = "Spring Boot et angular";
		m.addAttribute("lf", libelleFormation);
		m.addAttribute("trainer", formateur);
		m.addAttribute("tab", lc);
		return "home/candidats";

	}
	@GetMapping("/add")
	public String addCandidate()
	{
		return "home/add";
	}
	
	@PostMapping("/add")
	//@ResponseBody
	public String saveCandidate(@RequestParam("Id") int Id,
			                    @RequestParam("Nom") String Nom,
			                    @RequestParam("Email") String Email,
			                    @RequestParam("Tel") String Tel )
	{
		
		Candidat temp=new Candidat(Id,Nom,Email,Tel);
		lc.add(temp);
		//System.out.println(Id+" "+Nom+" "+Email+" "+Tel);
		//return "infos:"+Id+" "+Nom+" "+Email+" "+Tel;
		return "redirect:candidats";
	}
}
