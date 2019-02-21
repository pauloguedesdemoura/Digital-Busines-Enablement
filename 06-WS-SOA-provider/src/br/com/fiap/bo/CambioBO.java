package br.com.fiap.bo;

public class CambioBO {

	public double convertRealDolar(double real) {
		
		return real/3.73;
	}
	
	public double converteDolarReal(double dolar) {
		return dolar/0.272;
		
	}
	
	public double converteBitcoiReal(double bitcoin) {
		return bitcoin*14600;
		
		
	}
	
}
