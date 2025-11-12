package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	private Long facultyID;
	
	@NotNull
	@Column
	private String name;

	public Long getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(Long facultyID) {
		this.facultyID = facultyID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
