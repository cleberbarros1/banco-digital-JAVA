public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente novoCliente, int numeroConta){

        super.agencia = Conta.AGENCIA_PADRAO;
        super.conta =  numeroConta;
        super.cliente = novoCliente;
        super.tipoConta = "Conta Corrente";

    }


}
