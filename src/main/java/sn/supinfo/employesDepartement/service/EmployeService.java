package sn.supinfo.employesDepartement.service;

import java.util.List;

import sn.supinfo.employesDepartement.domain.Employe;

public interface EmployeService {

	public void addEmploye(Employe employe);
	
	public Employe getEmployeById (Long id);
	
	public List<Employe> getAllEmploye();
	
	public void deleteEmploye(Employe employe);
}
