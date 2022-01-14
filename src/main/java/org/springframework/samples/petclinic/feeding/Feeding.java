package org.springframework.samples.petclinic.feeding;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Pet;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="feeding")
public class Feeding extends BaseEntity{
    
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Positive
	@Column(name="weeks_duration")
    private double weeksDuration;
    
	@NotNull
	@ManyToOne
	@JoinColumn(name="pet_id")
	private Pet pet;   
	
	@ManyToOne
	@JoinColumn(name="fedding_type_id")
    private FeedingType feedingType;
}
