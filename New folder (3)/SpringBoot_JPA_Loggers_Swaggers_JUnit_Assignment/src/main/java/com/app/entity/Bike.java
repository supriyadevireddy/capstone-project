package com.app.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="bike_tab")
public class Bike {
	public Bike(int i, String string, String string2, String string3) {
	}
	@Id
	@Column(name="b_id")
	@ApiModelProperty(value="id to identify bikes uniquely")
	@NotNull(message="Bike id is mandatory")
	private int id;
	@Column(name="b_name")
	@ApiModelProperty(value="name of the bike")
	@NotNull(message="Bike name is mandatory")
	private String name;
	@Column(name="b_location")
	@ApiModelProperty(value="where bike is located")
	private String location;
	@Column(name="b_city")
	@ApiModelProperty(value="city in which bike is located")
	private String city;
	public Object[] getId() {
		return null;
	}
}
