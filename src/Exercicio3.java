public class Exercicio3 {
    public static void main(String[] args) {
        //3. Escreva um algoritmo para imprimir os 10 primeiros números inteiros
        //maiores que 100

        int numero = 110;

        int i = 100;

        do {
            System.out.println("10 primeiros números maiores que 100: " + i);
            i++;

        } while (numero >= i);
        System.out.println("FIM");
    }
}