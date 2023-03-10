import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha número positivo");
        int escolhaNumero;
        int numerosPares = 0;
        escolhaNumero = input.nextInt();
        while (escolhaNumero < 0) {
            System.out.println("Número NEGATIVO, favor escolher um número positivo");
            escolhaNumero = input.nextInt();
        }
        for (int i = 0; i <= escolhaNumero; i++) {
            if (i % 2 == 0) {
                numerosPares = numerosPares + i;

            }
        }
        System.out.println("Soma foi de " + numerosPares);
        input.close();
    }

}
