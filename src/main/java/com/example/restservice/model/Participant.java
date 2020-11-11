package com.example.restservice.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Participant implements Serializable {

	private static final long serialVersionUID = 1L;
	String scheme;
	String value;

	public String getScheme() {
		return scheme;
	}

	@XmlAttribute
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getValue() {
		return value;
	}

	@XmlAttribute
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Participant [scheme=" + scheme + ", value=" + value + "]";
	}

}
