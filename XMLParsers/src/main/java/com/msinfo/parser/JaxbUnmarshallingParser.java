package com.msinfo.parser;

import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.msinfo.domain.EmployeeDTO;

public class JaxbUnmarshallingParser {

	public static void main(String[] args) throws FileNotFoundException {

		// Unmarshalling - Convert XML to Java object.
		EmployeeDTO empFromFile = jaxbXMLToObject();
		System.out.println(empFromFile.toString());

	}

	private static EmployeeDTO jaxbXMLToObject() {
		try {
			JAXBContext context = JAXBContext.newInstance(EmployeeDTO.class);
			Unmarshaller un = context.createUnmarshaller();
			EmployeeDTO emp = (EmployeeDTO) un
					.unmarshal(
					new File("E:\\Workspace\\Webservices\\XMLParsers\\src\\main\\resources\\Emp.xml"));
			return emp;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

}
