import javax.swing.JOptionPane;

public class Exemplo08TratamentoExecoes {
    public void executar() {
        exemploComWhile();
    }

    private void tratamentoErrosBasico() {

        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
            JOptionPane.showMessageDialog(null, "Numero: " + numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao tentar converter o numero 1");
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Obrigado!!!");
    }

    public void exemploComWhile(){
        for(int i =0; i<3; i++){
            double peso = 0;

            while (peso <= 0 || peso >= 400) {
                try{
                    peso = Double.parseDouble(
                        JOptionPane.showInputDialog("Peso: " + i).trim()
                        .replace(",", ".")
                    );
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Peso invalido");
                }
            }
        }
    }
}
