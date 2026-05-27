import javax.swing.JOptionPane;
public class Exemplo04JOptionPane {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome");

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço").replace(",",  "."));

        double total = quantidade * preco;

        boolean pagou = Boolean.parseBoolean(JOptionPane.showInputDialog("Pagou? [true/false]"));

        JOptionPane.showMessageDialog(null, 
        "Nome digitado: " + nome + 
        "\nQuantidade: " + quantidade +
        "\nPreco: " + preco
        "\nTotal: " + total +
        "\nPagou: " + pagou);
    }
}
