package org.example;

public class Exercicio01 {
    public static void main(String[] args) {
    System.out.println("1)Imprima os números de 1 a 10, mas pare a execução do loop quando chegar a 5. ");
        for (int i = 1; i <11; i++) {
            System.out.println(i);
            if (i == 5) {
            break;
            }
        }
    }
}
