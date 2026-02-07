package exercicios;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "laranja";
        System.out.println();

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-dai...");
            case "marrom:":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "laranja":
                System.out.println("Sei o Heian Yodan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;

            default:
                //        System.out.println("Não sei nada");

        }
        System.out.println();
        System.out.println("Fim");
        System.out.println();

        int idade = 3;
        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe Andar");
            case 0:
                System.out.println("Sabe respirar");
            }
    }

}
