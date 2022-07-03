
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Banco  {

    String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public static Banco novoBanco(){

        Banco newBanco = new Banco();

        ArrayList<Conta>  listaContas = new ArrayList<>();

        String nomeBanco = JOptionPane.showInputDialog("Digite um novo nome para o seu banco: ");
        newBanco.setNome(nomeBanco);

        JFrame f = Jelementos.janela(newBanco);
        JLabel titulo = Jelementos.logo(newBanco);
        JLabel nomeAutor = Jelementos.autor();
        JButton bCadastro = Jelementos.cadastro();
        JButton bDeposito = Jelementos.deposito();
        JButton bSaque = Jelementos.saque();
        JButton bTransferencia = Jelementos.transfere();
        JButton bExtrato = Jelementos.folhaExtrato();

        JPanel panel1 = Jelementos.painel(bCadastro, bSaque, bDeposito, bTransferencia, bExtrato, titulo, nomeAutor);

        f.add(panel1);


        bCadastro.addActionListener(action -> {

            Cadastro.novoCadastro(listaContas);

            System.out.println("");
            System.out.println(newBanco.getNome());

                JOptionPane.showMessageDialog(null,
                        "\n\nConta: " + listaContas.get(listaContas.size() - 1).getTipoConta() +
                                "\nProprietario:  "+ listaContas.get(listaContas.size() - 1).getCliete().getNome()+
                                "\nNumero: " + listaContas.get(listaContas.size() - 1).getConta() +
                                "\nAgencia: " + listaContas.get(listaContas.size() - 1).getAgencia() +
                                "\n\nSaldo atual: R$ " + listaContas.get(listaContas.size() - 1).getSaldo() +
                                "\n\nCONTA CRIADA COM SUCESSO" +
                                "\n\n========================");
        });


        bDeposito.addActionListener(action -> {
            try {
            int numeroConta = parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));
            double valorParaDeposito = parseDouble(JOptionPane.showInputDialog("Qual valor você quer depositar?" +
                    "\n\nInformações" +
                    "\n\nProprietario:  "+ listaContas.get(numeroConta - 1).getCliete().getNome()+
                    "\nNumero: " + listaContas.get(numeroConta - 1).getConta() +
                    "\nAgencia: " + listaContas.get(numeroConta - 1).getAgencia() +
                    "\n\nSaldo atual: R$ " + listaContas.get(numeroConta - 1).getSaldo() +
                    "\n\n========================")) ;

            listaContas.get(numeroConta - 1).deposito(valorParaDeposito);

            JOptionPane.showMessageDialog(null,
                    "\n\nConta: " + listaContas.get(numeroConta - 1).getTipoConta() +
                            "\nProprietario:  "+ listaContas.get(numeroConta - 1).getCliete().getNome()+
                            "\nConta: " + listaContas.get(numeroConta - 1).getConta() +
                            "\nAgencia: " + listaContas.get(numeroConta - 1).getAgencia() +
                            "\n\nSaldo atual: R$ " + listaContas.get(numeroConta - 1).getSaldo() +
                            "\n\nDEPOSITO REALIZADO COM SUCESSO" +
                            "\nVALOR DEPOSITADO: R$ " + valorParaDeposito +
                            "\n\n========================"

            );


        } catch (Exception e) {
            System.out.println("Entrada inválida \nou não existem usuários cadastrados");
            System.exit(1);}
        }

        );


        bSaque.addActionListener(action -> {
                    try {
                        int numeroConta = parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));
                        double valorSaque = parseDouble(JOptionPane.showInputDialog("Qual valor você quer Sacar?" +
                                "\n\nInformações" +
                                "\nProprietario:  "+ listaContas.get(numeroConta - 1).getCliete().getNome()+
                                "\nNumero: " + listaContas.get(numeroConta - 1).getConta() +
                                "\nAgencia: " + listaContas.get(numeroConta - 1).getAgencia() +
                                "\n\nSaldo atual: R$ " + listaContas.get(numeroConta - 1).getSaldo() +
                                "\n\n========================")) ;

                        listaContas.get(numeroConta - 1).saque(valorSaque);
                        JOptionPane.showMessageDialog(null,
                                "\n\nConta: " + listaContas.get(numeroConta - 1).getTipoConta() +
                                        "\nProprietario:  "+ listaContas.get(numeroConta - 1).getCliete().getNome()+
                                        "\nConta: " + listaContas.get(numeroConta - 1).getConta() +
                                        "\nAgencia: " + listaContas.get(numeroConta - 1).getAgencia() +
                                        "\n\nSaldo atual: R$ " + listaContas.get(numeroConta - 1).getSaldo() +
                                        "\n\nSAQUE REALIZADO COM SUCESSO" +
                                        "\nVALOR SACADO: R$ " + valorSaque +
                                        "\n\n========================"

                        );

                    } catch (Exception e) {
                        System.out.println("Entrada inválida \nou não existem usuários cadastrados");
                        System.exit(1);}
                }
        );

        bTransferencia.addActionListener(action -> {
                    try {
                        int contaOrigem = parseInt(JOptionPane.showInputDialog("Qual o numero da sua conta?"));
                        int contaDestino = parseInt(JOptionPane.showInputDialog("Qual o numero da conta para depósito?"));

                        double valorTransferencia = parseDouble(JOptionPane.showInputDialog("Qual valor você quer transferir?" +
                                "\n\nSua conta" +
                                "\nProprietario:  "+ listaContas.get(contaOrigem - 1).getCliete().getNome()+
                                "\nConta: " + listaContas.get(contaOrigem  - 1).getConta() +
                                "\nAgencia: " + listaContas.get(contaOrigem  - 1).getAgencia() +
                                "\n\nSaldo atual: R$ " + listaContas.get(contaOrigem  - 1).getSaldo() + "\n\n========================" +

                                "\n\nConta de destino " +
                                "\nProprietario:  "+ listaContas.get(contaDestino - 1).getCliete().getNome()+
                                "\nConta: " + listaContas.get(contaDestino - 1).getConta() +
                                "\nAgencia: " + listaContas.get(contaDestino - 1).getAgencia() +
                                "\n\nSaldo atual: R$ " + listaContas.get(contaDestino - 1).getSaldo() + "\n\n========================"));

                        listaContas.get(contaOrigem - 1).transferir(valorTransferencia, listaContas.get(contaDestino - 1));

                        JOptionPane.showMessageDialog(null,
                                "\n\nTRANSFERENCIA DE R$ " + valorTransferencia + " PARA:\n\n"
                                        + listaContas.get(contaDestino - 1).getCliete().getNome() +
                                        "\n\nREALIZADACOM SUCESSO!" +
                                        "\nVALOR TRANSFERIDO: R$ " + valorTransferencia +
                                        "\n\n====================================="

                        );


                    } catch (Exception e) {
                        System.out.println("Entrada inválida \nou não existem usuários cadastrados");
                        System.exit(1);}
                }
        );

        bExtrato.addActionListener(action -> {
                    try {
                        int numeroConta = parseInt(JOptionPane.showInputDialog("Qual o numero da conta?"));

                        JOptionPane.showMessageDialog(null,
                                "\n\nConta: " + listaContas.get(numeroConta - 1).getTipoConta() +
                                        "\nProprietario:  "+ listaContas.get(numeroConta - 1).getCliete().getNome()+
                                        "\nConta: " + listaContas.get(numeroConta - 1).getConta() +
                                        "\nAgencia: " + listaContas.get(numeroConta - 1).getAgencia() +
                                        "\n\nSaldo atual: R$ " + listaContas.get(numeroConta - 1).getSaldo() +
                                        "\n\n========================");

                    } catch (Exception e) {
                        System.out.println("Entrada inválida \nou não existem usuários cadastrados");
                        System.exit(1);}
                }

        );


        return newBanco;
    }

}
