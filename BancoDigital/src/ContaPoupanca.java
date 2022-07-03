public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente novoCliente, int numeroConta){

        super.agencia = Conta.AGENCIA_PADRAO;
        super.conta = numeroConta;
        super.cliente = novoCliente;
        super.tipoConta = "Poupanca";

    }


}
