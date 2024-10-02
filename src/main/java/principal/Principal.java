package principal;

import javax.swing.JOptionPane;
import model.Veiculo;

public class Principal {

    public static void main(String[] args) {

//Declara e instância o objeto
        Veiculo veic = new Veiculo();
//Entrada
        veic.setQuilometros(Double.parseDouble(JOptionPane.showInputDialog("Digite os quilômetros percorridos: ")));
        veic.setLitros(Double.parseDouble(JOptionPane.showInputDialog("Digite os litros gastos de combustível: ")));
//Saída
        JOptionPane.showMessageDialog(null, "O consumo de combustível foi: " + veic.getConsumo() + " Km/l");
    }
}
