package opdr1;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbMain1 {
	public static void main(String[] args){
		Customer c = new Customer();
		c.setName("John");
		c.setAddress(new Address("Ijsselstein","Dreesplein",1234));
		c.setDateOfBirth(new Date());
		
		try {

			File file = new File("D:\\XMLFILE.xml");
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
