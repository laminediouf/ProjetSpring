package sn.supinfo.employesDepartement.service;

import java.util.List;

import sn.supinfo.employesDepartement.domain.Departement;

public interface DepartementService {

	public void addDepartement(Departement departement);
	public Departement getDepartementById(Long id);
	public List<Departement> getAllDepartement();
	public void deleteDepartement(Departement departement);
}
