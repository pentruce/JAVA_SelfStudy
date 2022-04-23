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
		
		//DOM 서버용 팩토리 생성
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		
		try {
			docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(file);
			
			Element root = doc.getDocumentElement();
			
		//루트요소의 노드명을 가져온다.
		System.out.println("노드명: " + root.getNodeName());
		
		//루트요소의 자식노드를 가져온다.
		NodeList rootChildren = root.getChildNodes();
		
		System.out.println("자식 요소 수 :" + rootChildren.getLength());
		System.out.println("-------------");
		
		for(int i = 0; i < rootChildren.getLength(); i++) {
			//자식 노드 추출
			Node child = rootChildren.item(i);
			
			//요소 노드의 경우
			if(child.getNodeType() == Node.ELEMENT_NODE) {
				NodeList personChildren = child.getChildNodes();
				
				for (int j = 0; j < personChildren.getLength(); j++) {
					//뽑아낸 자식 노드에서 차례로 항목을 추출한다.
					Node personNode = personChildren.item(j);
					
					//노드명 취득
					String text = personChildren.item(j).getNodeName();
					
					if (personNode.getNodeType() == Node.ELEMENT_NODE) {
						//노드값 취득
						String value = personChildren.item(j).getTextContent().trim();
						
						if(text.equals("type")) {
							System.out.println("종류 : " + value);
						} else if (text.equals("name")) {
							System.out.println("이름: " + value);
						} 
					}
				}
				System.out.println("---------------");
			}	
		}
		
	 } catch (ParserConfigurationException pce) {
		 pce.printStackTrace();
	 } catch (SAXException se) {
		 //문법 오류 발생 시
		 se.printStackTrace();
	 } catch (IOException e) {
		 //파일 읽기 오류 발생시
		 e.printStackTrace();
	 }
	}
}
