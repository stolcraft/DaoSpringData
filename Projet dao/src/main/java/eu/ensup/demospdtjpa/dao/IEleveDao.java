package eu.ensup.demospdtjpa.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import eu.ensup.demospdtjpa.domaine.Eleve;


public interface IEleveDao extends JpaRepository<Eleve, Integer>{
	

}