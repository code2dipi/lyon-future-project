package com.example.restservice.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.example.restservice.model.Businesscard;
import com.example.restservice.model.Root;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllServices {
	
	private List<Businesscard> businesscards = new ArrayList<>();


	/**
	 * Task 1: getById
	 * Develop a service (method) for returning one entity from the dataset based on id. Id in the
	 * dataset is the value of the /root/businesscard/participant/@value. Format of the id is
	 * <ICD>:<business number>. E.g value="9908:918039899” means ICD 9908 (which is Norway)
	 * and 918039899 which is the enterprise number for a company called GULENG AS.
	 * Parameters:
	 * Input: 2 parameters ICD and enterprise number
	 * Output: Business card for the enterprise as a JSON.
	 *
	 * @param icd
	 * @return
	 */
	public Businesscard getById(String icd,String enterpriseNumber) {
		String input=icd+":"+enterpriseNumber;
		Businesscard businesscard =new Businesscard();
		loadData();
		for (Businesscard businesscardObject : businesscards) {
			if(businesscardObject.getParticipant().getValue().
					equalsIgnoreCase(input)){
				businesscard=businesscardObject;
			}
		}
		return businesscard;

	}

	/**
	 * Task 2: searchByName
	 * Develop a service (method) for retuning a list of entities from the dataset based on a name
	 * search. The service shall search in the dataset and return a list of matches. “Name” is located
	 * in the dataset at the element /root/businesscard/entity/name/@name. This service must do
	 * a wildcard search for names. E.g. if “CAR” is the input “SUPER CARS”, “CAR WASH” AND
	 * “CARLINGS” will result in a hit.
	 * Parameters:
	 * Input: Name to search for
	 * Output: JSON containing Name, Enterprise number and country code.
	 * @param name
	 * @return
	 */
	public List<Businesscard> searchByName(String name) {
		// TODO Auto-generated method stub
		List <Businesscard> businesscardList =new ArrayList<>();
		loadData();
		for (Businesscard businesscardObject : businesscards) {
			if(businesscardObject.getEntity().getChildItem().getName().
					contains(name)){
				businesscardList.add(businesscardObject);
			}
		}
		System.out.println("Non");
		return businesscardList;


	}

	/**
	 * /*Task 3: getByName
	 * 	A service similar to getById. This service shall return one business card from the dataset
	 * 	based on an exact match in the tag /root/businesscard/entity/name/@name
	 * 	Parameters:
	 * 	Input: Name to search for
	 * 	Output: JSON representing the value in one /root/businesscard/.

	 * @param name name as input
	 * @return
	 */
	public Businesscard getByName(String name) {
		Businesscard businesscard =new Businesscard();
		loadData();
		for (Businesscard businesscardObject : businesscards) {
			if(businesscardObject.getEntity().getChildItem().getName().
					equalsIgnoreCase(name)){
				businesscard=businesscardObject;
			}
		}
		return businesscard;
	}

	
	
	public Businesscard unmarshall() throws JAXBException, IOException {
		if(businesscards.isEmpty()) {
	    JAXBContext context = JAXBContext.newInstance(Root.class);
	    Root rootObject=(Root) context.createUnmarshaller()
	      .unmarshal(new File("directory-export-business-cards.xml"));
	    businesscards=rootObject.getBusinesscards();
		}
	    return (Businesscard) businesscards;
		
	}
	
	
	public void  loadData (){
		try {
			if(businesscards.isEmpty()){
				//File file = new File("peppol123.xml");
				File file = new File("directory-export-business-cards.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Root rootObject = (Root) jaxbUnmarshaller.unmarshal(file);
				businesscards=rootObject.getBusinesscards();
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}



}
