package com.example.restservice.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class ChildItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String language;

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	@XmlAttribute
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "ChildItem [name=" + name + ", language=" + language + "]";
	}
	

}
