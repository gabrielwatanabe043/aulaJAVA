import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sobrenome;
        String nomeCompleto;
        int contador = 0;
        System.out.println("Digite seu sobrenome");
        sobrenome = input.nextLine();
        nomeCompleto = input.nextLine();
        while (!nomeCompleto.equalsIgnoreCase("fim")) {
            if (nomeCompleto.contains(sobrenome)) {
                contador++;
            }
            nomeCompleto = input.nextLine();
        }
        System.out.println(contador + " pessoas possui o sobrenome informado");

        input.close();
    }

}
