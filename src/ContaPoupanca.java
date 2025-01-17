public class ContaPoupanca extends  Conta{
    private float saldoPoupanca;

    public ContaPoupanca(String agencia, String numero, float saldo, float saldoPoupanca) {
        super(agencia, numero, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public float getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(float saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public void saque(float valor){
        if(getSaldo() + saldoPoupanca < valor){
            System.out.println("Saldo é insuficiente");
        } else {
            if(getSaldo() < valor){
                valor -= getSaldo();
                setSaldo(0);
                saldoPoupanca -= valor;
            } else {
                setSaldo(getSaldo() - valor);
            }
            System.out.println("Saque efetuado com sucesso!");
        }
    }
}
