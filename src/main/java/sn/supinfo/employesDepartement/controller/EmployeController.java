package sn.supinfo.employesDepartement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sn.supinfo.employesDepartement.domain.Employe;
import sn.supinfo.employesDepartement.service.DepartementService;
import sn.supinfo.employesDepartement.service.EmployeService;


@Controller
@RequestMapping("/employes")
public class EmployeController {

	@Autowired
	EmployeService empService;
	
	@Autowired
	DepartementService deptService;
	
	@GetMapping("/liste")
	public String listEmp(Model model) {
		model.addAttribute("listEmp", empService.getAllEmploye());
		return "liste";
	}
	
	@GetMapping("/new")
	public String showeEmpForm(Employe employe,Model model) {
		model.addAttribute("depts", deptService.getAllDepartement());
		return "new-emp";
		
	}
	
	@PostMapping("/add")
	public String addEmp(Employe employe) {
		empService.addEmploye(employe);
		return "redirect:/employes/liste";
	}
	@GetMapping("/edit/{id}")
	public String editEmp(@PathVariable("id") Long id,Model model) {
		model.addAttribute("employe",empService.getEmployeById(id));
		model.addAttribute("depts", deptService.getAllDepartement());
		return "edit-emp" ;
	}
	@PostMapping("/update/{id}")
	public String updateEmp(@PathVariable("id") Long id,Employe employe) {
		empService.addEmploye(employe);
		return "redirect:/employes/liste";
	}
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable("id") Long id, Employe employe) {
		empService.deleteEmploye(employe);
		
		return "redirect:/employes/liste";
	}
}
