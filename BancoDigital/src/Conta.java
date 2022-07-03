public abstract class Conta {

    protected static final int AGENCIA_PADRAO = 578;
    protected static int SEQUENCIAL;

    protected int agencia;
    protected int conta;
    protected double saldo = 0;
    protected Cliente cliente;

    protected String tipoConta;


    public void saque(double valorSaque){
        this.saldo = saldo - valorSaque;
    }

    public void deposito(double valorDeposito){
        this.saldo = saldo + valorDeposito;
    }

    public void transferir(double valorTransferido, Conta contaDestino){
        this.saque(valorTransferido);
        contaDestino.deposito(valorTransferido);
    }

     public void extrato() {
        System.out.println(" ===  Extrato Conta "+ this.tipoConta + " ===");
        System.out.println("Cliente:" + this.cliente.nome);
        System.out.println("Numero da conta: " + this.conta);
        System.out.println("Numero da agencia: " + this.agencia);
        System.out.println("Saldo em Conta: " + this.saldo);
        System.out.println("\n");
    }


    public double getSaldo(){
        return this.saldo;
    }

    public double getConta(){
        return this.conta;
    }

    public double getAgencia(){
        return this.agencia;
    }

    public Cliente getCliete(){
        return this.cliente;
    }

    public String getTipoConta() { return this.tipoConta; }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }


}
