package com.Tache.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Tache.Enum.Statut;
import com.Tache.entity.Tache;
import com.Tache.entity.User;
import com.Tache.repository.TacheRepos;
import com.Tache.repository.UserRepos;

import com.Tache.service.Tacheservice;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl  implements Tacheservice{
@Autowired	
private TacheRepos threpos;
@Autowired
private UserRepos usrepos;
public void affecterTache(Long idUser, String nomtache) {
	 User u=usrepos.findById(idUser).get();
	 Tache t=threpos.findByNomTache(nomtache);
	 if(t!=null){
		 t.setUser(u);
		 threpos.save(t);
	 }
	
}
public List<Tache> rechercheParstatut(Statut statut) {
	  return threpos.findByStatut(statut);
}

	
}
