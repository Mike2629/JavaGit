package maps;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbMain2 {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\customer_address_map.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);
		
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
