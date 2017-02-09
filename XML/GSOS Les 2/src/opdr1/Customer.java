package opdr1;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private String Name;
	private Date DateOfBirth;
	private Address address;
	
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
	
	public Address getAddress() {
		return address;
	}
	
	@XmlElement
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", DateOfBirth=" + DateOfBirth + ", address=" + address + "]";
	}
}
