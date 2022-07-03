import javax.swing.*;

public class Cliente {

    public String nome;

    public Cliente(String novoNome){
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }


    public static Cliente novoCliente() {

        String novoCliente = JOptionPane.showInputDialog(null,"Digite o nome do novo cliente: ");

        Cliente cliente = new Cliente(novoCliente);

        return cliente;

    }



}
