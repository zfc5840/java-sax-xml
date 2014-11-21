package com.sax.xml;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParseHandler extends DefaultHandler{
 
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("解析文档开始");
	}
	
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
       System.out.println("解析文档结束");		
	}
}
