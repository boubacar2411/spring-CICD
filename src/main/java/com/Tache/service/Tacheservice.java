package com.Tache.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Tache.Enum.Statut;
import com.Tache.entity.Tache;

public interface Tacheservice {
	public void affecterTache(Long idUser, String nomtache);
	List<Tache> rechercheParstatut(Statut statut);
	  
}
