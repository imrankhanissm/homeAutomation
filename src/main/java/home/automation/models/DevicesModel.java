package home.automation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DevicesModel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String name;

	@Column
	private Boolean status;

	@Column
	private Boolean switchPosition;


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isStatus() {
		return this.status;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean isSwitchPosition() {
		return this.switchPosition;
	}

	public Boolean getSwitchPosition() {
		return this.switchPosition;
	}

	public void setSwitchPosition(Boolean switchPosition) {
		this.switchPosition = switchPosition;
	}	
}