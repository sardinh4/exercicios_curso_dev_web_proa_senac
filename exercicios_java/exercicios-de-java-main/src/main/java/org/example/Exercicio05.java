package org.example;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("5)Imprima os números de 1 a 10, mas pare o loop quando encontrar um número maior que 7.");
        for (int i = 1; i <=10 ; i++) {
            if (i > 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
