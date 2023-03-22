
import javax.swing.*;
public class Principal {
    public static void main(String[] args) {
    int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco: \n<1>Conta Corrente\n<2>Contapoupança\n<3>Sair\n"));
    int numero;
    double saldo,limite,rendimento;


    switch (opcao){
        case 1:

            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da Conta: "));
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Numero o Saldo: "));
            limite = Double.parseDouble(JOptionPane.showInputDialog("Limite: "));
            ContaCorrente cc1 = new ContaCorrente(numero,saldo,limite);
            JOptionPane.showMessageDialog(null,"Saldo: "+ cc1.getSaldo()+"\nSaldo com o Limite"+cc1.consultaSaldo(), "Conta corrente", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 2:
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da Conta: "));
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Numero o Saldo: "));
            rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento: "));
            ContaPoupaca cc2 = new ContaPoupaca(numero,saldo,rendimento);
            cc2.atualizarRendimento();
            JOptionPane.showMessageDialog(null,"Saldo: "+cc2.getSaldo(),"Conta corrente", JOptionPane.INFORMATION_MESSAGE);


            break;
        case 3:
            break;

        default:
            JOptionPane.showMessageDialog(null,"Escolha invalida","ERRO",JOptionPane.ERROR_MESSAGE);
    }
    }
}
