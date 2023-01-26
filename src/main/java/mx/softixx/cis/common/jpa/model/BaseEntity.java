package mx.softixx.cis.common.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_gen")
	@Column(name = "id", nullable = false)
	protected Long id;

	/* Getters and Setters */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}