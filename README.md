# Lyon-future-project

Documentation:

Step 1 : download project or clone 

Step 2 : unzip file 

Step 3 : run mvn install command in project directory  

step 4 : download and import large xml file(https://directory.peppol.eu/public) in project directory 

step 5 : run the application 

-------------
# Api service 1 : getById

URL : http://localhost:8080/lyon/getById?icd=9956&enterpriseNumber=0753376927

Response :
{"participant":{"scheme":"iso6523-actorid-upis","value":"9956:0753376927"},"entity":{"countrycode":"BE","regdate":"2020-10-11","participant":[{"scheme":"CBE","value":"0753376927"},{"scheme":"VAT","value":"be0753376927"}],"childItem":{"name":"TSM VITSE","language":"nl"}}}

----------------------------------
# Api service 2 : searchByName

URL: http://localhost:8080/lyon/searchByName?name=Electrony Oy

Response list:

[{"participant":{"scheme":"iso6523-actorid-upis","value":"0037:003730874788"},"entity":{"countrycode":"FI","regdate":"2020-10-11","participant":null,"childItem":{"name":"Electrony Oy","language":null}}}]

----------------------------------
# Api service 3 : getByName 

URL:  http://localhost:8080/lyon/getByName?name=Z.P.H.U. Fortronik

response : {"participant":{"scheme":"iso6523-actorid-upis","value":"9945:6781017144"},"entity":{"countrycode":"PL","regdate":"2020-10-12","participant":null,"childItem":{"name":"Z.P.H.U. Fortronik","language":null}}}

----------------------------------
