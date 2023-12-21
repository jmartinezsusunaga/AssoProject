package entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class UtilisateurEvenementsPKId implements Serializable{

	private int id_utilisateur_ue;
	
	private int id_evenement_ue;

	public UtilisateurEvenementsPKId(int id_utilisateur_ue, int id_evenement_ue) {
		super();
		this.id_utilisateur_ue = id_utilisateur_ue;
		this.id_evenement_ue = id_evenement_ue;
	}
	
	
}
