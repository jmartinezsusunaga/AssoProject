package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.List;

/*Pour chaque caractère en Java on va avoir besoin deux octes en BDD, c'est pour cela que les length's sont égales à la moitié*/
/* Un schema c'est une route logique qui sert à diviser plans de BDD, par exemple, tables sur un shema utilisateur et administrteur
 * */
@Entity
@Table(name =  "evenements", schema = "public")
/* Je crée une class qui va gerer mes clés composées "UtilisateurEvenementsPKId"
 * */
@IdClass(UtilisateurEvenementsPKId.class)
public class UtilisateurEvenementsEntity {

	@Id
	private Integer id_utilisateur_ue;
	
	@Id
	private Integer id_evenement_ue;
	
	@Column(nullable = false, unique = true, length = 50)
	private Date heure_passage_ue;
	
	@Column(nullable = false, unique = true)
	private Integer visuel_artiste_ue;
	
	public UtilisateurEvenementsEntity() {
		
	}

	public Integer getId_utilisateur_ue() {
		return id_utilisateur_ue;
	}

	public void setId_utilisateur_ue(Integer id_utilisateur_ue) {
		this.id_utilisateur_ue = id_utilisateur_ue;
	}

	public Integer getId_evenement_ue() {
		return id_evenement_ue;
	}

	public void setId_evenement_ue(Integer id_evenement_ue) {
		this.id_evenement_ue = id_evenement_ue;
	}

	public Date getHeure_passage_ue() {
		return heure_passage_ue;
	}

	public void setHeure_passage_ue(Date heure_passage_ue) {
		this.heure_passage_ue = heure_passage_ue;
	}

	public Integer getVisuel_artiste_ue() {
		return visuel_artiste_ue;
	}

	public void setVisuel_artiste_ue(Integer visuel_artiste_ue) {
		this.visuel_artiste_ue = visuel_artiste_ue;
	}

	
	
}
