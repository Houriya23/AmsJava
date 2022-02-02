
package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody; //unused

import com.sip.ams.entities.Candidat;

@Controller
public class HomeController {

	@GetMapping("/index")
//@ResponseBody
	public String home() {
		// return "<h2 align=center > Bienvenue au BootCamp!</h2>";
		return "home/index";
	}

	@GetMapping("/candidats")
	public String listCondidats(Model m) {
		Candidat C1=new Candidat(1,"houria","houria@gmail.com","27876678");
		Candidat C2=new Candidat(2,"Amir","amir@gmail.com","1234567");
		Candidat C3=new Candidat(3,"farah","farah@gmail.com","76589987");
		Candidat tab[]=new Candidat[3];
		tab[0]=C1;
		tab[1]=C2;
		tab[2]=C3;

		String formateur = "Med Amine S";
		String libelleFormation = "Spring Boot et angular";
		m.addAttribute("lf", libelleFormation);
		m.addAttribute("trainer", formateur);
		m.addAttribute("tab", tab);
		return "home/candidats";

	}
	@GetMapping("/add")
	public String addCandidate()
	{
		return "home/add";
	}
}
