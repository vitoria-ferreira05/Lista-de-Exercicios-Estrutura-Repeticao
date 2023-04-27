public class Exercicio2 {
    public static void main(String[] args) {
        //2. Faça um programa que mostre a tabuada a partir da sua escolha

        int tabuada;
        int numero = 2;

        int i = 0;

        System.out.println("TABUADA DE MULTIPLICAÇÃO POR 2: ");

        while (i <= 10) {
            tabuada = numero * i;

            System.out.println(+numero + "x" + +i + " = " + tabuada);

            i++;
        }
        System.out.println("FIM DA TABUADA!");
    }
}