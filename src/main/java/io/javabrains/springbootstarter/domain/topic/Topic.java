package io.javabrains.springbootstarter.domain.topic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Details about the topic")
public class Topic {

	@Id
	@ApiModelProperty(notes = "The unique id of the topic")
	private String id;

	@ApiModelProperty(notes = "the topic's name")
	private String name;

	@ApiModelProperty(notes = "the topic's description")
	private String description;

}
