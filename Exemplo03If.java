import javax.swing.JOptionPane;

public class Exemplo03If {

    public static void main(String[] args) {
        // ExemploIfBasico();
        //exemploIOperadorLogicaE();
        exemploIfOperadorLogicoOu();
    }

    public static void ExemploIfBasico() {

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Digite um numero. dica 437, 438, 439, outro"
            )
        );

        if (numero == 437) {
            JOptionPane.showMessageDialog(
                null,
                "Quatrocentos e trinta e sete"
            );

        } else if (numero == 438) {

            JOptionPane.showMessageDialog(
                null,
                "Quatrocentos e trinta e oito"
            );

        } else if (numero == 439) {

            JOptionPane.showMessageDialog(
                null,
                "Quatrocentos e trinta e nove"
            );

        } else {

            JOptionPane.showMessageDialog(
                null,
                "Outro numero"
            );
        }
    }

    public static void exemploIOperadorLogicaE() {

        // Permitir o usuario comprar ingresso do cinema se for menor de 18 anos

        int idade = 13;
        String tipoIngresso = "";
        double precoIngresso = 0;

        if (idade > 0 && idade < 18) {

            tipoIngresso = "Meia entrada";
            precoIngresso = 15;

        } else {

            tipoIngresso = "Inteiro";
            precoIngresso = 30;
        }

        JOptionPane.showMessageDialog(
            null,
            "Tipo do ingresso: " + tipoIngresso +
            "\nPreço: " + precoIngresso
        );
    }
    public static void exemploIfOperadorLogicoOu(){
        //Financiamento ou troca
        String desejaComprarImovel = JOptionPane.showInputDialog("Deseja comprar imovel?");

        if(desejaComprarImovel.equals("s") || desejaComprarImovel.equals("sim")){
            double valorImovel = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor do imovel")
            );
        }
    }
}