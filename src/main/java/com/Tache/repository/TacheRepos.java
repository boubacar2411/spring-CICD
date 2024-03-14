package com.Tache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Tache.entity.Tache;
import java.util.List;
import com.Tache.Enum.Statut;

@RepositoryRestResource
public interface TacheRepos extends JpaRepository <Tache, Long> {

	Tache findByNomTache(String nomTache);
	List<Tache> findByStatut(Statut statut);

	
}
