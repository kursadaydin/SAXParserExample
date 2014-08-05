import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class XMLParserSAX {

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {

		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		MyHandler handler = new MyHandler();
		saxParser.parse(new File("F:\\ANDROÝD\\android_exercises\\SAXParser\\"
				+ "employees.xml"), handler);
		List<Employee> empList = handler.getEmpList();
		for (Employee emp : empList)
			System.out.println(emp.getAge());

	}

}
