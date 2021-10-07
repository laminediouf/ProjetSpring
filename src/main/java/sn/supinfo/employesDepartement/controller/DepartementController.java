package sn.supinfo.employesDepartement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sn.supinfo.employesDepartement.domain.Departement;
import sn.supinfo.employesDepartement.service.DepartementService;

@Controller
@RequestMapping("/departements")
public class DepartementController {
	
	@Autowired
	DepartementService deptService;
	
	@GetMapping("/liste")
	public String listDept(Model model) {
		model.addAttribute("listDept", deptService.getAllDepartement());
		return "listDept";
	}
	@GetMapping("/new")
	public String showDeptForm(Departement departement) {
		return "new-dept";
		
	}
	
	@PostMapping("/add")
	public String addDept(Departement departement) {
		deptService.addDepartement(departement);
		return "redirect:/departements/liste";
	}
	@GetMapping("/edit/{id}")
	public String editDept(@PathVariable("id") Long id,Model model) {
		model.addAttribute("departement",deptService.getDepartementById(id));
		return "edit-dept" ;
	}
	@PostMapping("/update/{id}")
	public String updateDept(@PathVariable("id") Long id,Departement departement) {
		deptService.addDepartement(departement);
		return "redirect:/departements/liste";
	}
	@GetMapping("/delete/{id}")
	public String deleteDept(@PathVariable("id") Long id, Departement departement) {
		deptService.deleteDepartement(departement);
		
		return "redirect:/departements/liste";
	}
	
}
