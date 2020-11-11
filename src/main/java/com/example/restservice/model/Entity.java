package com.example.restservice.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Entity implements Serializable{

	private static final long serialVersionUID = 1L;
	String countrycode;
	String regdate;

	@XmlElement(name = "id")
	private List<Participant> participant;

	@XmlElement(name = "name")
	private ChildItem childItem;

	public String getCountrycode() {
		return countrycode;
	}

	@XmlAttribute
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getRegdate() {
		return regdate;
	}

	@XmlElement
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public List<Participant> getParticipant() {
		return participant;
	}

	public ChildItem getChildItem() {
		return childItem;
	}

	@Override
	public String toString() {
		return "Entity [countrycode=" + countrycode + ", regdate=" + regdate + ", participant=" + participant
				+ ", childItem=" + childItem + "]";
	}

	
}



