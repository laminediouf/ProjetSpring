package sn.supinfo.employesDepartement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.supinfo.employesDepartement.domain.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
