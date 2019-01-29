package com.msinfo.parser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.msinfo.domain.EmployeeDTO;

public class JaxbMarshallingParser {

	public static void main(String[] args) throws FileNotFoundException {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setId(1);
		emp.setAge(25);
		emp.setName("Pankaj");
		emp.setGender("Male");
		emp.setRole("Developer");
		emp.setPassword("sensitive");

		// Marshalling - Convert Java object into XML
		jaxbObjectToXML(emp);
		
	}

	private static void jaxbObjectToXML(EmployeeDTO emp) throws FileNotFoundException {

		try {
			JAXBContext context = JAXBContext.newInstance(EmployeeDTO.class);
			Marshaller m = context.createMarshaller();
			// for pretty-print XML in JAXB
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Write to System.out for debugging
			// m.marshal(emp, System.out);

			// Write to File
			m.marshal(emp,
					new FileOutputStream
					("E:\\Workspace\\Webservices\\XMLParsers\\src\\main\\resources\\Emp.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
