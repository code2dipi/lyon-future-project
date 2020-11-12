package com.example.restservice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Root implements Serializable {
	private static final long serialVersionUID = 1L;
	String version;
	String creationdt;
	String xmlns;

	public String getXmlns() {
		return xmlns;
	}

	@XmlAttribute(name = "xmlns")
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public String getCreationdt() {
		return creationdt;
	}

	@XmlAttribute(name = "creationdt")
	public void setCreationdt(String creationdt) {
		this.creationdt = creationdt;
	}

	@XmlAttribute(name = "version")
	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	@XmlElement(name = "businesscard")
	public List<Businesscard> businesscards =null;

	public List<Businesscard> getBusinesscards() {
		return businesscards;
	}

	

}