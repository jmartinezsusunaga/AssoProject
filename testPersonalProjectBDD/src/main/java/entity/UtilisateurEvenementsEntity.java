package entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/*Pour chaque caractère en Java on va avoir besoin deux octes en BDD, c'est pour cela que les length's sont égales à la moitié*/
/* Un schema c'est une route logique qui sert à diviser plans de BDD, par exemple, tables sur un shema utilisateur et administrteur
 * */
@Entity
@Table(name =  "utilisateur_evenemments", schema = "public")
/* Je crée une class qui va gerer mes clés composées "UtilisateurEvenementsPKId"
 * */
//@IdClass(UtilisateurEvenementsPKId.class)
public class UtilisateurEvenementsEntity {

	/*TODO : Clarifier le type de recherche (La recherche ensemble se fait avec @EmbeddedId 
	 * et @Id c'est individuelle de chaque clé )*/
	/*TODO: contructeur */
	@EmbeddedId
	private UtilisateurEvenementsPKId id ;
	
	@Column(nullable = false, unique = true, length = 50)
	private Date heure_passage_ue;
	
	@Column(nullable = false, unique = true)
	private Integer visuel_artiste_ue;
	
	public UtilisateurEvenementsEntity() {
		
	}

	public UtilisateurEvenementsPKId getId() {
		return id;
	}

	public void setId(UtilisateurEvenementsPKId id) {
		this.id = id;
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

	@ManyToOne(cascade = CascadeType.ALL)
	private EvenementEntity evenementEntity;
	@ManyToOne(cascade = CascadeType.ALL)
	private UtilisateurEntity utilisateurEntity;
	

	/*DONE : ajouter les relations entre mes class Java Evenement-utilisateruEvenement*/
	/*DONE : ajouter les relations entre mes class Java Utilisateur-utilisateruEvenement*/
	/*TODO: changer les integers pour long pas sur la BDD juste au niveau de java*/

	
}
