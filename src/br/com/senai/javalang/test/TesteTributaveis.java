package br.com.senai.javalang.test;

import br.com.senai.javalang.classes.CalculadorDeImposto;
import br.com.senai.javalang.classes.ContaCorrente;
import br.com.senai.javalang.classes.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
