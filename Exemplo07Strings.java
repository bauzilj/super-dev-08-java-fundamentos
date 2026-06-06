import javax.swing.JOptionPane;

public class Exemplo07Strings {
    public void executar() {
        pegarParteString();
    }

    public void exemploRemoverEspacos() {
        String texto = " Aniversario do professor Francisco sem mensagem    ";

        String semEspacosComecoFim = texto.trim();

        JOptionPane.showMessageDialog(null, "Texto" + texto + "Texto sem espaços:" + semEspacosComecoFim);
    }

    private void substituir() {
        String texto = "Minha cassa eh amarelha";
        // Corrigir(substituir) palavras na String
        texto = texto
                .replace("cassa", "casa")
                .replace("eh", "é");
        JOptionPane.showMessageDialog(null, "Texto corrigido" + texto);
    }

    private void verificarComecaCom() {
        String produto = "iPad";

        if (produto.startsWith("iP") == true ||
                produto.startsWith("Mac") == true) {
            JOptionPane.showMessageDialog(null, "Produto Maca");
        } else {
            JOptionPane.showMessageDialog(null, "Outra empresa");
        }
    }

    private void verificarTerminaCom() {
        String empresa = "Batatinha do Lorenzo S.A.";

        String tipoEmpresa = "";

        if (empresa.endsWith("LTDA") == true) {
            tipoEmpresa = "Limitada";
        } else if (empresa.endsWith("S.A.")) {
            tipoEmpresa = "Sociedade Anonima";
        } else {
            tipoEmpresa = "MEI";
        }
        JOptionPane.showMessageDialog(null, "Empresa: " + tipoEmpresa);
    }

    private void tamanho() {
        String login = "joao_silva";

        if (login.length() >= 20) {
            JOptionPane.showMessageDialog(null, "Nome da empresa deve conter 20 caracteres");
        }
    }

    private void contemTexto() {
        String mensagem = "Joao Silva e Sousa";

        boolean ehBrasileiro;

        if (mensagem.contains("Silva")) {
            ehBrasileiro = true;
        } else {
            ehBrasileiro = false;
        }
        JOptionPane.showMessageDialog(null, "Brasileiro?" + ehBrasileiro);
    }

    private void exemploComparacao() {
        String login = "abacate";

        if (login.equals("ABACATE")) {
            JOptionPane.showMessageDialog(null, "É 'ABACATE' ");
        } else {
            JOptionPane.showMessageDialog(null, "Nao é 'ABACATE' ");
        }

        // Comparar ignorando se é maiusculo ou minusculo
        if (login.equalsIgnoreCase("ABACATE")) {
            JOptionPane.showMessageDialog(null, "É 'ABACATE' (foi ignorado maiusculo e minusculo)");
        } else {
            JOptionPane.showMessageDialog(null, "Nao é 'ABACATE' ");
        }
    }

    private void descobrirPosicao() {
        String nome = "Paçoca";
        int indicePosicaoC = nome.indexOf("ç");
        JOptionPane.showMessageDialog(null, "Nome " + nome + "\nPosicao: " + indicePosicaoC);
    }

    private void descobrirCaracter() {
        char caracter = 'B';

        int codigoAscii = (int) caracter;

        JOptionPane.showMessageDialog(null, "Caracter: " + caracter + "\nCodigo ascii: " + codigoAscii);
    }

    private void pegarCaracterDaString() {
        // Pegar o segundo caracter da string
        String mensagem = "oi";

        char segundoCaracter = mensagem.charAt(1);

        JOptionPane.showMessageDialog(null, "mendagem: " + mensagem + "\nSegundo carater:' " + segundoCaracter + " ' ");
    }

    private void divirString() {
        String palavraComposta = "beija-flor";

        String[] partes = palavraComposta.split("-");

        String parte1 = partes[0];
        String parte2 = partes[1];

        JOptionPane.showMessageDialog(null, "Palavra composta: " +
                palavraComposta + "\nQuantidade de partes: "
                + partes.length + "\nParte 1: " + parte1 +
                "\nParte 2: " + parte2);
    }

    private void pegarParteString() {
        String palavraComposta = "guarda-chuva";

        int indiceHifen = palavraComposta.indexOf("-");
        int tamanhoString = palavraComposta.length();

        String parte2 = palavraComposta.substring(indiceHifen + 1, tamanhoString);

        JOptionPane.showMessageDialog(null, "PalavraComposta: " +
                palavraComposta + "\nParte2:' " + parte2 + " ' ");
    }
}