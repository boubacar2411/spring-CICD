package com.Tache.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Tache.Enum.Statut;
import com.Tache.entity.Tache;
import com.Tache.service.impl.ServiceImpl;
@RestController
public class TacheController {
@Autowired
private ServiceImpl serviceimp;
@PostMapping("/affecter/{iduser}")
    public ResponseEntity<String>  affecterTache(@PathVariable
    		Long idUser,
    		@RequestParam String nomtache) {
        try {
            serviceimp.affecterTache(idUser, nomtache);
            return new ResponseEntity<>("Tâche affectée avec succès", HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

	 @GetMapping("/recherche")
	 public List<Tache> rechercheParStatut(@RequestParam("statut") Statut statut) {
	        return serviceimp.rechercheParstatut(statut);
	    }
	        
	    
	
}




