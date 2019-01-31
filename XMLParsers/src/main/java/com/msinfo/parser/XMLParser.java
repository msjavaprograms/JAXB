package com.msinfo.parser;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser
{
	public static void main( String[] args ) throws ParserConfigurationException, SAXException, IOException
	{
		//DocumentBuilderFactory - DocumentBuilder -Document - NodeList - Node - Element 
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document;
		
		document = documentBuilder.parse(new 
				File("E:\\Workspace\\Webservices\\XMLParsers\\src\\main\\resources\\Employee.xml"));
		
		document.getDocumentElement().normalize();
		
		Element documentElement = document.getDocumentElement();
		System.out.println("Root Element : " + documentElement.getNodeName());

		NodeList nList = documentElement.getElementsByTagName("employee");
		
		System.out.println("Child Elements");
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
			Node node = nList.item(temp);
			Element element = (Element) node;
			System.out.println(element.getAttribute("id"));
			System.out.println(element.getElementsByTagName("firstName").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("lastName").item(0).getTextContent());		
	
		}
	}
}
