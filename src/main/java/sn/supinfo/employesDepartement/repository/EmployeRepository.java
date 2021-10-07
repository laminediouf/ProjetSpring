package sn.supinfo.employesDepartement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.supinfo.employesDepartement.domain.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
	List<Employe> findAll();
}
