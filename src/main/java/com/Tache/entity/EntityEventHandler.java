package com.Tache.entity;

import com.Tache.Enum.Statut;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class EntityEventHandler {

    @HandleBeforeCreate
    public void handleEntityCreate(Tache tache) {

        // Définir le statut sur "nouveau" avant de créer l'entité
        tache.setStatut(Statut.Nouvelle);
        tache.getUser();
    }

}
