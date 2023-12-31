package service;

import exceptions.SaldoNegativoException;

public class CuentaBancariaLimite extends CuentaBancaria{
	private double limite;

	public CuentaBancariaLimite(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	
	public void ajustarLimite() {
		limite=getSaldo()/2;
	}

	@Override
	public void extraer(double cantidad) throws SaldoNegativoException{
		if(cantidad<=limite) {
			super.extraer(cantidad);
		}else {
			super.extraer(limite);
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
}
