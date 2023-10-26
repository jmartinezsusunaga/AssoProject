package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =  "test_2", schema = "public")
public class membreEntityDTO {

	@Id
	private Integer id_evenement_mre;
	
	@Column
	private String membre;

	public membreEntityDTO(Integer id_evenement_mre, String membre) {
		super();
		this.id_evenement_mre = id_evenement_mre;
		this.membre = membre;
	}
	
	public membreEntityDTO() {
		
	}

	public Integer getId_evenement_mre() {
		return id_evenement_mre;
	}

	public void setId_evenement_mre(Integer id_evenement_mre) {
		this.id_evenement_mre = id_evenement_mre;
	}

	public String getMembre() {
		return membre;
	}

	public void setMembre(String membre) {
		this.membre = membre;
	}
	
	
}
