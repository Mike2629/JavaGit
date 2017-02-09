package maps;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private String Name;
	private Date DateOfBirth;
	private Map<String,Address> addresses = new HashMap<String,Address>();
	
	public String getName() {
		return Name;
	}
	
	@XmlAttribute
	public void setName(String name) {
		Name = name;
	}
	
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	
	@XmlAttribute
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
		
	public Map<String,Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Map<String,Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", DateOfBirth=" + DateOfBirth + ", addresses=" + addresses + "]";
	}
	
}
