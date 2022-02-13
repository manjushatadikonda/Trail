import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLFileReader
{

	public static void main(String[] args) {
		try{
			String filePath = "C:\\Users\\saita\\Downloads\\advertising.xml";
			File file = new File(filePath);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbf.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			//doc.getDocumentElement().normalize();
			System.out.println(doc.getDocumentElement().getNodeName());
			
			NodeList nodeList1 = doc.getElementsByTagName("mediawiki");
			Node node = nodeList1.item(0);
			System.out.println(node.getTextContent());
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
