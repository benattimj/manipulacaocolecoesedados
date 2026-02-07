package exercicios;

import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Diigite o primeiro número:");

        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número:"
        );

        System.out.println(valor1 + " " + valor2);

        double numero1 = Double.parseDouble(valor1.replace(",", "."));
        double numero2 = Double.parseDouble(valor2.replace("," , "."));

        double soma = numero1 + numero2;
        System.out.println(soma);


    }
}
