/**
 * 
 */
package sn.supinfo.employesDepartement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.supinfo.employesDepartement.domain.Departement;
import sn.supinfo.employesDepartement.domain.Employe;
import sn.supinfo.employesDepartement.repository.EmployeRepository;

@Service
public class EmployeServiceImp implements EmployeService {

	@Autowired
	EmployeRepository empRep;
	
	@Autowired
	DepartementService deptService;
	
	@Override
	public void addEmploye(Employe employe) {
		Departement departement = deptService.getDepartementById(employe.getDepartement().getId());
		if (departement == null) {
			departement = new Departement();
		}
		departement.setNom(employe.getDepartement().getNom());
		departement.setDescription(employe.getDepartement().getDescription());
		employe.setDepartement(departement);
		empRep.save(employe);

	}

	@Override
	public Employe getEmployeById(Long id) {
		
		return empRep.getById(id);
	}

	@Override
	public List<Employe> getAllEmploye() {
		
		return empRep.findAll();
	}

	@Override
	public void deleteEmploye(Employe employe) {
		empRep.delete(employe);

	}

}
