package sn.supinfo.employesDepartement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.supinfo.employesDepartement.domain.Departement;
import sn.supinfo.employesDepartement.domain.Employe;
import sn.supinfo.employesDepartement.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService {

	@Autowired
	DepartementRepository deptRepository;
	
	@Override
	public void addDepartement(Departement departement) {
		deptRepository.save(departement);

	}

	@Override
	public Departement getDepartementById(Long id) {
		
		return deptRepository.getById(id);
	}

	@Override
	public List<Departement> getAllDepartement() {
		
		return deptRepository.findAll();
	}
	
	

	@Override
	public void deleteDepartement(Departement departement) {
		
		
		deptRepository.delete(departement);
	}

}
