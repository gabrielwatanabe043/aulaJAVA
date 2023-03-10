import java.util.Scanner;

public class Ativiade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroEscolhido, contador = 0, soma = 0;
        double media;
        numeroEscolhido = input.nextInt();
        while (numeroEscolhido != 0) {
            contador++;
            soma = soma + numeroEscolhido;
            numeroEscolhido = input.nextInt();
        }
        media = soma / contador;
        System.out.println("Media foi de " + media);
        input.close();
    }

}
