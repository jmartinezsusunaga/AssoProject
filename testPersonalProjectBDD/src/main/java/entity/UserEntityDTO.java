package entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*le Schema name la pluspart de fois est public comme valeur*/
@Entity
@Table(name =  "test", schema = "public")
public class UserEntityDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_test;
	
	@Column
	private String tes_name_t;
	
	@Column
	private Date test_date_t;

	public UserEntityDTO(Integer id_test, String tes_name_t, Date test_date_t) {
		this.id_test = id_test;
		this.tes_name_t = tes_name_t;
		this.test_date_t = test_date_t;
	}
	
	public UserEntityDTO() {
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
