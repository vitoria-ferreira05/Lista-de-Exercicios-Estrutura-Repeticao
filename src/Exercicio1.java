public class Exercicio1 {
    public static void main(String[] args) {

        //1. Faça um programa que mostra os números pares até 100

        int numeroPar = 100;

        System.out.println("NÚMEROS PARES ATÉ 100");

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println("Os números pares são: " + i);
            }
        }
    }
}