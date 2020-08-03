package com.jobs.domain;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public abstract void pay();

	//sobre escribo el toString para que me salga en un formato m�s amigable
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("AbsStaffMember [id=");sb.append(id); 
		sb.append(", name="); sb.append(name);
		sb.append(", address="); sb.append(address);
		sb.append(", phone=");sb.append(phone);
		sb.append(", totalPaid=");sb.append(totalPaid);
		sb.append("]");
		return sb.toString();
	}
	
	
}
