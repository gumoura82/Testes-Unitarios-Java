package org.example;

public class CalcuTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();


        if (calc.soma(2, 3) == 5) {
            System.out.println("Teste de soma passou!");
        } else {
            System.out.println("Teste de soma falhou!");
        }


        if (calc.subtracao(5, 3) == 2) {
            System.out.println("Teste de subtração passou!");
        } else {
            System.out.println("Teste de subtração falhou!");
        }


        if (calc.multiplicacao(4, 2) == 8) {
            System.out.println("Teste de multiplicação passou!");
        } else {
            System.out.println("Teste de multiplicação falhou!");
        }
    }
}
