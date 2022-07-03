import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Integer.parseInt;

public class Cadastro {

    public static ArrayList novoCadastro(ArrayList listaContas) {

    Cliente newCliente = Cliente.novoCliente();

    String EntradaConta = JOptionPane.showInputDialog(null, "Qual tipo de Conta deseja criar para o Cliente ?:\n1 - Conta Corrente\n2 - Poupanca");

        try {
        int tipoConta = parseInt(EntradaConta);

        if(tipoConta == 1) {Conta CC = new ContaCorrente(newCliente, listaContas.size() + 1); listaContas.add(CC); return listaContas;}
        if(tipoConta == 2) {Conta POUPANCA = new ContaPoupanca(newCliente, listaContas.size() + 1); listaContas.add(POUPANCA); return listaContas;}

        } catch (Exception e) {
            System.out.println("Entrada inválida");
            System.exit(1);
        }

        return listaContas;

    }
}
