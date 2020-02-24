package com.Exception;

public class Registration {
	private String name;
	private String mailid;
	private String mobileno;
	private double toprice;
	public Registration(String name, String mailid, String mobileno, double toprice) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.mobileno = mobileno;
		this.toprice = toprice;
	}
	public String getName() {
		return name;
	}
	
	public String getMailid() {
		return mailid;
	}
	
	public String getMobileno() {
		return mobileno;
	}
	
	public double getToprice() {
		return toprice;
	}
	
	@Override
	public String toString() {
		return "Registration [name=" + name + ", mailid=" + mailid + ", mobileno=" + mobileno + ", toprice=" + toprice
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mailid == null) ? 0 : mailid.hashCode());
		result = prime * result + ((mobileno == null) ? 0 : mobileno.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(toprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		if (mailid == null) {
			if (other.mailid != null)
				return false;
		} else if (!mailid.equals(other.mailid))
			return false;
		if (mobileno == null) {
			if (other.mobileno != null)
				return false;
		} else if (!mobileno.equals(other.mobileno))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(toprice) != Double.doubleToLongBits(other.toprice))
			return false;
		return true;
	}


}
