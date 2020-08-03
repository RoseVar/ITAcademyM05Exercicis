package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	//Añadimos una variable propia de esta clase hija, ya que en el codigo que viene sale en el constructor
	protected String description; 
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		//El constructor de la clase padre ya guarda todos los datos comunes 
		//añadimos que guarde el propio de los voluntarios
		this.description= description;		
	}

	//creo otro constructor ya que en el main en controller se crean voluntarios sin el parámetro descripción
	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
	}
	
	@Override
	public void pay() {
		//Su pago es 0
		totalPaid=0;		
	}

}
