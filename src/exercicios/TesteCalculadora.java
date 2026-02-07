package exercicios;

import javax.swing.*;

public class TesteCalculadora {

    public static void main(String[] args) {

while(true) {

        String num1 = JOptionPane.showInputDialog("Insira o primeiro número");
        double numero1 = Double.parseDouble(num1.replace(",", "."));

        String num2 = JOptionPane.showInputDialog("Insira o segundo numero");
        double numero2 = Double.parseDouble(num2.replace(",","."));



        String operacao = JOptionPane.showInputDialog(
                "Escolha a operação:\n" +
                        "+  Soma\n" +
                        "-  Subtração\n" +
                        "*  Multiplicação\n" +
                        "/  Divisão")
                ;



        double resultado =0;
        boolean operacaoValida = true;

        //Processa a operação

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 == 0){
                    JOptionPane.showMessageDialog(
                            null, "Erro divisão por zero!");
                            operacaoValida =false;
                }  else{
                        resultado = numero1 / numero2 ;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação Inválida!");
                operacaoValida = false;
            }
            if(operacaoValida) {
                JOptionPane.showMessageDialog(
                        null,
                        "Resultado:\n" +
                                numero1 + " " + operacao + " " + numero2 + " = " + resultado
                );

            }
    // Pergunta se quer continuar
    int opcao = JOptionPane.showConfirmDialog(
            null,
            "Deseja realizar outro cálculo?",
            "Continuar?",
            JOptionPane.YES_NO_OPTION
    );

    if (opcao != JOptionPane.YES_OPTION) {
        break; // sai do laço
    }
}

        JOptionPane.showMessageDialog(null, "Calculadora encerrada!");
        }

}

