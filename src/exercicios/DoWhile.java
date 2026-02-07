package exercicios;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do{
            System.out.println("Digite sair pra sair ");
            System.out.println("Quer sair ");
            texto = entrada.nextLine();

        } while(!texto.equalsIgnoreCase("sair")
        );

        System.out.println("Obrigado!");
        entrada.close();
    }
}
