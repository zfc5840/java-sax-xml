package com.sax.xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxDemo {
	public static void main(String[] args){
		SAXParserFactory factory = SAXParserFactory.newInstance();  
        SAXParser parser;
        SaxParseHandler handler = new SaxParseHandler();  
        try {
        	parser = factory.newSAXParser();
			parser.parse("books.xml", handler);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}  
	}
}
