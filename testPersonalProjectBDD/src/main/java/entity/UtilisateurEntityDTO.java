package entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*le Schema name la plus part de fois est public comme valeur*/
@Entity
@Table(name =  "utilisateur", schema = "public")
public class UtilisateurEntityDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_uti;

	@Column(nullable = false)
	private Date date_naissance_uti;
	
	@Column(nullable = false, unique = true, length = 1000)
	private String mdp_uti;
	
	@Column(nullable = false,  length = 100)
	private String nom_uti;
	
	@Column(nullable = false, length = 1000)
	private String prenom_uti;
	
	@Column(nullable = false, unique = true, length = 100)
	private String mail_uti;
	
	@Column(nullable = false, length = 100)
	private String droits_uti;
	
	@Column(nullable = false, unique = true, length = 100)
	private String personnalite_juridique_uti;
	
	@Column(nullable = false, length = 100)
	private String nom_artistique_uti;
	
	@Column(length = 1000)
	private String photo_uti;
	
	@Column(nullable = false, length = 100)
	private String type_poste_association_uti;
	
	@Column(length = 1000)
	private String bio_art;
	
	@Column(length = 1000)
	private String instagram_art;
	
	@Column(length = 1000)
	private String soundCloud_art;

	
	
	
	
	
	
	
	public UtilisateurEntityDTO(Integer id_test, String tes_name_t, Date test_date_t) {
		this.id_test = id_test;
		this.tes_name_t = tes_name_t;
		this.test_date_t = test_date_t;
	}
	
	public UtilisateurEntityDTO() {
	}

	public Integer getId_test() {
		return id_test;
	}

	public void setId_test(Integer id_test) {
		this.id_test = id_test;
	}

	public String getTes_name_t() {
		return tes_name_t;
	}

	public void setTes_name_t(String tes_name_t) {
		this.tes_name_t = tes_name_t;
	}

	public Date getTest_date_t() {
		return test_date_t;
	}

	public void setTest_date_t(Date test_date_t) {
		this.test_date_t = test_date_t;
	}
	
	
	
	
}
