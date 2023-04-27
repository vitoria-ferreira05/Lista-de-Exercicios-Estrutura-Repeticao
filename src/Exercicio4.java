public class Exercicio4 {
    public static void main(String[] args) {
        //4. Imprimir todos os valores pares entre 1 (inclusive) e N (o valor de N é
        //de sua escolha). Considere que o N será sempre maior que ZERO

        int N = 20;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println("Os números pares entre 1 e N são: " + i);
            }
        }
    }
}