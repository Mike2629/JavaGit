package maps;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbMain1 {
	public static void main(String[] args){
		Customer c = new Customer();
		c.setName("John Snow");
		c.getAddresses().put("Shipping", new Address("Scheepswerf","Amsterdam",3444));
		c.getAddresses().put("Billing", new Address("Budapestlaan","IJsselstein",2314));
		c.setDateOfBirth(new Date());
		
		try {

			File file = new File("D:\\customer_address_map.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(c, file);
			jaxbMarshaller.marshal(c, System.out);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }

		}
}
