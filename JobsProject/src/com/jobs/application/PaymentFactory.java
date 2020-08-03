package com.jobs.application;

import com.jobs.domain.Employee;
import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				//calculo el retorno tomando que cobra el salario - 15%
				return salaryPerMonth*0.85;
			}
		};
	}
	
	//Método para crear la Interfaz del ratio de pago de manager 
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {			
				//calculo el retorno tomando que cobra el salario +10%
				return salaryPerMonth*1.1;
			}
		};
	}
}
