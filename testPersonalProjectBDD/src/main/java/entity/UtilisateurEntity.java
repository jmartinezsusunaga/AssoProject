package entity;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*le Schema name la plus part de fois est public comme valeur*/
@Entity
@Table(name =  "utilisateur", schema = "public")
public class UtilisateurEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_uti;

	@Column(nullable = false)
	private Date date_naissance_uti;
	
	@Column(nullable = false, unique = true, length = 128)
	private String mdp_uti;
	
	@Column(nullable = false,  length = 50)
	private String nom_uti;
	
	@Column(nullable = false, length = 50)
	private String prenom_uti;
	
	@Column(nullable = false, unique = true, length = 50)
	private String mail_uti;
	
	@Column(nullable = false, length = 25)
	private String droits_uti;
	
	@Column(nullable = false, unique = true, length = 25)
	private String personnalite_juridique_uti;
	
	@Column(nullable = false, length = 25)
	private String nom_artistique_uti;
	
	@Column(length = 500)
	private String photo_uti;
	
	@Column(nullable = false, length = 25)
	private String type_poste_association_uti;
	
	@Column(length = 500)
	private String bio_art;
	
	@Column(length = 500)
	private String lien_instagram_art;

	@Column(length = 500)
	private String lien_soundCloud_art;

	@Column(length = 500)
	private String lien_facebook_art;

	@Column(length = 500)
	private String lien_spotify_art;
	
	@Column(length = 500)
	private String lien_youtube_art;
	
	@Column(length = 500)
	private String logo_ass_art;
	
	UtilisateurEntity(Integer id_uti){
			super();
			this.id_uti = id_uti;
		}
	
	UtilisateurEntity(){
		
	}

	public Integer getId_uti() {
		return id_uti;
	}

	public void setId_uti(Integer id_uti) { 
		this.id_uti = id_uti;
	}

	public Date getDate_naissance_uti() {
		return date_naissance_uti;
	}

	public void setDate_naissance_uti(Date date_naissance_uti) {
		this.date_naissance_uti = date_naissance_uti;
	}

	public String getMdp_uti() {
		return mdp_uti;
	}

	public void setMdp_uti(String mdp_uti) {
		this.mdp_uti = mdp_uti;
	}

	public String getNom_uti() {
		return nom_uti;
	}

	public void setNom_uti(String nom_uti) {
		this.nom_uti = nom_uti;
	}

	public String getPrenom_uti() {
		return prenom_uti;
	}

	public void setPrenom_uti(String prenom_uti) {
		this.prenom_uti = prenom_uti;
	}

	public String getMail_uti() {
		return mail_uti;
	}

	public void setMail_uti(String mail_uti) {
		this.mail_uti = mail_uti;
	}

	public String getDroits_uti() {
		return droits_uti;
	}

	public void setDroits_uti(String droits_uti) {
		this.droits_uti = droits_uti;
	}

	public String getPersonnalite_juridique_uti() {
		return personnalite_juridique_uti;
	}

	public void setPersonnalite_juridique_uti(String personnalite_juridique_uti) {
		this.personnalite_juridique_uti = personnalite_juridique_uti;
	}

	public String getNom_artistique_uti() {
		return nom_artistique_uti;
	}

	public void setNom_artistique_uti(String nom_artistique_uti) {
		this.nom_artistique_uti = nom_artistique_uti;
	}

	public String getPhoto_uti() {
		return photo_uti;
	}

	public void setPhoto_uti(String photo_uti) {
		this.photo_uti = photo_uti;
	}

	public String getType_poste_association_uti() {
		return type_poste_association_uti;
	}

	public void setType_poste_association_uti(String type_poste_association_uti) {
		this.type_poste_association_uti = type_poste_association_uti;
	}

	public String getBio_art() {
		return bio_art;
	}

	public void setBio_art(String bio_art) {
		this.bio_art = bio_art;
	}


	public String getLien_instagram_art() {
		return lien_instagram_art;
	}

	public void setLien_instagram_art(String lien_instagram_art) {
		this.lien_instagram_art = lien_instagram_art;
	}

	public String getLien_soundCloud_art() {
		return lien_soundCloud_art;
	}

	public void setLien_soundCloud_art(String lien_soundCloud_art) {
		this.lien_soundCloud_art = lien_soundCloud_art;
	}

	public String getLien_youtube_art() {
		return lien_youtube_art;
	}

	public void setLien_youtube_art(String lien_youtube_art) {
		this.lien_youtube_art = lien_youtube_art;
	}

	public String getLogo_ass_art() {
		return logo_ass_art;
	}

	public void setLogo_ass_art(String logo_ass_art) {
		this.logo_ass_art = logo_ass_art;
	}
	
	public String getLien_facebook_art() {
		return this.lien_facebook_art;
	}
	
	public void setLien_facebook_art(String lien_facebook_art) {
		this.lien_facebook_art = lien_facebook_art;
	}

	public String getLien_spotify_art() {
		return lien_spotify_art;
	}

	public void setLien_spotify_art(String lien_spotify_art) {
		this.lien_spotify_art = lien_spotify_art;
	}
	
	@ManyToOne(targetEntity = UtilisateurEvenementsEntity.class)
	 private List<UtilisateurEvenementsEntity> utilisateurEvents;

	/*Many-to-Many Relationship with spring data rest
	
	public String getLien_facebook_art() {
		return lien_facebook_art;
	}

	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Utilisateur_evenemments", 
      joinColumns = @JoinColumn(name = "id_uti", referencedColumnName = "id_uti"), 
      inverseJoinColumns = @JoinColumn(name = "id_ev", referencedColumnName = "id_ev"))
	private Collection<EvenementsEntity> events;
	*/
	
	/*TODO : ajouter les relations entre mes class Java Utilisateur-utilisateruEvenement*/
}
