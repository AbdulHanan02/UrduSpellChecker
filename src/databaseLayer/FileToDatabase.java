package databaseLayer;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FileToDatabase {
	DatabaseAccess dataFill;
	
	public FileToDatabase() {
		dataFill = new DatabaseAccess();
	}

	public void readAllFile() {
		File path = new File("Files");
		File[] fileList = path.listFiles();
		for (File f : fileList) {
			this.readXMLFile(f,f.getName());
		}

	}

	public void readXMLFile(File openFile,String fname) {
		DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuild;
		
		try {
			dBuild = dbFact.newDocumentBuilder();
			Document doc = dBuild.parse(openFile);
			
			NodeList listNode = doc.getElementsByTagName("document");
			Node node = listNode.item(0);
			if(node.getNodeType()==node.ELEMENT_NODE) {
				Element useElement = (Element) node;
				dataFill.insertData(useElement.getElementsByTagName("name").item(0).getTextContent(),
				useElement.getElementsByTagName("title").item(0).getTextContent(),
				useElement.getElementsByTagName("section").item(0).getTextContent(),fname);
			}
			
		}

		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
