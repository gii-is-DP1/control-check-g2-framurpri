package org.springframework.samples.petclinic.feeding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "feeding_type")
public class FeedingType extends BaseEntity{
    
	@Column(name="name", unique=true)
	@Size(min=5, max=30)
	@NotEmpty
	private String name;
    
	@Column(name="description")
	@NotEmpty
	private String description;
    
	@NotNull	
	@ManyToOne
	@JoinColumn(name = "pet_type_id")
	private PetType petType;
}
