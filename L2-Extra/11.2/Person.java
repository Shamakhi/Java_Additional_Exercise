public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;


	public Person() {
		this("Unknown","Unknown","Unknown","Unknown");
	}


	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} 

	/** Return name */
	public String getName() {
		return name;
	}

	/** Return address */
	public String getAddress() {
		return address;
	}

	/** Return phone */
	public String getPhone() {
		return phone;
	}

	/** Return email */
	public String getEmail() {
		return email;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + 
				 "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}