package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name =  "evenements", schema = "public")
public class EvenementsEntityDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_ev;
	
	@Column(nullable = false, length = 100)
	private String nom_ev;
	
	@Column(nullable = false, unique = true, length = 100)
	private String lieu_ev;
	
	@Column(nullable = false, unique = true)
	private Date date_ev;
	
	@Column(nullable = false)
	private Integer capacite_event_ev;
	
	@Column(length = 1000)
	private String visuel_facebook_ev;
	
	@Column(length = 1000)
	private String visuel_insta_poste_ev;
	
	@Column(length = 1000)
	private String visuel_insta_story_ev;

	public EvenementsEntityDTO(Integer id_evenement_mre) {
		super();
		this.id_ev = id_evenement_mre;
	}
	
	public EvenementsEntityDTO() {
		
	}

	public Integer getId_ev() {
		return id_ev;
	}

	public void setId_ev(Integer id_ev) {
		this.id_ev = id_ev;
	}

	public String getNom_ev() {
		return nom_ev; 
	}

	public String getLieu_ev() {
		return lieu_ev;
	}

	public void setLieu_ev(String lieu_ev) {
		this.lieu_ev = lieu_ev;
	}

	public Date getDate_ev() {
		return date_ev;
	}

	public void setDate_ev(Date date_ev) {
		this.date_ev = date_ev;
	}

	public Integer getCapacite_event_ev() {
		return capacite_event_ev;
	}

	public void setCapacite_event_ev(Integer capacite_event_ev) {
		this.capacite_event_ev = capacite_event_ev;
	}

	public String getVisuel_facebook_ev() {
		return visuel_facebook_ev;
	}

	public void setVisuel_facebook_ev(String visuel_facebook_ev) {
		this.visuel_facebook_ev = visuel_facebook_ev;
	}

	public String getVisuel_insta_poste_ev() {
		return visuel_insta_poste_ev;
	}

	public void setVisuel_insta_poste_ev(String visuel_insta_poste_ev) {
		this.visuel_insta_poste_ev = visuel_insta_poste_ev;
	}

	public String getVisuel_insta_story_ev() {
		return visuel_insta_story_ev;
	}

	public void setVisuel_insta_story_ev(String visuel_insta_story_ev) {
		this.visuel_insta_story_ev = visuel_insta_story_ev;
	}
	
	
	
}
