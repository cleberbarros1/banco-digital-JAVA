import javax.swing.*;
import java.awt.*;
public class Jelementos {

    public static JFrame janela(Banco newBanco) {

        JFrame frame = new JFrame("Bem vindo ao " + newBanco.nome);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);

        return frame;
    }

    public static JLabel logo(Banco newBanco) {

        JLabel logo = new JLabel();

        logo.setText("Bem vindo ao " + newBanco.nome);
        logo.setBounds(160, 230, 550, 50);
        logo.setFont(new Font("Calibri", Font.BOLD, 50));
        logo.setForeground(Color.black);
        logo.setHorizontalTextPosition(JLabel.CENTER);

        return logo;

    }

    public static JLabel autor() {

        JLabel nomeAutor = new JLabel();

        nomeAutor.setText("Feito por Cleber Barros - 2022");
        nomeAutor.setBounds(270, 280, 300, 50);
        nomeAutor.setFont(new Font("Calibri", Font.BOLD, 20));
        nomeAutor.setForeground(Color.black);
        nomeAutor.setHorizontalTextPosition(JLabel.CENTER);

        return nomeAutor;

    }

    public static JButton cadastro() {

    JButton bCadastro = new JButton("Cadastrar Novo Cliente");
        bCadastro.setBounds(150,430, 500, 50);
        bCadastro.setFont(new Font("Calibri", Font.BOLD, 34));
        bCadastro.setBorderPainted(false);

        return bCadastro;
    }


    public static JButton deposito() {

        JButton bDeposito = new JButton("Deposito");
        bDeposito.setBounds(640, 20, 130, 30);
        bDeposito.setBorderPainted(false);
        bDeposito.setForeground(Color.black);
        bDeposito.setFont(new Font("Calibri", Font.BOLD, 16));
        bDeposito.setBorderPainted(false);

        return bDeposito;
    }

    public static JButton saque() {
        JButton bSaque = new JButton("Saque");
        bSaque.setBounds(640, 60, 130, 30);
        bSaque.setForeground(Color.black);
        bSaque.setFont(new Font("Calibri", Font.BOLD, 16));
        bSaque.setBorderPainted(false);

        return bSaque;

    }

    public static JButton transfere() {
    JButton bTransferencia = new JButton("Transferencia");
        bTransferencia.setBounds(640,100, 130, 30);
        bTransferencia.setBorderPainted(false);
        bTransferencia.setForeground(Color.black);
        bTransferencia.setFont(new Font("Calibri", Font.BOLD, 16));
        bTransferencia.setBorderPainted(false);

        return bTransferencia;
    }

    public static JButton folhaExtrato() {
        JButton bExtrato = new JButton("Extrato");
        bExtrato.setBounds(640,140, 130, 30);
        bExtrato.setBorderPainted(false);
        bExtrato.setForeground(Color.black);
        bExtrato.setFont(new Font("Calibri", Font.BOLD, 16));
        bExtrato.setBorderPainted(false);

        return bExtrato;
    }

    public static JPanel painel(JButton bCadastro, JButton bSaque, JButton bDeposito, JButton bTransferencia, JButton bExtrato, JLabel titulo, JLabel nomeAutor) {

    JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 800, 600);
        panel1.setBackground(Color.white);
        panel1.setLayout(null);

        panel1.add(bCadastro);
        panel1.add(bSaque);
        panel1.add(bDeposito);
        panel1.add(bTransferencia);
        panel1.add(bExtrato);
        panel1.add(titulo);
        panel1.add(nomeAutor);

        return panel1;

    }


}
