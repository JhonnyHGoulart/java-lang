package br.com.senai.javalang.test;

import br.com.senai.javalang.classes.Conta;
import br.com.senai.javalang.classes.ContaCorrente;
import br.com.senai.javalang.classes.ContaPoupanca;

public class ToStringTest {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 456);
        Conta contaPoupanca = new ContaPoupanca(456, 123);

        System.out.println(conta);
        System.out.println(contaPoupanca);
    }
}
