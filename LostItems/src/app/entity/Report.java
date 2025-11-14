package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class Report {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	private Long id;
	
	@NotNull
	@Column
	private String item_name;
	
	@NotNull
	@Column
	private String location;
	
	@NotNull
	@Column
	private String faculty_name;
	
	@NotNull
	@Column
	private String student_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFaculty_name() {
		return faculty_name;
	}

	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	
}
