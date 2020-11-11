package com.example.restservice.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Businesscard  implements Serializable{

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "participant")
	public Participant participant;

	@XmlElement(name = "entity")
	public Entity entity;

	public Participant getParticipant() {
		return participant;
	}

	public Entity getEntity() {
		return entity;
	}

	@Override
	public String toString() {
		return "Businesscard [participant=" + participant + ", entity=" + entity + "]";
	}

}