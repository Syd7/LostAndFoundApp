package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class Student {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	private Long studentID;
	
	@NotNull
	@Column
	private String name;

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long id) {
		this.studentID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
