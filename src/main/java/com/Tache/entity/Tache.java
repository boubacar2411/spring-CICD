package com.Tache.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.Tache.Enum.Statut;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.Tache.Enum.Statut.Nouvelle;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tache {
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTache;
	private String nomTache;
	private String description;
	private Date  dateEcheance;
    @Enumerated(EnumType.STRING)
	private Statut statut;
	private String commentaire;
	@ManyToOne
	@JoinColumn(name = "listaches")
    private User user;
	public Long getIdTache() {
		return idTache;
	}
	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}
	public String getNomTache() {
		return nomTache;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public Statut getStatut() {
		return statut;
	}
	public void setStatus(Statut statut) {
		this.statut = statut;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public User getUser() {
		return user;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public void setNomTache(String nomTache) {
		this.nomTache = nomTache;
	}
	public void setUser(User user) {
		this.user = user;
		
	}


}

	

