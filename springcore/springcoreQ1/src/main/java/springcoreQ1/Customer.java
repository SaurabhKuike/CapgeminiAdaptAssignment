package springcoreQ1;

public class Customer {
	private int customerid;
	private int customercontact;
	private String customername;
	private Address address;



	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getCustomercontact() {
		return customercontact;
	}

	public void setCustomercontact(int customercontact) {
		this.customercontact = customercontact;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "customer [id=" + customerid + ", name=" + customername + "customercontact="+customercontact+", address=" + address+ "]";
	}
}
