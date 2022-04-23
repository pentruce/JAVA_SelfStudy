package Xml;
//kopo_15
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

public class Readxml {

	public static void main(String[] args) {
		File file = new File("***.xml");
		
		//DOM ������ ���丮 ����
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		
		try {
			docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(file);
			
			Element root = doc.getDocumentElement();
			
		//��Ʈ����� ������ �����´�.
		System.out.println("����: " + root.getNodeName());
		
		//��Ʈ����� �ڽĳ�带 �����´�.
		NodeList rootChildren = root.getChildNodes();
		
		System.out.println("�ڽ� ��� �� :" + rootChildren.getLength());
		System.out.println("-------------");
		
		for(int i = 0; i < rootChildren.getLength(); i++) {
			//�ڽ� ��� ����
			Node child = rootChildren.item(i);
			
			//��� ����� ���
			if(child.getNodeType() == Node.ELEMENT_NODE) {
				NodeList personChildren = child.getChildNodes();
				
				for (int j = 0; j < personChildren.getLength(); j++) {
					//�̾Ƴ� �ڽ� ��忡�� ���ʷ� �׸��� �����Ѵ�.
					Node personNode = personChildren.item(j);
					
					//���� ���
					String text = personChildren.item(j).getNodeName();
					
					if (personNode.getNodeType() == Node.ELEMENT_NODE) {
						//��尪 ���
						String value = personChildren.item(j).getTextContent().trim();
						
						if(text.equals("type")) {
							System.out.println("���� : " + value);
						} else if (text.equals("name")) {
							System.out.println("�̸�: " + value);
						} 
					}
				}
				System.out.println("---------------");
			}	
		}
		
	 } catch (ParserConfigurationException pce) {
		 pce.printStackTrace();
	 } catch (SAXException se) {
		 //���� ���� �߻� ��
		 se.printStackTrace();
	 } catch (IOException e) {
		 //���� �б� ���� �߻���
		 e.printStackTrace();
	 }
	}
}
